class MyEntry<K, V> {
	K key;
	V value;

	MyEntry(K key, V value) {
		this.key = key;
		this.value = value;
	}
}

public class MyMap<K, V> {

	int capacity;
	MyEntry<K, V>[] map;
	int size;

	MyMap() {
		capacity = 4;
		map = new MyEntry[capacity];
		size = 0;
	}

	public void put(K key, V value) {
		boolean insert = true;
		for(int i=0;i<size;i++) {
			if(map[i].key == key) {
				map[i].value = value;
				insert = false;
			}
		}
		if(insert) {
			ensureCapacity();
			map[size] = value;
			size++;
		}
	}

	private void ensureCapacity() {
		if(size>=map.length) {
			capacity = *2;
			map = Arrays.copyOf(map, capacity); 
		}
	}

	public V get(K key) {
		for(int i=0;i<size;i++) {
			if(map[i].key.equals(key)) {
				return map[i].value;
			}
		}
		return null;
	}

	public void remove(K key) {
		for(int i=0;i<size;i++) {
			if(map[i].key == key) {
				map[i] = null;
				size--;
				condenseArray(i);
			}
		}
	}

	public void condenseArray(int start) {
		for(int i=start; i<size; i++) {
			map[i] = map[i+1];
		}
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyMap<Character, String> map = new MyMap<String, Integer>();

		System.out.println(map.size());


	}
}