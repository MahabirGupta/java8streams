import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Anish","Mahabir","Anishkaa","Champa","Gaytri","Joffery");
        System.out.println(nameList);
//        Create an empty ArrayList
        List<String> longNames = new ArrayList<>();
        longNames=nameList.stream().filter(name->name.length()>6 && name.length()<8).collect(Collectors.toList());
        System.out.println(longNames);
//        or print the elements Without storing it into another ArrayList
        nameList.stream().filter(name->name.length()>6 && name.length()<8).forEach(name-> System.out.println(name));
//        or
        nameList.stream().filter(name->name.length()>6 && name.length()<8).forEach(System.out::println);
    }
}
