package utilities;

/**
* DictionaryADT.java
*
* @author Jessie Tang
* @version major.minor revision number starting at 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of Dictionary for the DictionaryADT Lab. 
*/

public interface DictionaryADT<K,V>
{

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
