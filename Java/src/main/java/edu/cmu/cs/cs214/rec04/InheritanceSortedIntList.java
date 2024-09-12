package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    // Write your implementation below with API documentation
    private int addCount; 

    /**
     * Creates a new instance of a InheritanceSortedIntList with
     * the count of attempted insertions starting at zero.
     *
     * @return The newly created InheritanceSortedIntList object
     */
    public InheritanceSortedIntList() {
        super();
        this.addCount = 0;
    }

    /**
     * Adds the specified int to the list and increases the count
     * attempted insertions by 1
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num) {
        boolean addSuccessful = super.add(num);
        this.addCount = this.addCount + 1;
        return addSuccessful;
    }

    /**
     * Adds all of the elements of the IntegerList to the list.
     * Calls add() on each element of list with each add() call
     * increasing the count of attempted insertions by 1
     *                                          
     * @param list IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean addAll(IntegerList list) {
        boolean addSuccessful = super.addAll(list);
        return addSuccessful;
    }

    /**
     * Gets the total number of elements added to the list so far 
     *                                          
     * @return An integer representing the number of attempted insertions
     * so far
     */
    public int getTotalAdded() {
        return this.addCount;
    }
}