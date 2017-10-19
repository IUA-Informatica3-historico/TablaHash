public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>(10);

        try {
            hm.put(4, "Hola");
            hm.put(20, "dos");
            hm.put(53, "tres");
            hm.put(21, "cuatro");
            hm.put(32, "cinco");
            hm.put(38, "seis");
            hm.put(5, "siete");
            hm.remove(5);

            System.out.println("es Vacia: " + hm.esVacia());
            System.out.println("Key  32: " + hm.get(32));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
