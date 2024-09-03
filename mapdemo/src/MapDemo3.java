import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

    public static void main(String[] args) {
//        create an Integer ArrayList
        List<Integer> numbersList = Arrays.asList(2,3,4,5);
//        multiply every element in the ArrayList without using Streams
        List<Integer> numbersList1 =new ArrayList<>();
        for (int num:numbersList) {
            numbersList1.add(num * 3);
        }
        System.out.println(numbersList1);
        List<Integer> numbersList2 =new ArrayList<>();
        for (int i = 0; i < numbersList.size(); i++) {
            numbersList2.add(numbersList.get(i) * 3);

        }
        System.out.println(numbersList2);
//        multiply every element in the ArrayList using Streams map()
        List<Integer> numbersList3 =new ArrayList<>();
        numbersList3 = numbersList.stream().map(num->num*3).collect(Collectors.toList());
        System.out.println(numbersList3);
        numbersList.stream().map(num->num*3).forEach(num-> System.out.println(num));
        System.out.println();
        numbersList.stream().map(num->num*3).forEach( System.out::println);
    }
}
