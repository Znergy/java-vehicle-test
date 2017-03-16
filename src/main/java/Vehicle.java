public class Vehicle {

  private int mYear;
  private String mBrand;
  private String mModel;
  private int mMiles;
  private int mPrice;

  public Vehicle(int year, String brand, String model, int miles, int price) {
    mYear = year;
    mBrand = brand;
    mModel = model;
    mMiles = miles;
    mPrice = price;
  }

  public boolean worthBuying(int maxPrice) {
    return (mPrice <= maxPrice);
  }

  // Use App to call a function HERE that RETURNS PRIVATE VARIABLES
  public String getBrand() {
    return mBrand;
  }

}
