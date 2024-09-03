import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {

    public static void main(String[] args) {
//        filter null values from the collection and remove the null from the collection
        List<String> words = Arrays.asList("Apple",null,"Boy","Cat",null,"Dog");
        List<String> result = new ArrayList<>();
        result=words.stream().filter(word->word!=null).collect(Collectors.toList());
        System.out.println(result);
//        or
        System.out.println();
        words.stream().filter(word->word!=null).forEach(word-> System.out.println(word));
        System.out.println();
//        or
        words.stream().filter(word->word!=null).forEach(System.out::println);
    }
}
