package hr;

import java.io.File;
import java.util.List;


public class WypiszPensjeStanowiskami {
	
	public static void main(String[] args) {
		String [] job = new String [18];
		  job[0] ="Programmer";
		  job[1] ="Public Accountant";
		  job[2] ="Accounting Manager";
		  job[3] ="President";
		  job[4] ="Administration Vice President";
		  job[5] ="Finance Manager";
		  job[6] ="Accountant";
		  job[7]="Purchasing Manager";
		  job[8] ="Purchasing Clerk";
		  job[9] ="Stock Manager";
		  job[10] ="Stock Clerk";
		  job[11] ="Sales Representative";
		  job[12] ="Shipping Clerk";
		  job[13] ="Administration Assistant";
		  job[14] ="Marketing Manager";
		  job[15] ="Marketing Representative";
		  job[16] ="Human Resources Representative";
		  job[17] ="Public Relations Representative";
		
		
		
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
			String stanowisko = employee.getJobTitle();
				++i;
				
				pensjaProgramisty+= employee.getSalary();
				
				System.out.println(stanowisko);
				System.out.println("Pensja na danym stanowisku: " + pensjaProgramisty/i);
		}

		
			
		
		System.out.println("Średnia pensja: " + pensja/listaPracownikow.size());
}

}
