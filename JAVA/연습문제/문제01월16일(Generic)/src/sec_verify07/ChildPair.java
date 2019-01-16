package sec_verify07;

public class ChildPair<K, V> extends Pair<K,V>{
	K key;
	V value;
	
	public ChildPair(K key, V value) {
		super(key, value);
		this.key =key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	
}
