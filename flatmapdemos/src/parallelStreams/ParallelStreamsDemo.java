package parallelStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
public class ParallelStreamsDemo {

    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("Mahabir", 85),
                new Student("Anish", 95),
                new Student("Anishkaa", 89),
                new Student("Babita", 45),
                new Student("Jane", 67),
                new Student("Shawn", 59)

        );
// using sequential(normal) stream
      List<Student> studentList1 = studentList.stream().filter(studentScore -> studentScore.getScore()>=80).limit(2).collect(Collectors.toList());
        System.out.println(studentList1);

        for (Student student:studentList1) {

            System.out.println(student);

        }
// using sequential(normal) stream
        studentList.stream().filter(studentScore -> studentScore.getScore()>=80).limit(2).forEach(student -> System.out.println(student.getName() + " " + student.getScore()));


    }
}
