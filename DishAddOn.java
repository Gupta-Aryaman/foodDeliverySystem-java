import java.util.*;

public class DishAddOn {
    private String name;
	private String description;
	private double price;
	private boolean isAvail;
	private ArrayList<String> images;

    public DishAddOn(String pName, double pPrice){
        name = pName;
        price = pPrice;
    }

    double getPrice(){
        return price;
    }
}
