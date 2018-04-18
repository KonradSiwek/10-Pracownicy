package hr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObslugaCSV {

	public static List<Employee> wczytaj(File plik) {
		List<Employee> list = new ArrayList<>();
		try (Scanner sc = new Scanner(plik)){
			while(sc.hasNextLine()) {
				String employee = sc.nextLine();
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Nie wczytano pliku , metoda zwraca pustą listę");
		}
		
			
		return list;
	
	}
}
