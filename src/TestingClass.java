public class TestingClass extends Building{

    /**
     * Simple constructor
     *
     * @param buildingDescription
     */
    public TestingClass(String buildingDescription) {
        super(buildingDescription);
    }

    public static void main(String[] args) {
        LargeHouse Mansion = new LargeHouse();
        MediumHouse TwoStory = new MediumHouse();
        SmallHouse Shack = new SmallHouse();
        ResidentialCarGarage Parking = new ResidentialCarGarage();
        ResidentialCarGarage MoreParking = new ResidentialCarGarage();
        ResidentialCarGarage LessParking = new ResidentialCarGarage();
        ResidentialCarGarage SameParking = new ResidentialCarGarage();

        Mansion.setBuildingName("The Vasquez Manor");
        TwoStory.setBuildingName("My 2nd Home");
        Shack.setBuildingName("Letters");
        Parking.setBuildingName("Parking");



        Parking.cars = 3;
        MoreParking.cars = 5;
        LessParking.cars = 0;
        SameParking.cars = 3;

        System.out.println("Mansion and Shack: " + Mansion.compareTo(Shack));
        System.out.println("TwoStory and Mansion: " + TwoStory.compareTo(Mansion));
        System.out.println("Shack and Parking: " + Shack.compareTo(Parking));
        System.out.println("Parking and MoreParking: " + Parking.compareTo(MoreParking));
        System.out.println("Parking and Less Parking: " + Parking.compareTo(LessParking));
        System.out.println("Parking and Same Parking: " + Parking.compareTo(SameParking));
    }
}
