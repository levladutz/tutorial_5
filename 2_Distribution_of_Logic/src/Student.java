public class Student extends Person {

    private boolean livesInDelft;

    /**
     * Creates a student.
     *
     * @param name The name of the student
     * @param height The height of the student
     * @param livesInDelft Whether the student lives in Delft
     */
    public Student(String name, double height, boolean livesInDelft) {
        super(name, height);
        this.livesInDelft = livesInDelft;
    }

    /**
     * Gets whether the student lives in Delft.
     *
     * @return True iff this student lives in Delft
     */
    public boolean getLivesInDelft() {
        return livesInDelft;
    }

    /**
     * Sets whether the student lives in Delft.
     *
     * @param livesInDelft The new living status of this student
     */
    public void setLivesInDelft(boolean livesInDelft) {
        this.livesInDelft = livesInDelft;
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) return false;
        if (!(other instanceof Student)) return false;
        Student that = (Student) other;
        return this.livesInDelft == that.livesInDelft;
    }

    @Override
    public String toString() {
        return "Student:\n" + super.toString() + " and "
                + (livesInDelft ? "lives in Delft" : "does not live in Delft");
    }

}
