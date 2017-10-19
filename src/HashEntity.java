public class HashEntity<K, T> {

    private K key;
    private T dato;

    public HashEntity(K c, T v) {
        dato = v;
        key = c;
    }

    public K getKey() {
        return key;
    }

    public T getDato() {
        return dato;
    }
}
