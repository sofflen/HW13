import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOperations {

    //Имеется коллекция из Integers, использую стримы посчитать среденее значения всех чисел
    public void avgValue(List<Integer> list) {
        System.out.println(list.stream().mapToInt(l -> l).average());
    }

    //Имеется коллекция из String, привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>
    public List<Map<String, String>> toUpperCase(List<String> list) {
        List<Map<String, String>> mapList = new ArrayList<>();
        Map<String, String> map = list.stream().collect(Collectors.toMap(x -> x, String::toUpperCase));
        mapList.add(map);
        return mapList;
    }

    //Имеется коллекция из String, отфильтровать и вывести на экран в все значения, которые написаны в lowerCase and length = 4
    public void filter(List<String> list) {
        Predicate<String> isLowerCase = x -> x.equals(x.toLowerCase());
        Predicate<String> isLength = x -> x.length() == 4;
        list.stream().filter(isLowerCase.and(isLength)).forEach(System.out::println);

    }
}
