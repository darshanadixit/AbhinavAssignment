package in.darshana.showtime.NetworkCalls;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import in.darshana.showtime.Model.ResponseDrinkDetails;
import in.darshana.showtime.Utils.PreferenceManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NetworkCall {
    PreferenceManager preference_manager;
    private Activity mActivity;
    private Context mContext;
    private RequestNotifier mNotifier;
    private ConnectivityManager connectivityManager;
    private NetworkInfo activeNetworkInfo;

    public NetworkCall(Context mContext1, RequestNotifier mNotifier1) {
        this.mContext = mContext1;
        this.mNotifier = mNotifier1;

        preference_manager = new PreferenceManager(mContext);
    }

    public NetworkCall(Activity mActivity, RequestNotifier mNotifier) {
        this.mActivity = mActivity;
        this.mNotifier = mNotifier;

        preference_manager = new PreferenceManager(mActivity);
    }
    @SuppressLint("MissingPermission")
    public boolean isNewtworkAvailable(){
        if(mActivity != null){
            connectivityManager = (ConnectivityManager) mActivity.getSystemService(Context.CONNECTIVITY_SERVICE);
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        }
        else if(mContext != null){
            connectivityManager = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
    public void getAllDrinkList(){
        if(isNewtworkAvailable()){
            try{

                NetworkService networkServiceApi = RetrofitInstance.getRetrofitInstance().create(NetworkService.class);

                Call<ResponseDrinkDetails> repoUserDetailsCall = networkServiceApi.getDrinksDetails();

                repoUserDetailsCall.enqueue(new Callback<ResponseDrinkDetails>() {
                    @Override
                    public void onResponse(Call<ResponseDrinkDetails> call, Response<ResponseDrinkDetails> response) {
                        if(response.code() == 200){
                            mNotifier.notifySuccess(response);
                        }
                        else
                            mNotifier.notifyString("Something went wrong Please try again...!");
                    }
                    @Override
                    public void onFailure(Call<ResponseDrinkDetails> call, Throwable t) {
                        Log.e("API_Error","Error Response_drink_details->"+t.getMessage());
                        mNotifier.notifyError(t);
                    }
                });

            }catch (Exception e){
                Log.e("Error-->","Error Response_drink_details->"+e.getMessage());
                e.printStackTrace();
            }
        }
        else {
            mNotifier.notifyNoInternet();
        }
    }
}
