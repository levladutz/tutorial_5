import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    void constructor() {
        Student student = new Student("Test Student", 1.85, true);
        assertNotNull(student);
    }

    @Test
    void getName() {
        Student student = new Student("Test Student", 1.85, true);
        assertEquals("Test Student", student.getName());
    }

    @Test
    void getHeight() {
        Student student = new Student("Test Student", 1.85, true);
        assertEquals(1.85, student.getHeight());
    }

    @Test
    void getLivesInDelft() {
        Student student = new Student("Test Student", 1.85, true);
        assertTrue(student.getLivesInDelft());
    }

    @Test
    void notEnoughStudy() {
        Student student = new Student("Test Student", 1.85, true);
        student.study();
        assertFalse(student.willPassExam());
    }

    @Test
    void enoughStudy() {
        Student student = new Student("Test Student", 1.85, true);
        student.study();
        student.study();
        student.study();
        student.study();
        student.study();
        student.study();
        assertTrue(student.willPassExam());
    }

}
