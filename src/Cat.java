/**
 * Created by cdevitt on 8/30/15.
 */
public class Cat {
    private String breed;
    private Boolean domestic;
    private int age;
    private String name;
    private int numOwners;
    private String currentOwner;
    private static final int LIFESPAN = 15;

    public Cat(String theBreed, int theAge, Boolean isDomestic) {
        breed = theBreed;
        age = theAge;
        domestic = isDomestic;
        numOwners = 0;
        currentOwner = "na";
    }

    public void setOwnership(String theOwner, String theName) {
        currentOwner = theOwner;
        name = theName;
        numOwners++;
    }

    public String pctExpectedLife() {
        return (double) (age / LIFESPAN) + "%";
    }

    public String getName() {
        return name;
    }

}
