package utilities;

/**
* DictionaryADT.java
*
* @author your name
* @version major.minor revision number starting at 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of Dictionary for the DictionaryADT Lab. 
*/

public interface DictionaryADT<K,V>
{
    /** 
     * Gets the number of key-value pairs currently stored in the dictionary.
     * 
     * Pre-condition: The dictionary's internal `keys` and `values` ArrayLists 
     * have been properly initialized (not null).
     * 
     * Post-condition: The state of the dictionary remains unchanged.
     * The returned value accurately reflects the current number of elements.
     * 
     * @return The current number of key-value pairs (the logical size) stored in the dictionary.
     * This is equivalent to the number of elements in the `keys` array (and `values` array).
     * 
     * @throw NullPointerException If the `keys` internal array (or `values` array, if its state
     * is checked for size) is `null` at the time of invocation. This indicates an
     * improperly initialized dictionary internal state.
    */
    public int getSize();

    /**
     * Removes all key-value pairs from the dictionary, making it empty.
     * 
     * Pre-condition: The dictionary's internal `keys` and `values` ArrayLists 
     * have been properly initialized (not null).
     * 
     * Post-condition: The dictionary will contain zero key-value pairs (`getSize()` will return 0).
     * The internal `keys` and `values` data structures will be empty, but they will
     * remain initialized and ready to accept new elements (i.e., they will not be `null`).
     */
    public void clearAll();
}
