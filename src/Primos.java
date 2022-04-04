import java.util.ArrayList;
import java.util.List;

public class Primos implements Runnable {

	final List<Integer> lista;

	public Primos(List<Integer> lista) {
		this.lista = lista;
	}

	public void esPrimo() {
		ArrayList<Integer> lista_NoPrimos = new ArrayList<>(4);
		ArrayList<Integer> lista_Primos = new ArrayList<>(4);

		for (int i = 0; i < lista.size(); i++) {
			int num = lista.get(i);

			for (int x = 2; x < num / 2; x++) {
				// Si es divisible por cualquiera de estos números, no
				// es primo
				if (num % x == 0) {
					lista_NoPrimos.add(num);
					break;
				} // sino, es primo
				else {
					lista_Primos.add(num);
					break;
				}

			}

		}

		System.out.println("Esta es la lista de números primos " + lista_Primos + ". Esta es la lista de los números No Primos"
				+ lista_NoPrimos + " del hilo " + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
		esPrimo();

		System.out.println("El hilo ha terminado\n");
	}

}
