package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio1 {

		public static void main(String[] args) {
			
			String fruta1 = "Abacaxi";
			
			String fruta2 = "Banana";
			
			String fruta3 = "Morango";
			
			ArrayList<String>fruta = new ArrayList<>();
			
			fruta.add(fruta1);
			
			fruta.add(fruta2);
			
			fruta.add(fruta3);
			
			fruta.add("Maça");
			
			fruta.add("Manga");
			
			System.out.println(fruta);
			
			Collections.sort(fruta);
			
			System.out.println(fruta);
			
			String x=fruta.get(0);
			
			fruta.set(3, "Laranja");
			
			System.out.println("A terceira fruta é: "+ fruta.get(3));
			
			System.out.println(fruta.contains("Laranja"));
			
			System.out.println(fruta.contains("Melancia"));
			
			System.out.println(fruta);
			
			fruta.remove(2);
			
			System.out.println(fruta);
			
			fruta.clear();
			
			System.out.println(fruta);
		}

	}