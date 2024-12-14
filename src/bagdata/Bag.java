package bagdata;

import java.util.ArrayList;
import java.util.List;

/**
 * A generic Bag data structure that allows storing multiple instances of elements.
 * @param <T> The type of elements stored in the bag
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

    /**
     * Adds an item to the bag
     * @param item The item to be added
     */
    public void add(T item) {
        items.add(item);
    }

    /**
     * Removes one occurrence of the specified item from the bag
     * @param item The item to be removed
     * @return true if the item was removed, false if the item was not in the bag
     */
    public boolean remove(T item) {
        return items.remove(item);
    }

    /**
     * Checks if the bag contains the specified item
     * @param item The item to check
     * @return true if the item exists in the bag, false otherwise
     */
    public boolean contains(T item) {
        return items.contains(item);
    }

    /**
     * Counts the number of occurrences of a specific item in the bag
     * @param item The item to count
     * @return The number of times the item appears in the bag
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
     * @return A string showing the items in the bag
     */
    @Override
    public String toString() {
        return items.toString();
    }
}
