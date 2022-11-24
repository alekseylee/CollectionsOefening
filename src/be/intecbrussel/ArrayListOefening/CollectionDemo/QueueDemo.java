package be.intecbrussel.ArrayListOefening.CollectionDemo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<String> customers = new LinkedList<>();
        customers.add("Said");
        customers.add("Jan");
        customers.add("Sara");
        customers.offer("Emrah");

        System.out.println("Treating right now: " + customers.poll());


        for (String name: customers) {
            System.out.println(name);
        }


        Queue<String> customers2 = new PriorityQueue<>();
        customers.add("Said");
        customers.add("Jan");
        customers.add("Sara");
        customers.offer("Emrah");

        while (customers2.size()>0) {
            System.out.println("Treating right now: " + customers.poll());
        }

    }
}
