package hr;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class WypiszZeStanowisko {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("podaj stanowisko pracownika");
		String job = sc.nextLine();
		
		File file = new File("pracownicy.csv");
		System.out.println("Zaczynamy czytać plik");
		List<Employee> listaPracownikow = ObslugaCSV.wczytaj(file);

		System.out.println();
		System.out.println("Zakończenie wczytywania , Rozmiar listy: "+ listaPracownikow.size());
		int i =0;
		for (Employee employee : listaPracownikow) {
			
			if(employee.getJobTitle().equalsIgnoreCase(job)) {
				++i;
			System.out.println(employee);
			}
		}
		sc.close();
		System.out.println("Tylu pracowników: "+ i);
	}


}
