import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empId;
    String empName;
    int salary;

    public Employee(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " {" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class FilterMapDemo {

    public static void main(String[] args) {
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(new Employee(1,"Mahabir",8234));
//        employeeList.add(new Employee(2,"Anish",5498));
//        employeeList.add(new Employee(3,"Anishkaa",7654));
//        employeeList.add(new Employee(4,"Babita",2468));
////        System.out.println(employeeList);
//
//        for (Employee employee:employeeList) {
//            System.out.println(employee);
//        }
        List<Employee> employeeList1 = Arrays.asList(new Employee(101,"AJ",5765),
                new Employee(102,"David",4830),
                new Employee(103,"Vicky",3287),
                new Employee(104,"John",2648),
                new Employee(105,"Ben",1850)
                );
//        combination of filter and map
        List<String> employeeList2;
//        filter salary > 2000
        employeeList2 = employeeList1.stream().filter(employee->employee.salary>2000).map(employee->employee.toString()).collect(Collectors.toList());
        System.out.println(employeeList2);
    }

}
