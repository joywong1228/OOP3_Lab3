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
		// TODO: implement
	}

	@Override
	public boolean insert(K key, V value) throws DuplicateKeyException {
		// TODO: implement
		return false;
	}

	@Override
	public V remove(K key) {
		// TODO: implement
		return null;
	}

	@Override
	public boolean update(K key, V value) {
		// TODO: implement
		return false;
	}

	@Override
	public V lookup(K key) {
		// TODO: implement
		return null;
	}
}