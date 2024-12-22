package bagdata;

/**
 * Demonstration class to showcase the usage of the Bag data structure
 */
public class BagTest {
    public static void main(String[] args) {
        // Create two bags of integers
        Bag<Integer> numberBag1 = new Bag<>();
        Bag<Integer> numberBag2 = new Bag<>();

        // Add elements to first bag, including duplicates (original functionality)
        numberBag1.add(5);
        numberBag1.add(10);
        numberBag1.add(15);
        numberBag1.add(10);
        numberBag1.add(20);

        // Print the bag contents (original functionality)
        System.out.println("Original Bag 1 contents: " + numberBag1);

        // Test contains method (original functionality)
        System.out.println("\nTesting contains method:");
        System.out.println("Contains 10: " + numberBag1.contains(10));
        System.out.println("Contains 7: " + numberBag1.contains(7));

        // Test count method (original functionality)
        System.out.println("\nTesting count method:");
        System.out.println("Count of 10: " + numberBag1.count(10));
        System.out.println("Count of 15: " + numberBag1.count(15));

        // Remove an element (original functionality)
        System.out.println("\nTesting remove method:");
        boolean removed = numberBag1.remove(10);
        System.out.println("Removed 10: " + removed);
        System.out.println("Bag contents after removal: " + numberBag1);
        System.out.println("Contains 10 after removal: " + numberBag1.contains(10));
        System.out.println("Count of 10 after removal: " + numberBag1.count(10));

        // Testing new functionality
        System.out.println("\n=== Testing New Functionality ===");
        
        // Add elements to second bag
        numberBag2.add(15);
        numberBag2.add(25);
        numberBag2.add(30);
        numberBag2.add(25);
        numberBag2.add(35);

        // Test size method
        System.out.println("\nTesting size method:");
        System.out.println("Bag 1 size: " + numberBag1.size());
        System.out.println("Bag 2 size: " + numberBag2.size());
        
        // Test merge method
        System.out.println("\nTesting merge method:");
        System.out.println("Bag 1 before merge: " + numberBag1);
        System.out.println("Bag 2 before merge: " + numberBag2);
        numberBag1.merge(numberBag2);
        System.out.println("Bag 1 after merge: " + numberBag1);
        
        // Test distinct method
        System.out.println("\nTesting distinct method:");
        Bag<Integer> distinctBag = numberBag1.distinct();
        System.out.println("Original merged bag: " + numberBag1);
        System.out.println("Distinct elements bag: " + distinctBag);
    }
}