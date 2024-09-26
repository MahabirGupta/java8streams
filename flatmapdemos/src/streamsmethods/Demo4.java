package streamsmethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Concatenating streams()
public class Demo4 {

    public static void main(String[] args) {
        List<String> animalsList = Arrays.asList("Dog","Cat","Elephant");
        List<String> birdsList = Arrays.asList("peacock","parrot","Crow");
//        add the 2 collections to 2 different streams
      Stream<String> stream1 = animalsList.stream();
        Stream<String> stream2 = birdsList.stream();
//        concatenate the 2 streams
        List<String> combinedList =Stream.concat(stream1,stream2).collect(Collectors.toList()); // returns a List of String streams
        System.out.println(combinedList);

        for (String element:combinedList) {
            System.out.println(element);

        }

    }
}
