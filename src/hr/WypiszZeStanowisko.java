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
		ObslugaCSV obslugaCSV = new ObslugaCSV();
		List<Employee> listaPracownikow = obslugaCSV.wczytaj(file);

		System.out.println();
		System.out.println("Zakończenie wczytywania , Rozmiar listy: "+ listaPracownikow.size());
		int i =0;
		double pensja=0;
		double pensjaProgramisty=0;
		for (Employee employee : listaPracownikow) {
			pensja +=employee.getSalary();
			if(employee.getJobTitle().equalsIgnoreCase(job)) {
				++i;
			pensjaProgramisty+= employee.getSalary();
			System.out.println(employee);
			}
		}
		sc.close();
		System.out.println("Tylu pracowników: "+ i);
		System.out.println("Pensja: " + pensja/listaPracownikow.size());
		System.out.println("Pensja na danym stanowisku: " + pensjaProgramisty/i);
		
	}


}
