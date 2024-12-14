package bagdata;

/**
 * Demonstration class to showcase the usage of the Bag data structure
 */
public class BagTest {
    public static void main(String[] args) {
        // Create a bag of integers
        Bag<Integer> numberBag = new Bag<>();

        // Add several elements to the bag, including duplicates
        numberBag.add(5);
        numberBag.add(10);
        numberBag.add(15);
        numberBag.add(10);
        numberBag.add(20);

        // Print the bag contents
        System.out.println("Bag contents: " + numberBag);

        // Test contains method
        System.out.println("Contains 10: " + numberBag.contains(10));
        System.out.println("Contains 7: " + numberBag.contains(7));

        // Test count method
        System.out.println("Count of 10: " + numberBag.count(10));
        System.out.println("Count of 15: " + numberBag.count(15));

        // Remove an element
        boolean removed = numberBag.remove(10);
        System.out.println("Removed 10: " + removed);

        // Print bag contents after removal
        System.out.println("Bag contents after removal: " + numberBag);

        // Test contains and count after removal
        System.out.println("Contains 10 after removal: " + numberBag.contains(10));
        System.out.println("Count of 10 after removal: " + numberBag.count(10));
    }
}
