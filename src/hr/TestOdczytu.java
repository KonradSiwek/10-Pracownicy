package hr;

import java.io.File;
import java.util.List;

public class TestOdczytu {

	public static void main(String[] args) {
		File file = new File("pracownicy.csv");
		System.out.println("Zaczynamy czytać plik");
		ObslugaCSV obslugaCSV = new ObslugaCSV();
		List<Employee> listaPracownikow = obslugaCSV.wczytaj(file);

		System.out.println();
		System.out.println("Zakończenie wczytywania , Rozmiar listy: "+ listaPracownikow.size());
		
		for (Employee employee : listaPracownikow) {
			System.out.println(employee);
		}
	}

}
