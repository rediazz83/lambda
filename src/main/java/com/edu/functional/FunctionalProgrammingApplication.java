package com.edu.functional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class FunctionalProgrammingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FunctionalProgrammingApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("init program...");

		//Creamos una lista sin orden
		List<String> names = Arrays.asList("Fer", "Juli", "Pam", "Rodri");

		//Solucion pre-java8
		Comparator<String> comparatorByLength = new Comparator<String>() {
			@Override
			public int compare(String s, String t1) {
				return s.length() - t1.length();
			}
		};

		Collections.sort(names, comparatorByLength);
		printList(names);

		//Volvemos a desordenar la lista
		names = Arrays.asList("Fer", "Juli", "Pam", "Rodri");

		//Solucion usando lambda - de 9 lineas reducido a solo 2
		Collections.sort(names, Comparator.comparingInt(String::length));
		printList(names);

		System.out.println("... end promgram");
	}

	private void printList(List<String> names) {
		for (String name: names) {
			System.out.println(name);
		}
	}
}
