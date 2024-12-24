package exercicio2polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Entity;
import entities.FisicalPerson;

public class Main {

	public static void main(String[] args) {
		int taxPayersNum;
		List<Entity> taxList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of tax payers: ");
		taxPayersNum = sc.nextInt();
		for(int i=1 ;i<=taxPayersNum; i++ ) {
			char option;
			System.out.println("Tax payer # " + i);
			System.out.println("Individual or Company (c/i)");
			option = sc.next().charAt(0);
			if(option == 'i') {
				System.out.println("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("year income : ");
				Double income = sc.nextDouble();
				System.out.println("Health expenditures: ");
				Double healthExpends = sc.nextDouble();
				Entity individual = new FisicalPerson(name, income, healthExpends);
				taxList.add(individual);
				}else if (option == 'c'){
				System.out.println("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("year income : ");
				Double income = sc.nextDouble();
				System.out.println("number of employees: ");
				int employesnum = sc.nextInt();
				Entity company = new Company(name, income, employesnum);
				taxList.add(company);
			}

			
		}
		System.out.println("TAXES TO PAY: ");
		for(Entity ent: taxList) {
			System.out.println(ent.getName() + ": " + ent.tax());
		}
		sc.close();

	}

}
