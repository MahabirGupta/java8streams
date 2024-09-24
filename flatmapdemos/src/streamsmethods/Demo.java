package streamsmethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,4,3,7,5,8);
//        Using sorted() method to sort the integerList in ascending order
      List<Integer> newIntegerList = integerList.stream().sorted().collect(Collectors.toList()); //Sorting ascending order
        System.out.println(newIntegerList);
//        Using sorted(Comparator.reverseOrder()) method to sort the integerList in decending order
        List<Integer> newIntegerList1 = integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); //Sorting ascending order
        System.out.println(newIntegerList1);
    }
}
