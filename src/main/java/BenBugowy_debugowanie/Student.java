package BenBugowy_debugowanie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Grzesiek on 2018-07-22
 */

@Getter
@Setter
public class Student extends Person {
    private String grade;
    private String daysAttended;

    public Student(String name, String grade, String daysAttended) {
        super(name);
        this.grade = grade;
        this.daysAttended = daysAttended;
    }

    public void inflateGrade() {
        this.setGrade(getGrade().replace("-", "+"));
    }

    public void boostAttendance() {
        int days = Integer.parseInt(this.getDaysAttended()) + 2;
        this.setDaysAttended(String.valueOf(days));
    }

    @Override
    public String toString() {
        return "[Name: " + this.getName() + ", Grade: " + this.grade + ", Days attended; " + this.daysAttended + "]";
    }
}

