package hr;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class WypiszPensjeStanowiskami {

	public static void main(String[] args) {
		
		final String job1 ="Programmer";
		final String job2 ="Sales";
		final String job3 ="Public Accountant";
		final String job4 ="Accounting Manager";
		final String job5 = 
		final String job6 = 
		
		File file = new File("pracownicy.csv");
		System.out.println("Zaczynamy czytać plik");
		List<Employee> listaPracownikow = ObslugaCSV.wczytaj(file);

		System.out.println();
		System.out.println("Zakończenie wczytywania , Rozmiar listy: "+ listaPracownikow.size());
		int i =0;
		double pensja=0;
		double pensjaProgramisty=0;
		
                
		for (Employee employee : listaPracownikow) {
			pensja +=employee.getSalary();
			switch(job) {
			case:
			}
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
