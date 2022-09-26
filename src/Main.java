import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        Hashtable<Integer, String> prueba = new Hashtable<>();
        prueba.put(10, "Carlos");
        prueba.putIfAbsent(10, "FISH");
        prueba.put(7, "Messi");
        prueba.put(11, "Mati");
        Enumeration<Integer> keys = prueba.keys();
        while (keys.hasMoreElements()) {
            int key = keys.nextElement();
            prueba.put(key, prueba.get(key) + "!");
        }
        System.out.println(prueba);
    }
}