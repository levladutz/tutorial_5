public class Building {

    private String street;
    private int value;

    /**
     * Creates a building.
     *
     * @param street The street the building is in
     * @param value The value of the building
     */
    public Building(String street, int value) {
        this.street = street;
        this.value = value;
    }

    /**
     * Gets the street the building is in.
     *
     * @return This building's street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Gets the value of the building.
     *
     * @return This building's value
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the building.
     *
     * @param value This building's new value
     */
    public void setValue(int value) {
        this.value = value;
    }
}
