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

    public List<Pair> toUpperCase(List<String> list) {
        return list.stream()
                .map(x -> new Pair(x, x.toUpperCase()))
                .collect(Collectors.toList());
    }

    //Имеется коллекция из String, отфильтровать и вывести на экран в все значения, которые написаны в lowerCase and length = 4
    public void filter(List<String> list) {
        Predicate<String> isLowerCase = x -> x.equals(x.toLowerCase());
        Predicate<String> isLength = x -> x.length() == 4;
        list.stream().filter(isLowerCase.and(isLength)).forEach(System.out::println);

    }

    class Pair {
        private String before;
        private String after;

        Pair(String before, String after) {
            this.before = before;
            this.after = after;
        }

        public String getBefore() {
            return before;
        }

        public void setBefore(String before) {
            this.before = before;
        }

        public String getAfter() {
            return after;
        }

        public void setAfter(String after) {
            this.after = after;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "before='" + before + '\'' +
                    ", after='" + after + '\'' +
                    '}';
        }
    }
}
