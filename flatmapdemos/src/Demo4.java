import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo4 {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//        using count() to count the number of even numbers in the numberList
      long numOfEvenNumbers = numberList.stream().filter(num -> (num%2 == 0)).count();
        System.out.println("Number of even numbers = " + numOfEvenNumbers);

//        using min() have to pass 2 arguments
      Optional<Integer> min =  numberList.stream().min((val1, val2) ->{
            return val1.compareTo(val2);
        });

//      to print the minimum value
        System.out.println("Minimum number = "+min.get());




    }
}
