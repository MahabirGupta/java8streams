import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Scott","David","John");
        List<String> teamB = Arrays.asList("Mary","Luna","Tom");
        List<String> teamC = Arrays.asList("Ken","Jony","Kitty");
        List<List<String>> collectTeam = Arrays.asList(teamA,teamB,teamC);
//        Using streams flatMap()
       List<String> finalNameList= collectTeam.stream().flatMap(nameCollections->nameCollections.stream()).collect(Collectors.toList());
        System.out.println(finalNameList);
//        or
        List<List<String>> playersInWorldCup = new ArrayList<>();
        playersInWorldCup.add(teamA);
        playersInWorldCup.add(teamB);
        playersInWorldCup.add(teamC);
//        System.out.println(playersInWorldCup);
        List<String> finalName = playersInWorldCup.stream().flatMap(playerName->playerName.stream()).collect(Collectors.toList());
        System.out.println(finalName);

//        before java8
        for (List<String> nameList:playersInWorldCup) {
            for (String name: nameList) {

            System.out.println(name);
            }

        }
    }
}
