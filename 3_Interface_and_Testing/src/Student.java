public class Student extends Person implements HasToStudy {

    private boolean livesInDelft;
    private int amountOfTimesStudied = 0;

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

    /**
     * Studies for the upcoming exam.
     */
    @Override
    public void study() {
        amountOfTimesStudied++;
    }

    /**
     * Gets whether the student will pass the next exam.
     *
     * @return True iff the student has studied at least 5 times
     */
    @Override
    public boolean willPassExam() {
        return amountOfTimesStudied >= 5;
    }
}
