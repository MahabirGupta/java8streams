package streamsmethods;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {

    public static void main(String[] args) {
//        Create a Set which does not allow duplications
        Set<String> fruits = new HashSet<>();
        fruits.add("One apple");
        fruits.add("One mango");
        fruits.add("Two apples");
        fruits.add("More grapes");
        fruits.add("Two guavas");
        System.out.println(fruits);

//        using anyMatch()
       boolean results= fruits.stream().anyMatch(value -> {return value.startsWith("One");}); //check whether any element stars with "One"
        System.out.println(results); //true

        //        using allMatch()
        boolean results1= fruits.stream().allMatch(value -> {return value.startsWith("One");});//check whether all elements stars with "One"
        System.out.println(results1); //false



    }
}
