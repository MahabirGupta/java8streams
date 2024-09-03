import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        create an Arrays List of vehicles and change all the elements from lowercase to uppercase
        List<String> vehicles= Arrays.asList("car","bus","bicycle","flight","train");
        List<String> upperCaseVehicles = new ArrayList<>();
        List<String> upperCaseVehicles1 = new ArrayList<>();
        List<String> upperCaseVehicles2 = new ArrayList<>();
//        without using Streams/before Java 8
        for (String string:vehicles) {
            upperCaseVehicles.add(string.toUpperCase());
        }
        System.out.println(upperCaseVehicles);
        for (int i = 0; i < vehicles.size(); i++) {
            upperCaseVehicles1.add(vehicles.get(i).toUpperCase());
        }
        System.out.println(upperCaseVehicles1);
//        using streams - map()
        upperCaseVehicles2=vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseVehicles2);
    }
}
