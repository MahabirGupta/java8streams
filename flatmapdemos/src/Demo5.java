import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo5 {

    public static void main(String[] args) {
//        using reduce() to combine objects
        List<String> stringList = Arrays.asList("A","B","C","1","2","3");
       Optional<String> reducedList = stringList.stream().reduce((value, combinedValue)->
        {
            return combinedValue + value; //A+B then //A+B+C then //A+B+C+1 and so on
        });
//       use get() to print out the combinedList
        System.out.println(reducedList.get());
    }
}
