package in.darshana.showtime.NetworkCalls;

import in.darshana.showtime.Model.ResponseDrinkDetails;
import retrofit2.Call;
import retrofit2.http.GET;

public interface NetworkService {
    @GET("json/v1/1/search.php?s=margarita")
    Call<ResponseDrinkDetails> getDrinksDetails();
}
