public class ResidentialCarGarage extends Building{

    /** Number of cars accommodated */
    protected int cars;

    /** Default constructor */
    public ResidentialCarGarage() {
        super("garage");
    }

    /**
     * Describe car space
     */
    public void parking() {
        String noun = (this.cars > 1) ? "cars" : "car";
        System.out.printf("\nThis %s can accommodate %d %s.",
                this.buildingDescription, this.cars, noun);
    }

    public int compareTo(ResidentialCarGarage garage) {
        int comparisonResult = 0;
        if (this.cars > garage.cars)
            comparisonResult = 1;
        else if (this.cars < garage.cars)
            comparisonResult = -1;
        return comparisonResult;
    }
}