package in.darshana.showtime.Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseDrinkDetails{

	@SerializedName("drinks")
	private List<DrinksItem> drinks;

	public void setDrinks(List<DrinksItem> drinks){
		this.drinks = drinks;
	}

	public List<DrinksItem> getDrinks(){
		return drinks;
	}

	public class DrinksItem{

		@SerializedName("strInstructionsDE")
		private String strInstructionsDE;

		@SerializedName("strImageSource")
		private String strImageSource;

		@SerializedName("strIngredient10")
		private Object strIngredient10;

		@SerializedName("strDrink")
		private String strDrink;

		@SerializedName("strIngredient12")
		private Object strIngredient12;

		@SerializedName("strIngredient11")
		private Object strIngredient11;

		@SerializedName("strIngredient14")
		private Object strIngredient14;

		@SerializedName("strCategory")
		private String strCategory;

		@SerializedName("strAlcoholic")
		private String strAlcoholic;

		@SerializedName("strIngredient13")
		private Object strIngredient13;

		@SerializedName("strIngredient15")
		private Object strIngredient15;

		@SerializedName("strCreativeCommonsConfirmed")
		private String strCreativeCommonsConfirmed;

		@SerializedName("strIBA")
		private String strIBA;

		@SerializedName("strVideo")
		private Object strVideo;

		@SerializedName("strTags")
		private String strTags;

		@SerializedName("strInstructions")
		private String strInstructions;

		@SerializedName("strIngredient1")
		private String strIngredient1;

		@SerializedName("strIngredient3")
		private String strIngredient3;

		@SerializedName("strIngredient2")
		private String strIngredient2;

		@SerializedName("strIngredient5")
		private Object strIngredient5;

		@SerializedName("strIngredient4")
		private String strIngredient4;

		@SerializedName("strIngredient7")
		private Object strIngredient7;

		@SerializedName("strIngredient6")
		private Object strIngredient6;

		@SerializedName("strIngredient9")
		private Object strIngredient9;

		@SerializedName("strInstructionsFR")
		private Object strInstructionsFR;

		@SerializedName("strIngredient8")
		private Object strIngredient8;

		@SerializedName("idDrink")
		private String idDrink;

		@SerializedName("strInstructionsES")
		private Object strInstructionsES;

		@SerializedName("strInstructionsIT")
		private String strInstructionsIT;

		@SerializedName("strGlass")
		private String strGlass;

		@SerializedName("strMeasure12")
		private Object strMeasure12;

		@SerializedName("strMeasure13")
		private Object strMeasure13;

		@SerializedName("strMeasure10")
		private Object strMeasure10;

		@SerializedName("strMeasure11")
		private Object strMeasure11;

		@SerializedName("strImageAttribution")
		private String strImageAttribution;

		@SerializedName("dateModified")
		private String dateModified;

		@SerializedName("strDrinkAlternate")
		private Object strDrinkAlternate;

		@SerializedName("strDrinkThumb")
		private String strDrinkThumb;

		@SerializedName("strInstructionsZH-HANT")
		private Object strInstructionsZHHANT;

		@SerializedName("strMeasure9")
		private Object strMeasure9;

		@SerializedName("strMeasure7")
		private Object strMeasure7;

		@SerializedName("strMeasure8")
		private Object strMeasure8;

		@SerializedName("strMeasure5")
		private Object strMeasure5;

		@SerializedName("strMeasure6")
		private Object strMeasure6;

		@SerializedName("strMeasure3")
		private String strMeasure3;

		@SerializedName("strMeasure4")
		private Object strMeasure4;

		@SerializedName("strMeasure1")
		private String strMeasure1;

		@SerializedName("strMeasure2")
		private String strMeasure2;

		@SerializedName("strInstructionsZH-HANS")
		private Object strInstructionsZHHANS;

		@SerializedName("strMeasure14")
		private Object strMeasure14;

		@SerializedName("strMeasure15")
		private Object strMeasure15;

		public void setStrInstructionsDE(String strInstructionsDE){
			this.strInstructionsDE = strInstructionsDE;
		}

		public String getStrInstructionsDE(){
			return strInstructionsDE;
		}

		public void setStrImageSource(String strImageSource){
			this.strImageSource = strImageSource;
		}

		public String getStrImageSource(){
			return strImageSource;
		}

		public void setStrIngredient10(Object strIngredient10){
			this.strIngredient10 = strIngredient10;
		}

		public Object getStrIngredient10(){
			return strIngredient10;
		}

		public void setStrDrink(String strDrink){
			this.strDrink = strDrink;
		}

		public String getStrDrink(){
			return strDrink;
		}

		public void setStrIngredient12(Object strIngredient12){
			this.strIngredient12 = strIngredient12;
		}

		public Object getStrIngredient12(){
			return strIngredient12;
		}

		public void setStrIngredient11(Object strIngredient11){
			this.strIngredient11 = strIngredient11;
		}

		public Object getStrIngredient11(){
			return strIngredient11;
		}

		public void setStrIngredient14(Object strIngredient14){
			this.strIngredient14 = strIngredient14;
		}

		public Object getStrIngredient14(){
			return strIngredient14;
		}

		public void setStrCategory(String strCategory){
			this.strCategory = strCategory;
		}

		public String getStrCategory(){
			return strCategory;
		}

		public void setStrAlcoholic(String strAlcoholic){
			this.strAlcoholic = strAlcoholic;
		}

		public String getStrAlcoholic(){
			return strAlcoholic;
		}

		public void setStrIngredient13(Object strIngredient13){
			this.strIngredient13 = strIngredient13;
		}

		public Object getStrIngredient13(){
			return strIngredient13;
		}

		public void setStrIngredient15(Object strIngredient15){
			this.strIngredient15 = strIngredient15;
		}

		public Object getStrIngredient15(){
			return strIngredient15;
		}

		public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed){
			this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
		}

		public String getStrCreativeCommonsConfirmed(){
			return strCreativeCommonsConfirmed;
		}

		public void setStrIBA(String strIBA){
			this.strIBA = strIBA;
		}

		public String getStrIBA(){
			return strIBA;
		}

		public void setStrVideo(Object strVideo){
			this.strVideo = strVideo;
		}

		public Object getStrVideo(){
			return strVideo;
		}

		public void setStrTags(String strTags){
			this.strTags = strTags;
		}

		public String getStrTags(){
			return strTags;
		}

		public void setStrInstructions(String strInstructions){
			this.strInstructions = strInstructions;
		}

		public String getStrInstructions(){
			return strInstructions;
		}

		public void setStrIngredient1(String strIngredient1){
			this.strIngredient1 = strIngredient1;
		}

		public String getStrIngredient1(){
			return strIngredient1;
		}

		public void setStrIngredient3(String strIngredient3){
			this.strIngredient3 = strIngredient3;
		}

		public String getStrIngredient3(){
			return strIngredient3;
		}

		public void setStrIngredient2(String strIngredient2){
			this.strIngredient2 = strIngredient2;
		}

		public String getStrIngredient2(){
			return strIngredient2;
		}

		public void setStrIngredient5(Object strIngredient5){
			this.strIngredient5 = strIngredient5;
		}

		public Object getStrIngredient5(){
			return strIngredient5;
		}

		public void setStrIngredient4(String strIngredient4){
			this.strIngredient4 = strIngredient4;
		}

		public String getStrIngredient4(){
			return strIngredient4;
		}

		public void setStrIngredient7(Object strIngredient7){
			this.strIngredient7 = strIngredient7;
		}

		public Object getStrIngredient7(){
			return strIngredient7;
		}

		public void setStrIngredient6(Object strIngredient6){
			this.strIngredient6 = strIngredient6;
		}

		public Object getStrIngredient6(){
			return strIngredient6;
		}

		public void setStrIngredient9(Object strIngredient9){
			this.strIngredient9 = strIngredient9;
		}

		public Object getStrIngredient9(){
			return strIngredient9;
		}

		public void setStrInstructionsFR(Object strInstructionsFR){
			this.strInstructionsFR = strInstructionsFR;
		}

		public Object getStrInstructionsFR(){
			return strInstructionsFR;
		}

		public void setStrIngredient8(Object strIngredient8){
			this.strIngredient8 = strIngredient8;
		}

		public Object getStrIngredient8(){
			return strIngredient8;
		}

		public void setIdDrink(String idDrink){
			this.idDrink = idDrink;
		}

		public String getIdDrink(){
			return idDrink;
		}

		public void setStrInstructionsES(Object strInstructionsES){
			this.strInstructionsES = strInstructionsES;
		}

		public Object getStrInstructionsES(){
			return strInstructionsES;
		}

		public void setStrInstructionsIT(String strInstructionsIT){
			this.strInstructionsIT = strInstructionsIT;
		}

		public String getStrInstructionsIT(){
			return strInstructionsIT;
		}

		public void setStrGlass(String strGlass){
			this.strGlass = strGlass;
		}

		public String getStrGlass(){
			return strGlass;
		}

		public void setStrMeasure12(Object strMeasure12){
			this.strMeasure12 = strMeasure12;
		}

		public Object getStrMeasure12(){
			return strMeasure12;
		}

		public void setStrMeasure13(Object strMeasure13){
			this.strMeasure13 = strMeasure13;
		}

		public Object getStrMeasure13(){
			return strMeasure13;
		}

		public void setStrMeasure10(Object strMeasure10){
			this.strMeasure10 = strMeasure10;
		}

		public Object getStrMeasure10(){
			return strMeasure10;
		}

		public void setStrMeasure11(Object strMeasure11){
			this.strMeasure11 = strMeasure11;
		}

		public Object getStrMeasure11(){
			return strMeasure11;
		}

		public void setStrImageAttribution(String strImageAttribution){
			this.strImageAttribution = strImageAttribution;
		}

		public String getStrImageAttribution(){
			return strImageAttribution;
		}

		public void setDateModified(String dateModified){
			this.dateModified = dateModified;
		}

		public String getDateModified(){
			return dateModified;
		}

		public void setStrDrinkAlternate(Object strDrinkAlternate){
			this.strDrinkAlternate = strDrinkAlternate;
		}

		public Object getStrDrinkAlternate(){
			return strDrinkAlternate;
		}

		public void setStrDrinkThumb(String strDrinkThumb){
			this.strDrinkThumb = strDrinkThumb;
		}

		public String getStrDrinkThumb(){
			return strDrinkThumb;
		}

		public void setStrInstructionsZHHANT(Object strInstructionsZHHANT){
			this.strInstructionsZHHANT = strInstructionsZHHANT;
		}

		public Object getStrInstructionsZHHANT(){
			return strInstructionsZHHANT;
		}

		public void setStrMeasure9(Object strMeasure9){
			this.strMeasure9 = strMeasure9;
		}

		public Object getStrMeasure9(){
			return strMeasure9;
		}

		public void setStrMeasure7(Object strMeasure7){
			this.strMeasure7 = strMeasure7;
		}

		public Object getStrMeasure7(){
			return strMeasure7;
		}

		public void setStrMeasure8(Object strMeasure8){
			this.strMeasure8 = strMeasure8;
		}

		public Object getStrMeasure8(){
			return strMeasure8;
		}

		public void setStrMeasure5(Object strMeasure5){
			this.strMeasure5 = strMeasure5;
		}

		public Object getStrMeasure5(){
			return strMeasure5;
		}

		public void setStrMeasure6(Object strMeasure6){
			this.strMeasure6 = strMeasure6;
		}

		public Object getStrMeasure6(){
			return strMeasure6;
		}

		public void setStrMeasure3(String strMeasure3){
			this.strMeasure3 = strMeasure3;
		}

		public String getStrMeasure3(){
			return strMeasure3;
		}

		public void setStrMeasure4(Object strMeasure4){
			this.strMeasure4 = strMeasure4;
		}

		public Object getStrMeasure4(){
			return strMeasure4;
		}

		public void setStrMeasure1(String strMeasure1){
			this.strMeasure1 = strMeasure1;
		}

		public String getStrMeasure1(){
			return strMeasure1;
		}

		public void setStrMeasure2(String strMeasure2){
			this.strMeasure2 = strMeasure2;
		}

		public String getStrMeasure2(){
			return strMeasure2;
		}

		public void setStrInstructionsZHHANS(Object strInstructionsZHHANS){
			this.strInstructionsZHHANS = strInstructionsZHHANS;
		}

		public Object getStrInstructionsZHHANS(){
			return strInstructionsZHHANS;
		}

		public void setStrMeasure14(Object strMeasure14){
			this.strMeasure14 = strMeasure14;
		}

		public Object getStrMeasure14(){
			return strMeasure14;
		}

		public void setStrMeasure15(Object strMeasure15){
			this.strMeasure15 = strMeasure15;
		}

		public Object getStrMeasure15(){
			return strMeasure15;
		}
	}
}