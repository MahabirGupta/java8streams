import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

    public static void main(String[] args) {
        List<String> vehicles= Arrays.asList("car","bus","bicycle","flight","train");
// before Java 8 or without using streams find the length of element of the vehicle collections and store it in another Array
        List<Integer> lengthofElements = new ArrayList<>();
        for (String string:vehicles) {
            lengthofElements.add(string.length());

        }
        System.out.println(lengthofElements);
        List<Integer> lengthofElements1 = new ArrayList<>();
        for (int i = 0; i < vehicles.size() ; i++) {
            lengthofElements1.add(vehicles.get(i).length());

        }
        System.out.println(lengthofElements1);

//        find the length of element of the vehicle collections and store it in another Array using Streams - map()
        List<Integer> lengthofElements2;
        lengthofElements2 = vehicles.stream().map(string->string.length()).collect(Collectors.toList());
        System.out.println(lengthofElements2);


        vehicles.stream().map(string->string.length()).forEach(length-> System.out.println(length));
        System.out.println();
        vehicles.stream().map(string->string.length()).forEach(System.out::println);

    }
}
