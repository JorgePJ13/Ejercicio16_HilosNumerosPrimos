import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeerNumeros {
 
    public List<Integer> leer(Scanner sc) {
        int num;
        List<Integer> lista = new ArrayList<>(4);
        for (int i = 1; i < 4; i++) {
            System.out.println("Dame el numero " + i + ":");
            num = sc.nextInt();
            lista.add(num);
            System.out.println();
        }
        return lista;
    }

}