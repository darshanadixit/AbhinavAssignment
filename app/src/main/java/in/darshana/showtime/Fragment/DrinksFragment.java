package in.darshana.showtime.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import in.darshana.showtime.Adapter.DrinksAdapter;
import in.darshana.showtime.Model.ResponseDrinkDetails;
import in.darshana.showtime.NetworkCalls.NetworkCall;
import in.darshana.showtime.NetworkCalls.RequestNotifier;
import in.darshana.showtime.R;
import in.darshana.showtime.Utils.PreferenceManager;
import in.darshana.showtime.Utils.ProgressView;
import retrofit2.Response;

public class DrinksFragment extends Fragment implements RequestNotifier {
    private String TAG = DrinksFragment.class.getSimpleName();
    private Context mContext;
    private NetworkCall networkCall;
    private PreferenceManager preference_manager;
    private RecyclerView mRecyclerViewDrinks;
    DrinksAdapter mDrinksAdapter;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_drink_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mContext = getContext();
        networkCall = new NetworkCall(mContext,this);
        preference_manager = new PreferenceManager(mContext);
        initView(view);
    }

    private void initView(View view) {
        mRecyclerViewDrinks = view.findViewById(R.id.recyclerviewDrink);

        getDrinksList();
    }

    private void getDrinksList() {
        networkCall.getAllDrinkList();
    }

    @Override
    public void notifySuccess(Response<?> response) {
        if(response.body() instanceof ResponseDrinkDetails){
            ProgressView.dismiss();
            ResponseDrinkDetails responseDrinkDetails = (ResponseDrinkDetails) response.body();
                List<ResponseDrinkDetails.DrinksItem> drinksItemList = responseDrinkDetails.getDrinks();
                buildRecyclerView(drinksItemList);


        }
    }

    private void buildRecyclerView(List<ResponseDrinkDetails.DrinksItem> drinksItemList) {
        mDrinksAdapter = new DrinksAdapter(drinksItemList,mContext);
        mRecyclerViewDrinks.setAdapter(mDrinksAdapter);
        mRecyclerViewDrinks.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.ViewHolder viewHolder, @NonNull @NotNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull @NotNull RecyclerView.ViewHolder viewHolder, int direction) {
                ResponseDrinkDetails.DrinksItem deletedDrinks = drinksItemList.get(viewHolder.getAdapterPosition());
                int position = viewHolder.getAdapterPosition();

                drinksItemList.remove(viewHolder.getAdapterPosition());

                mDrinksAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());

                Snackbar.make(mRecyclerViewDrinks,deletedDrinks.getStrDrink()+" is removed",Snackbar.LENGTH_LONG)
                        .setAction("Undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                drinksItemList.add(position,deletedDrinks);
                                mDrinksAdapter.notifyItemInserted(position);
                            }
                        }).show();
            }
        }).attachToRecyclerView(mRecyclerViewDrinks);
    }

    @Override
    public void notifyNoInternet() {
        ProgressView.dismiss();
        Toast.makeText(mContext, "No Internet!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void notifyError(Throwable throwable) {
        ProgressView.dismiss();
        Log.d(TAG, "notifyError: throwable--->" + throwable.getMessage());
        Toast.makeText(mContext, throwable.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void notifyString(String s) {
        ProgressView.dismiss();
        Toast.makeText(mContext, s, Toast.LENGTH_SHORT).show();
    }
}
