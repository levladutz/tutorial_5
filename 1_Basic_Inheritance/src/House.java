public class House extends Building {

    private int number;

    /**
     * Creates a house.
     *
     * @param street The street the house is in
     * @param value The value of the house
     * @param number The number of the house
     */
    public House(String street, int value, int number) {
        super(street, value);
        this.number = number;
    }

    /**
     * Gets the number of the house.
     *
     * @return This house's number
     */
    public int getNumber() {
        return number;
    }

}
