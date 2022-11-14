public class Building implements Comparable<Building> {

    /** Description of the building */
    protected String buildingDescription;

    /** Name of the building */
    protected String buildingName;

    /** Number of floors or levels */
    protected int floors;

    /** Type of roof material */
    protected String roofMaterial;

    /** Roof design */
    protected String roofDesign;

    /** Entrance shape */
    protected String entranceShape;

    /** Entrance material */
    protected String entranceMaterial;

    /** Simple constructor */
    public Building(String buildingDescription) {
        this.buildingDescription = buildingDescription;
    }


    /**
     * Description of roof
     */
    public void roof() {
        System.out.printf("\nThis %s has a %s roof made of %s.",
                this.buildingDescription, this.roofDesign, this.roofMaterial);
    }

    /**
     * Description of entrance
     */
    public void entrance() {
        System.out.printf("\nThis %s has a %s style entrance made of %s",
                this.buildingDescription, this.entranceShape, this.entranceMaterial);
    }


    /*
    ACCESSORS AND MUTATORS
     */

    public String getBuildingDescription() {
        return buildingDescription;
    }

    public void setBuildingDescription(String buildingDescription) {
        this.buildingDescription = buildingDescription;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }
    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getRoofMaterial() {
        return roofMaterial;
    }

    public void setRoofMaterial(String roofMaterial) {
        this.roofMaterial = roofMaterial;
    }

    public String getRoofDesign() {
        return roofDesign;
    }

    public void setRoofDesign(String roofDesign) {
        this.roofDesign = roofDesign;
    }

    public String getEntranceShape() {
        return entranceShape;
    }

    public void setEntranceShape(String entranceShape) {
        this.entranceShape = entranceShape;
    }

    public String getEntranceMaterial() {
        return entranceMaterial;
    }

    public void setEntranceMaterial(String entranceMaterial) {
        this.entranceMaterial = entranceMaterial;
    }

    /**
     * I will be comparing the different buildings based on the amount of letters in their name.
     * For this, I will be using a field I created called buildingName. I also added the
     * accessor and mutator for the new field, and have created a test class named TestingClass
     * to test out the compareTo methods
     *
     * @param building          - the building to compare against
     *
     * @return comparisonResult - If 1, current buildingName length > parameter buildingName length
     *                            If 0, current buildingName length = parameter buildingName length
     *                            If -1, current buildingName length < parameter buildingName length
     *
     *   - CMV 11/14/22
     */
    public int compareTo(Building building) {
        int comparisonResult = 0;
        if (this.buildingName.length() > building.buildingName.length())
            comparisonResult = 1;
        else if (this.buildingName.length() < building.buildingName.length())
            comparisonResult = -1;
        return comparisonResult;
    }
}