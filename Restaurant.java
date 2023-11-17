import java.util.*;

public class Restaurant {
    private String name;
    private boolean isAvail;
    private Menu menu;
    private Location location;
    private RestaurantOwner owner;

    public Restaurant(String pName, RestaurantOwner pOwner, Location pLoc){
        name = pName;
        owner = pOwner;
        location = pLoc;
        isAvail = false;
        menu = null;
    }

    public void addMenu(Menu pMenu) {
		menu = pMenu;
	}
	public String getId() {
		return name;
	}
	public Location getLocation() {
		return location;
	}

    public boolean prepareFood(String pOrderId, Map<Dish, Integer> dishes){
        System.out.println("Restaurant accepting the order and starting to prepare it");

        // wait(5);
        for(int i =0; i <10000; i++){}

        return true;
    }
}
