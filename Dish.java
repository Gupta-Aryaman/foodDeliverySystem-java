import java.util.*;

public class Dish {
    private String name;
	private CUISINE cuisine;
	private String description;
	private double price;
	private ArrayList<String> dishImages;
	private ArrayList<DishAddOn> addOns;

    public Dish(String pName, CUISINE pCuisine, double pPrice){
        name = pName;
        cuisine = pCuisine;
        price = pPrice;
        addOns = new ArrayList<DishAddOn>();
    }

    public void addAddOn(DishAddOn pAddOn){
        addOns.add(pAddOn);
    }

    public String getDescription(){ 
        return description; 
    }

	public String getDishName() {
         return name; 
    }

	public CUISINE getCuisine() { 
        return cuisine; 
    }

    public double getPrice(){
        return price;
    }
}
