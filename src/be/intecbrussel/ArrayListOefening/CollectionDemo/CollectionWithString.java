package be.intecbrussel.ArrayListOefening.CollectionDemo;

import java.util.*;

public class CollectionWithString {
    public static void main(String[] args) {

        List<String> fruitList = new ArrayList<>();
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Ananas");
        fruitList.add("Ananas");
        fruitList.add("Ananas");
        fruitList.remove("Banana");
        fruitList.remove(2);

        System.out.println(fruitList.contains("Apple"));

        fruitList.forEach(System.out::println);

        Set<String> fruitSet = new HashSet<>();
        fruitSet.addAll(fruitList);
        for(String fruit:fruitSet) {
            System.out.println(fruit);
        }

//        Set<String> fruitSet2 = new LinkedHashSet<>();
//        fruitSet2.addAll(fruitList);
//        fruitSet2.add("Kiwi");
//        fruitSet2.add("Strawberry");
//        fruitSet2.add("Blueberry");
//
//        fruitSet2.remove("Kiwi");
//
//        System.out.println(fruitList);
        System.out.println("-----------------------");

//        SortedSet<String> fruitSortedSet = new TreeSet<>();
//        fruitSortedSet.addAll(fruitSet);
//        for(String fruit: fruitSortedSet) {
//            System.out.println(fruit);
//        }


    }
}
