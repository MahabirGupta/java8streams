// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//using nonterminal methods distinct() and limit() to process the collections
//using the terminal method count()
public class Main {
    public static void main(String[] args) {

        List<String> vehicleList = Arrays.asList("van","bus","bicycle","car","bus","bicycle","car");
//        using distinct method
        List<String> noDuplicate = vehicleList.stream().distinct().collect(Collectors.toList());
        System.out.println(noDuplicate);
        vehicleList.stream().distinct().forEach(vehicle-> System.out.println(vehicle));

//        using count method

    }
}
