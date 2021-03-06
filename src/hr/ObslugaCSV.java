package hr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ObslugaCSV {

	private String separator;
	private String kodowanie;
	public ObslugaCSV () {
		this(";", "windows-1250");
	}
	
	public ObslugaCSV(String separator, String kodowanie) {
		this.separator = separator;
		this.kodowanie = kodowanie;
	}
	public List<Employee> wczytaj(File plik) {
		List<Employee> list = new ArrayList<>();
		try (Scanner sc = new Scanner(plik, kodowanie)) {
			while (sc.hasNextLine()) {
				String linia = sc.nextLine();

				String[] fragmenty = linia.split(separator);
				fragmenty = Arrays.copyOf(fragmenty, 11);

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
	public void zapisz(List<Employee>lista , File plik) {
		try(PrintWriter out = new PrintWriter(plik, kodowanie)) {
			for (Employee employee : lista) {
				out.print(employee.getId()+separator+employee.getFirstName()+separator+employee.getLastName()+separator+employee.getJobTitle()+separator+
						employee.getSalary()+separator+employee.getHireDate()+separator+employee.getDepartmentName()+separator
						+employee.getAddress()+separator+employee.getPostalCode()+separator+employee.getCity()+separator+employee.getCountry());
				out.println();
			}
			
		} catch (FileNotFoundException  | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
