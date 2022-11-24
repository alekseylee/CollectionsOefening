package be.intecbrussel.ArrayListOefening.ArrayList1;

import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();
        listA.add("GGG");
        listA.add("Canelo");
        listA.add("Tyson");

        ArrayList<String> listB = new ArrayList<>();
        listB.add("Mohhamed Ali");
        listB.add("Manny Pacquiao");
        listB.add("Floyd Mayweather");

        ArrayList<String> result = new ArrayList<String>();
        result.addAll(listA);
        result.addAll(listB);
        System.out.println(result);

    }
}
