public class User {
    private String name;
	private Location location;

	public User(String pName, Location pLoc){
        name = pName;
        location = pLoc;
    }

	public Location getLocation() {
		return location;
	}
	public String getId() {
		return name;
	}
}
