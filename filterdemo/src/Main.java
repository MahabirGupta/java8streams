import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> numbersList = new ArrayList<>();
//        numbersList.add(10);
//        numbersList.add(20);
//        numbersList.add(30);
//        numbersList.add(40);
//        numbersList.add(50);

//        Can create a number list using Arrays.asList instead of ArrayList<Integer> numbersList = new ArrayList<>();
        List<Integer> numbersList1 = Arrays.asList(10,15,20,25,30);
//        Create another empty List
        List<Integer> evenNumbersList1 = new ArrayList<>();
//        List<Integer> evenNumbersList2 = new ArrayList<>();

//        getting all the even numbers from numbersList1 without using streams
//        i represents the element in numbersList1, not the index
//        The for-each loop iterates over each element in numbersList1, assigning the element's value to i.
//        for (int i:numbersList1) {
//
//            if ((i % 2) == 0){// Check if the number is even
//                evenNumbersList1.add(i);// Add the even number to the list
//            }
//
//        }
//        for (int i = 0; i < numbersList1.size() ; i++) {
//
//            if ((numbersList1.get(i) % 2) == 0){ // Check if the number is even
//                evenNumbersList2.add(numbersList1.get(i)); // Add the even number to the list
//            }
//
//        }
//        // Print the list of even numbers
//        System.out.println(evenNumbersList1);
//        System.out.println(evenNumbersList2);

//        using streams
//        add the collections to the stream and filter according to whether the numbers are even or odd And assign to another ArrayList
        evenNumbersList1=numbersList1.stream().filter(n->(n%2 == 0)).collect(Collectors.toList());
        System.out.println(evenNumbersList1);

//        to print the value after filter()
        numbersList1.stream().filter(n->(n%2 == 0)).forEach(n-> System.out.println(n));
//        or
        numbersList1.stream().filter(n->(n%2 == 0)).forEach(System.out::println);


        }
    }

