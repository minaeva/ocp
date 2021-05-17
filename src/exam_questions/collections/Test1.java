package exam_questions.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(25, "Pune");
        map.put(32, "Mumbai");
        map.put(11, "Sri Nagar");
        map.put(39, "Chennai");

        System.out.println(map.headMap(25, true));
        //{11=Sri Nagar, 25=Pune}
        System.out.println(map.tailMap(25, true));
        //{25=Pune, 32=Mumbai, 39=Chennai}

        System.out.println(map.firstEntry()); //11=Sri Nagar
        System.out.println(map.lastEntry()); //39=Chennai

        System.out.println(map.descendingMap()); //{39=Chennai, 32=Mumbai, 25=Pune, 11=Sri Nagar}

        System.out.println(map.floorKey(30)); //25
        System.out.println(map.ceilingKey(30)); //32

        //headMap(K toKey, boolean inclusive) => returns the map till toKey, if
        // inclusive is true. Hence the output is: {11=Sri Nagar, 25=Pune}.
    }
}
