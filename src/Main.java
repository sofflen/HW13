import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListOperations lo = new ListOperations();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        List<String> stringList = new ArrayList<>();
        stringList.add("raz");
        stringList.add("dva");
        stringList.add("tri");
        stringList.add("chetire");
        stringList.add("pyat");

        lo.avgValue(list);
        System.out.println(lo.toUpperCase(stringList));
        lo.filter(stringList);


    }
}
