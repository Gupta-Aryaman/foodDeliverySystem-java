enum Rating{
    UNASSIGNED,
	ONE_STAR,
	TWO_STARS,
	THREE_STARS,
	FOUR_STARS,
	FIVE_STARS,
};
enum CUISINE {
	NORTH_INDIAN,
	SOUTH_INDIAN,
	CHINESE,
	STREET_FOOD,
	SWEETS,
	ITALIAN,
};

enum ORDER_STATUS {
	PLACED,
	ORDERED,
	ACCEPTED,
	ON_THE_WAY,
	REACHED,
	DELIVERED,
	CANCELLED
};

public abstract class IPartner {
    public String name;
    public Rating rating;

    public IPartner(String pName){
        name = pName;
        rating = Rating.UNASSIGNED;
    }

    public String getName() {
		return name;
	}

}
