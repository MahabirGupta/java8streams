import java.util.Arrays;
import java.util.List;

public class Demo4 {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//        using count to count the number of even numbers in the numberList
      long numOfEvenNumbers = numberList.stream().filter(num -> (num%2 == 0)).count();
        System.out.println("Number of even numbers = " + numOfEvenNumbers);
    }
}
