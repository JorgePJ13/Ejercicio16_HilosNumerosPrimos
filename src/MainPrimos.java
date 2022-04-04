import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPrimos {
	
	public static void main(String[] args) {

//		List<Integer> lista_Primos = new ArrayList<Integer>();
//		List<Integer> lista_NoPrimos = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		Primos lista_Primos1 = new Primos(new LeerNumeros().leer(sc));
		Thread t1 = new Thread(lista_Primos1, " Hilo 1 ");
		Primos lista_NoPrimos1 = new Primos(new LeerNumeros().leer(sc));
		sc.close();
		Thread t2 = new Thread(lista_NoPrimos1, " Hilo 2 ");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t1.start();
		t2.start();

	}
}
