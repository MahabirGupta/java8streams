import java.util.Arrays;
import java.util.List;

public class Demo6 {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A","B","C","1","2","3");
//        using toArray() method
        Object arr[]=stringList.stream().toArray(); // It will return an object array

        System.out.println(Arrays.toString(arr));

        for (Object a:arr) {

            System.out.println(a);

        }
    }
}
