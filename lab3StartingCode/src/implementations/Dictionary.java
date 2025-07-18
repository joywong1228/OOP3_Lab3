package implementations;

import exceptions.DuplicateKeyException;
import java.util.ArrayList;
import utilities.DictionaryADT;

public class Dictionary<K, V> implements DictionaryADT<K, V> {
	private static final int DEFAULT_SIZE = 10;

	private ArrayList<K> keys;
	private ArrayList<V> values;

	public Dictionary() {
		this(DEFAULT_SIZE);
	}

	public Dictionary(int size) {
		this.keys = new ArrayList<>(size);
		this.values = new ArrayList<>(size);
	}

	@Override
	public void create(int size) {
		if (size < 0) {
			throw new IllegalArgumentException("Size must be non-negative");
		}
		keys = new ArrayList<>(size);
		values = new ArrayList<>(size);
	}

	@Override
	public boolean insert(K key, V value) throws DuplicateKeyException {
		if (key == null || value == null) {
			throw new IllegalArgumentException("Key or value is null");
		}
		if (keys.contains(key)) {
			throw new DuplicateKeyException("Duplicate key: " + key);
		}
		keys.add(key);
		values.add(value);
		return true;
	}

	@Override
	public V remove(K key) {
		int index = keys.indexOf(key);
		if (index != -1) {
			keys.remove(index);
			return values.remove(index); // Return the value of the removed key
		} else {
			return null; // Key does not exist
		}
	}

	@Override
	public boolean update(K key, V value) {
		int index = keys.indexOf(key);
		if (index != -1) {
			values.set(index, value);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public V lookup(K key) {
		int index = keys.indexOf(key);
		if (index != -1) {
			return values.get(index);
		} else {
			// Key does not exist
			return null;
		}
	}
}