package utilities;

/**
* DictionaryADT.java
*
* @author Jessie Tang, Kwan Ting Wong
* @version major.minor revision number starting at 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of Dictionary for the DictionaryADT Lab. 
*/

public interface DictionaryADT<K,V>
{
/**
 * Inserts a new key-value pair into the dictionary.
 *
 * Precondition: The dictionary has been properly initialized, and key/value are not null.
 *
 * Postcondition: A new key-value pair is added if the key does not already exist.
 *
 * @param key the key to insert
 * @param value the value to associate with the key
 * @return true if the pair is inserted successfully, false if the key already exists
 * @throws NullPointerException if key or value is null
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
 * @return true if the key-value pair was removed, false if the key was not found
 * @throws NullPointerException if key is null
 */
public boolean remove(K key);
    /**
     * Updates the value associated with the given key.
     * 
     * Precondition: The dictionary has been properly initialized, and the value is not null and is passed as argument.
     * 
     * Postcondition: The value with the corresponding key is successfully updated in the Dictionary. 
     * 
     * @param K key
     * @param V the new value
     * @return true if the system changes the key-value pair successfully,
     * false if the key does not exist
     * 
     * @throws NullPointerException if key or value is null
     */
    public boolean update( K key, V value );

    /**
     * Retrieves the value associated with the specified key.
     * 
     * Precondition: The dictionary has been properly initialized, and the value is not null and is passed as argument.
     * 
     * Postcondition: The value with the corresponding key is return from the Dictionary. 
     * 
     * @param K key the key to loop up
     * @return the value of the corresponding, or null if the key does not exist. 
     */
    public V lookup( K key );

}
