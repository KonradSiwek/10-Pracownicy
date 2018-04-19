package hr;

import java.io.File;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TestZapisu {

	public static void main(String[] args) {
		List <Employee> lista  = new LinkedList<>();
		 lista.add(new Employee(1, "Ala", "Kowalska", "nauczycielka", 3500, LocalDate.of(2005, 6, 7), "szkoła podstawowa", "Jasna 24", "01-234", "Warszawa", "Polska"));
	   	 lista.add(new Employee(2, "Ola", "Malinowska", "kierowca", 3500, LocalDate.of(2009, 6, 7), "firma transportowa", "Ciemna 24", "02-432", "Warszawa", "Polska"));
	   	 
	   	 File plik = new File("nowy.csv");
	   	ObslugaCSV obslugaCSV = new ObslugaCSV();
	   	 obslugaCSV.zapisz(lista, plik);
	   	 System.out.println("Gotowe");

	}

}
