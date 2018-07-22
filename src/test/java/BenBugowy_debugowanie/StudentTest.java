package BenBugowy_debugowanie;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Grzesiek on 2018-07-22
 */
public class StudentTest {
    private Student student;

    @Before
    public void setUp() throws Exception {
        student = new Student("Grzesiek", "C-", "0");
    }

    @Test
    public void inflateGrade() {
        String expGrade = "C+";
        student.inflateGrade();
        assertEquals(expGrade, student.getGrade());
    }

    @Test
    public void boostAttendance() {
        student.boostAttendance();
        student.boostAttendance();
        assertEquals("4", student.getDaysAttended());
    }
}