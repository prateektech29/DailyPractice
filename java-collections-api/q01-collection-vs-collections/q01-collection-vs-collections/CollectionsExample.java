package javacollectionapi.q01_collectionvscollections;


    import java.util.*;

    public class CollectionsExample {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(4, 2, 9, 1);
            List<String> people=Arrays.asList("Rahul","Prateek","Sohil","Zen","Abhi");
         //Using helper methods like-> sort(),reverse().
            Collections.sort(numbers);  // Sorting the list
            Collections.sort(people);
            System.out.println("Sorted List: "+ numbers);
            System.out.println("Sorted List: "+ people);

            Collections.shuffle(numbers); // Shuffling-> mix them randomly- output will vary each time
            System.out.println("Shuffled List: " + numbers);
            Collections.shuffle(people);
            System.out.println("Shuffled List: " + people);

            Collections.reverse(numbers); // Reversing the list
            Collections.reverse(people);
            System.out.println("Reversed List: "+ numbers);
            System.out.println("Reversed List: "+ people);


        }
    }

