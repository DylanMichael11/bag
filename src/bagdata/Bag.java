package bagdata;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A Bag data structure that allows storing multiple instances of elements.
 * <T> Is type of elements stored in the bag
 */
public class Bag<T> {
    // Internal list to store the bag elements
    private List<T> items;

    /**
     * Constructor to initialize an empty bag
     */
    public Bag() {
        this.items = new ArrayList<>();
    }

    // === Original Methods ===

    /**
     * Adds an item to the bag
     * T item The item to be added
     */
    public void add(T item) {
        items.add(item);
    }

    /**
     * Removes one occurrence of the specified item from the bag
     * item The item to be removed
     * true if the item was removed, false if the item was not in the bag
     */
    public boolean remove(T item) {
        return items.remove(item);
    }

    /**
     * Checks if the bag contains the specified item 
     * item The item to check
     * true if the item exists in the bag, false otherwise
     */
    public boolean contains(T item) {
        return items.contains(item);
    }

    /**
     * Counts the number of occurrences of a specific item in the bag
     * item The item to count
     * The number of times the item appears in the bag
     */
    public int count(T item) {
        int counter = 0;
        for (T element : items) {
            if (element.equals(item)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Returns a string representation of the bag contents
     * A string showing the items in the bag
     */
    @Override
    public String toString() {
        return items.toString();
    }

    // === New Methods ===

    /**
     * Returns the total number of elements in the bag, including duplicates
     * @return The size of the bag
     */
    public int size() {
        return items.size();
    }

    /**
     * Merges the elements of another bag into this bag
     *otherBag The bag whose elements are to be merged into this bag
     */
    public void merge(Bag<T> otherBag) {
        items.addAll(otherBag.items);
    }

    /**
     * Creates a new bag containing only the distinct elements from this bag
     * A new bag with duplicate elements removed
     */
    public Bag<T> distinct() {
        Bag<T> distinctBag = new Bag<>();
        Set<T> distinctElements = new HashSet<>(items);
        for (T element : distinctElements) {
            distinctBag.add(element);
        }
        return distinctBag;
    }

    /**
     * Main method to demonstrate both original and new functionality
     */
    public static void main(String[] args) {
        // Testing original functionality
        System.out.println("=== Testing Original Functionality ===");
        
        Bag<Integer> numberBag = new Bag<>();
        
        // Add elements (original)
        numberBag.add(5);
        numberBag.add(10);
        numberBag.add(15);
        numberBag.add(10);
        numberBag.add(20);
        
        System.out.println("\nOriginal bag contents: " + numberBag);
        
        // Test contains (original)
        System.out.println("Contains 10: " + numberBag.contains(10));
        System.out.println("Contains 7: " + numberBag.contains(7));
        
        // Test count (original)
        System.out.println("Count of 10: " + numberBag.count(10));
        System.out.println("Count of 15: " + numberBag.count(15));
        
        // Test remove (original)
        boolean removed = numberBag.remove(10);
        System.out.println("Removed 10: " + removed);
        System.out.println("Bag after removal: " + numberBag);
        System.out.println("Contains 10 after removal: " + numberBag.contains(10));
        System.out.println("Count of 10 after removal: " + numberBag.count(10));

        // Testing new functionality
        System.out.println("\n=== Testing New Functionality ===");
        
        // Create second bag for merge testing
        Bag<Integer> secondBag = new Bag<>();
        secondBag.add(25);
        secondBag.add(30);
        secondBag.add(25);
        secondBag.add(35);
        
        // Test size (new)
        System.out.println("\nSize of first bag: " + numberBag.size());
        System.out.println("Size of second bag: " + secondBag.size());
        
        // Test merge (new)
        System.out.println("\nFirst bag before merge: " + numberBag);
        System.out.println("Second bag before merge: " + secondBag);
        numberBag.merge(secondBag);
        System.out.println("First bag after merge: " + numberBag);
        
        // Test distinct (new)
        Bag<Integer> distinctBag = numberBag.distinct();
        System.out.println("\nOriginal bag after all operations: " + numberBag);
        System.out.println("Distinct elements bag: " + distinctBag);
    }
}