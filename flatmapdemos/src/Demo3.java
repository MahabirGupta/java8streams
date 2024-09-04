import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String stuName;
    int stuId;
    char stuGrade;

    public Student(String stuName, int stuId, char stuGrade) {
        this.stuName = stuName;
        this.stuId = stuId;
        this.stuGrade = stuGrade;
    }

    @Override
    public String toString() {
        return "{" +
                "stuName='" + stuName + '\'' +
                ", stuId=" + stuId +
                ", stuGrade=" + stuGrade +
                '}';
    }
}
public class Demo3 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mahabir",123,'A'));
        studentList.add(new Student("Anish",456,'A'));
        studentList.add(new Student("Anishkaa",789,'A'));
        studentList.add(new Student("Babita",045,'F'));
        studentList.add(new Student("Ashish",321,'B'));
//        create another student collection
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("Disha",437,'A'));
        studentList1.add(new Student("Kirti",328,'B'));
        studentList1.add(new Student("Devi",458,'C'));
        studentList1.add(new Student("Tanya",749,'D'));
        studentList1.add(new Student("Vikash",720,'B'));

//        using Streams flatMap()
        List<List<Student>> combinedStudentList = Arrays.asList(studentList,studentList1);
        List<Student> studentAll=combinedStudentList.stream().flatMap(students->students.stream()).collect(Collectors.toList());
        System.out.println(studentAll);
        System.out.println();
        List<String> studentName=combinedStudentList.stream().flatMap(students->students.stream()).map(student->student.stuName).collect(Collectors.toList());
        System.out.println(studentName);
        System.out.println();

//        before Java8
        for (List<Student> student: combinedStudentList) {
            for (Student indStudent:student) {

            System.out.println(indStudent);
            }

        }


    }
}
