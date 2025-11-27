package Collections;

import java.util.Arrays;

public class Student {
    String name;
    int course;
    String group;
    int[] marks;

    public Student(String name, int course, String group, int[] marks) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public double getAvgMark() {
        double sum = 0;
        for (int i : marks) {
            sum += i;
        }
        return sum / marks.length;
    }

    public int getCourse() {
        return course;
    }

    public void hireCourse() {
        this.course++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
