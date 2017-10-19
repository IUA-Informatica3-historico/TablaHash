public class HashMap<K, T> {
    private HashEntity<K, T>[] tabla;
    private int tamanio;

    HashMap(int tamanio) {
        this.tamanio = tamanio;
        tabla = new HashEntity[tamanio];

    }

    public void put(K c, T v) throws Exception {
        int pos = inRange(c);
        if (tabla[pos] != null)
            throw new Exception();

        tabla[pos] = new HashEntity<>(c, v);

    }

    public T get(K c) throws Exception {
        int pos = inRange(c);
        if (tabla[pos] == null)
            throw new Exception();

        return tabla[pos].getDato();
    }

    public void remove(K c) throws Exception {
        int pos = inRange(c);
        if (tabla[pos] == null)
            throw new Exception();

        tabla[pos] = null;
    }

    private int funcHash(K c) {
        return Integer.parseInt("" + c);
    }

    private int inRange(K c) {
        return funcHash(c) % tamanio;
    }

    public boolean esVacia() {
        for (int i = 0; i < tamanio; i++) {
            if (tabla[i] != null)
                return false;
        }
        return true;
    }
}
