package hr;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Podwyzka2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		List<Employee> listaPoPodwyzkach = new ArrayList<>();
			File file = new File("pracownicy1.csv");
			File wyjscie = new File ("pracownicy2.csv");
			ObslugaCSV obslugaCSV = new ObslugaCSV();
			list = obslugaCSV.wczytaj(file);
			
			int zmiana = 333;
			
			for (Employee employee : list) {		
				employee.setSalary(employee.getSalary()+zmiana);
				System.out.println(employee);
				listaPoPodwyzkach.add(employee);
				}
			obslugaCSV.zapisz(listaPoPodwyzkach, wyjscie);
			sc.close();
			}

}
