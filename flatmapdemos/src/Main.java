import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        using map
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        numbers.stream().map(number->number+10).forEach(number-> System.out.println(number));
        List<Integer> addedNumbers;
        addedNumbers = numbers.stream().map(number->number+10).collect(Collectors.toList());
        System.out.println(addedNumbers);

//        flatmap()
        List<Integer> list1 = Arrays.asList(1,2);
        List<Integer> list2 = Arrays.asList(3,4);
        List<Integer> list3 = Arrays.asList(5,6);
//        add all the 3 collections list1, list2 and list3 to a single collection list
        List<List<Integer>> finallist = Arrays.asList(list1,list2,list3);
        List<Integer> resultList=finallist.stream().flatMap(numCollections->numCollections.stream()).collect(Collectors.toList());
        System.out.println(resultList);

//       add all the 3 collections list1, list2 and list3 to a single collection list and for each element use map to perform a certain operation
        List<Integer> resultList1=finallist.stream().flatMap(numCollections->numCollections.stream().map(num->num+10)).collect(Collectors.toList());
        System.out.println(resultList1);



    }
}
