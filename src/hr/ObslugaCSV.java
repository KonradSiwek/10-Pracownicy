package hr;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObslugaCSV {

	public static List<Employee> wczytaj(File plik) {
		List<Employee> list = new ArrayList<>();
		try (Scanner sc = new Scanner(plik)) {
			while (sc.hasNextLine()) {
				String linia = sc.nextLine();

				String[] fragmenty = linia.split(";");

				int id = Integer.parseInt(fragmenty[0]);
				int salary = Integer.parseInt(fragmenty[4]);
				LocalDate hireDate = LocalDate.parse(fragmenty[5]);

				// jeśli dane są napisami to odczytuję bezpośrednio z tablicy fragment
				// np. fragment[1] - firstName, fragment[2] - lastName, itd.
				Employee emp = new Employee(id, fragmenty[1], fragmenty[2], fragmenty[3], salary, hireDate,
						fragmenty[6], fragmenty[7], fragmenty[8], fragmenty[9], fragmenty[10]);
				list.add(emp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Nie wczytano pliku , metoda zwraca pustą listę");
		}

		return list;

	}
}
