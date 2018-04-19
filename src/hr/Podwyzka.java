package hr;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Podwyzka {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		List<Employee> listaPoPodwyzkach = new ArrayList<>();
		
			File file = new File("pracownicy1.csv");
			File wyjscie = new File ("pracownicy3.csv");
			ObslugaCSV obslugaCSV = new ObslugaCSV();
			list = obslugaCSV.wczytaj(file);
			System.out.println("Podaj stanowisko do podwyżki");
			String stanowisko =sc.nextLine(); 
			System.out.println("Podaj wysokość podwyżki: ");
			int zmiana = sc.nextInt();
			
			for (Employee employee : list) {
				
				if(employee.getJobTitle().equalsIgnoreCase(stanowisko)) {
				employee.setSalary(employee.getSalary()+zmiana);
				System.out.println(employee);
				listaPoPodwyzkach.add(employee);
				}
			}
			obslugaCSV.zapisz(listaPoPodwyzkach, wyjscie);
			sc.close();
			}


}
