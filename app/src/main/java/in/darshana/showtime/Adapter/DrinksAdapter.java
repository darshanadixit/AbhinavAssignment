package in.darshana.showtime.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import in.darshana.showtime.Model.ResponseDrinkDetails;
import in.darshana.showtime.R;

public class DrinksAdapter extends RecyclerView.Adapter<DrinksAdapter.ViewHolder> {
    private List<ResponseDrinkDetails.DrinksItem> mDrinksItemList;
    private Context mContext;

    public DrinksAdapter(List<ResponseDrinkDetails.DrinksItem> mDrinksItemList, Context mContext) {
        this.mDrinksItemList = mDrinksItemList;
        this.mContext = mContext;
    }

    @NonNull
    @NotNull
    @Override
    public DrinksAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.drinks_layout, parent, false);
        return new DrinksAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DrinksAdapter.ViewHolder holder, int position) {
        ResponseDrinkDetails.DrinksItem mDrinksItem = mDrinksItemList.get(position);
        holder.mTxtDrink.setText(mDrinksItem.getStrDrink());
        holder.mTxtCategory.setText(mDrinksItem.getStrCategory());
        holder.mTxtGlass.setText(mDrinksItem.getStrGlass());
        holder.mTxtInstruction.setText(mDrinksItem.getStrInstructions());

        Glide.with(mContext)
                .load(mDrinksItem.getStrDrinkThumb())
                .apply(new RequestOptions()
                        .placeholder(R.mipmap.ic_launcher)
                        .error(R.mipmap.ic_launcher))
                .into(holder.mThumbImage);
    }

    @Override
    public int getItemCount() {
        return mDrinksItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTxtDrink,mTxtCategory,mTxtGlass,mTxtInstruction;
        ImageView mThumbImage;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            mTxtDrink = itemView.findViewById(R.id.txtDrinkName);
            mTxtCategory = itemView.findViewById(R.id.txtCategory);
            mTxtGlass = itemView.findViewById(R.id.txtGlass);
            mTxtInstruction = itemView.findViewById(R.id.txtInstruct);
            mThumbImage = itemView.findViewById(R.id.ivThumbImage);
        }
    }
}
