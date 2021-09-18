package Basic;

import java.util.*;

/**
 * 测试 JCF 中的常见集合
 * 
 * @author KureNaii
 * @version 1.0
 */
public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("list0");
        list.add("list1");
        list.add("list2");
        Iterator<String> listit = list.iterator();
        System.out.println("element in List : ");
        while (listit.hasNext()) {
            System.out.println(listit.next());
        }

        Set<String> set = new HashSet<>();
        set.add("set0");
        set.add("set1");
        set.add("set2");
        Iterator<String> setit = set.iterator();
        System.out.println("element in Set : ");
        while (setit.hasNext()) {
            System.out.println(setit.next());
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(0, "mapV0");
        map.put(1, "mapV1");
        map.put(2, "mapV2");

        // Map的静态内部类Entry表示每一个映射项，并且内部有entrySet集合存放map所有映射，可以通过entrySet中的iterator迭代器遍历所有映射。
        Iterator<Map.Entry<Integer, String>> mapit = map.entrySet().iterator();
        System.out.println("element in Map : ");
        while (mapit.hasNext()) {
            Map.Entry<Integer, String> entry = mapit.next();
            System.out.println("Key is : " + entry.getKey() + " Value is : " + entry.getValue());
        }

        // Map还有keyset集合，存储map中的所有key
        Iterator<Integer> mapit2 = map.keySet().iterator();
        System.out.println("element in Map2 : ");
        while (mapit2.hasNext()) {
            Integer key = mapit2.next();
            System.out.println("Key is : " + key + " Value is : " + map.get(key));
        }

    }
}
