package javacollectionapi.q01_collectionvscollections;
import java.util.*;
    public class CollectionExample {
        public static void main(String[] args) {
            Collection<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Boby");
            names.add("Sunny");
            System.out.println("Collection type -> List " + names);

            names.remove("Bob");
            System.out.println("After removing an element in our List "+ names);
//  Some other Collection interface implementations  -> LinkedList,PriorityQueue
            Collection<String> names2 = new HashSet<>(names);
            Collection<String> names3 = new PriorityQueue<>(names);
            System.out.println("\nCollection type -> Set "+ names2);
            System.out.println("Collection type -> Queue "+ names3);

        }
    }

