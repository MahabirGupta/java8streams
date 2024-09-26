package streamsmethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//findAny() and findFirst()
public class Demo3 {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one","two","three","one");
        //findAny() to find any element in the list
       Optional<String> element=stringList.stream().findAny(); //returns any element from the list
        System.out.println(element); // prints Optional[one]
        System.out.println(element.get()); // prints exact value one

        List<String> stringList1 = Arrays.asList();
        element=stringList1.stream().findAny(); //returns any element from the list
        System.out.println(element); // prints Optional.empty
//        System.out.println(element.get()); // throws .NoSuchElementException: No value present

//       findFirst() to find the first element in the list and return it
        stringList = Arrays.asList("eight","two","three","one");
        element=stringList.stream().findFirst();
        System.out.println(element); // prints Optional[eight]
        System.out.println(element.get()); // prints exact value eight

    }
}
