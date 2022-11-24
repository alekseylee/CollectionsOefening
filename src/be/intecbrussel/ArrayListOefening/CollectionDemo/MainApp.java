package be.intecbrussel.ArrayListOefening.CollectionDemo;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        Person person1 = new Person("Jan", 21);
        Person person2 = new Person("Josh", 12);
        Person person3 = new Person("Marie", 50);

        List<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);

        for(Person p:people) {
            System.out.println(p);
        }

        Person jan = new Person("Jan", 21);

        System.out.println(people.contains(person1));
        System.out.println(people.contains(jan));

        Set<Person> personSet = new HashSet<>();
        personSet.addAll(people);
        personSet.add(jan);


        Set<Person> personSet1 = new TreeSet<>(Comparator.comparing(Person::getAge)
                .thenComparing(Person::getName));



    }
}
