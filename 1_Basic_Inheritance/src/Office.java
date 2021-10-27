public class Office extends Building {

    private int amountOfWorkers;

    /**
     * Creates an office.
     *
     * @param street The street the office is in
     * @param value The value of the office
     * @param amountOfWorkers the amount of workers in the office
     */
    public Office(String street, int value, int amountOfWorkers) {
        super(street, value);
        this.amountOfWorkers = amountOfWorkers;
    }

    /**
     * Gets the amount of workers in the office.
     *
     * @return The amount of people that work in this office
     */
    public int getAmountOfWorkers() {
        return amountOfWorkers;
    }

    /**
     * Sets the amount of workers in the office.
     *
     * @param amountOfWorkers The new amount of people that work in this office
     */
    public void setAmountOfWorkers(int amountOfWorkers) {
        this.amountOfWorkers = amountOfWorkers;
    }
}
