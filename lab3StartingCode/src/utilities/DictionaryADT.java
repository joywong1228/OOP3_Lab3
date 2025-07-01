package utilities;

/**
 * DictionaryADT.java
 *
 * @author Jessie Tang, Kwan Ting Wong, Lam Dao
 * @version major.minor revision number starting at 1.0
 * 
 *          Class Definition: This interface represents the public contract for
 *          the
 *          implementation of Dictionary for the DictionaryADT Lab.
 * 
 * @param <K> the type of keys maintained by this dictionary (must be unique)
 * @param <V> the type of mapped values
 */

public interface DictionaryADT<K, V> {
    /**
     * Inserts a new key-value pair into the dictionary.
     *
     * Precondition: The dictionary has been properly initialized, and key/value are
     * not null.
     *
     * Postcondition: A new key-value pair is added if the key does not already
     * exist.
     *
     * @param key   the key to insert
     * @param value the value to associate with the key
     * @return true if the pair is inserted successfully, false if the key already
     *         exists
     * @throws NullPointerException  if key or value is null
     * @throws DuplicateKeyException if the key already exists
     */
    public boolean insert(K key, V value);

    /**
     * Removes the key-value pair from the dictionary using the specified key.
     *
     * Precondition: The dictionary has been properly initialized.
     *
     * Postcondition: The key-value pair is removed if it exists.
     *
     * @param key the key to remove
     * @return true if the key-value pair was removed, false if the key was not
     *         found
     * @throws NullPointerException if key is null
     */
    public boolean remove(K key);

    /**
     * Updates the value associated with the given key.
     * 
     * Precondition: The dictionary has been properly initialized, and the value is
     * not null and is passed as argument.
     * 
     * Postcondition: The value with the corresponding key is successfully updated
     * in the Dictionary.
     * 
     * @param K key
     * @param V the new value
     * @return true if the system changes the key-value pair successfully,
     *         false if the key does not exist
     * 
     * @throws NullPointerException if key or value is null
     */
    public boolean update(K key, V value);

    /**
     * Retrieves the value associated with the specified key.
     * 
     * Precondition: The dictionary has been properly initialized, and the value is
     * not null and is passed as argument.
     * 
     * Postcondition: The value with the corresponding key is return from the
     * Dictionary.
     * 
     * @param K key the key to loop up
     * @return the value of the corresponding, or null if the key does not exist.
     */
    public V lookup(K key);

    /**
     * Gets the number of key-value pairs currently stored in the dictionary.
     * 
     * Pre-condition: The dictionary's internal `keys` and `values` ArrayLists
     * have been properly initialized (not null).
     * 
     * Post-condition: The state of the dictionary remains unchanged.
     * The returned value accurately reflects the current number of elements.
     * 
     * @return The current number of key-value pairs (the logical size) stored in
     *         the dictionary.
     *         This is equivalent to the number of elements in the `keys` array (and
     *         `values` array).
     * 
     * @throws NullPointerException If the `keys` internal array (or `values` array,
     *                              if its state
     *                              is checked for size) is `null` at the time of
     *                              invocation. This
     *                              indicates an
     *                              improperly initialized dictionary internal
     *                              state.
     */
    public int getSize();

    /**
     * Removes all key-value pairs from the dictionary, making it empty.
     * 
     * Pre-condition: The dictionary's internal `keys` and `values` ArrayLists
     * have been properly initialized (not null).
     * 
     * Post-condition: The dictionary will contain zero key-value pairs (`getSize()`
     * will return 0).
     * The internal `keys` and `values` data structures will be empty, but they will
     * remain initialized and ready to accept new elements (i.e., they will not be
     * `null`).
     */
    public void clearAll();
}
