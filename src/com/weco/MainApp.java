package com.weco;

public class MainApp {
	public static void main(String[] args) {
		/* VARIABLES | CONSTANTES | OPERATEURS | INCREMENTATIONS | COMPARAISONS */
		System.out.println("-------------------\n" + "V A R I A B L E S\n" + "-------------------");
		// variable Declaration, Affectation
		int ageUser = 0;
		// variable Affichage
		System.out.println(ageUser);

		// variable Declaration, Affectation
		ageUser = 24;
		System.out.println(ageUser);

		System.out.println("-------------------\n" + "C O N S T A N T E S\n" + "-------------------");
		// constantes Declaration
		final int ONE_NUMBER = 26;
		System.out.println(ONE_NUMBER);

		// constantes test
		// ONE_NUMBER = 14;
		System.out.println(ONE_NUMBER);

		// Constantes Declaration, Affection
		final float PI = 3;
		System.out.println(PI);

		System.out.println("-------------------\n" + " O P E R A T E U R S \n" + "-------------------");
		System.out.println("Arthimetiques + - * / %");

		int result1 = 5 + 2; // Expression
		int result2 = 5 - 2; // Expression
		int result3 = 5 * 2; // Expression
		int result4 = 5 / 2; // Expression
		int result = (4 + 5) * 2; // Gerer la priorité

		System.out.println("resultat 1 = " + result1 + "\n" + "resultat 2 = " + result2 + "\n" + "resultat 3 = "
				+ result3 + "\n" + "resultat 4 = " + result4 + "\n" + "resultat P = " + result + "\n");

		System.out.println("Concatenations (+)"); //
		int age = 24; // age <- 23 Affectation (=)
		System.out.println("Tu as " + age + " ans"); // Concatenations (+)

		System.out.println("-------------------\n" + "I N C R E M E N T A T I O N S\n" + "-------------------");
		int nb1 = 1;
		int nb2 = ++nb1;// pre-incrementations
		System.out.println(nb1);
		System.out.println(nb2);

		System.out.println("-------------------\n" + "C O M P A R A I S O N S\n" + "-------------------");
		boolean resultb = 14 < 25;
		System.out.println(resultb);

		System.out.println("-------------------\n" + "C O N D I T I O N S \n" + "-------------------");

		System.out.println("----IF");

		int value = 24;

		if (value < 0) {
			System.out.println("values < 0");
		} else if (value > 100) {
			System.out.println("values > 100");
		} else {
			System.out.println(value);
		}
		System.out.println("----------");
		// -----------------------------------------------------------------

		System.out.println("----SWITCH");

		int option = 1;

		switch (option) {
		case 1:
			/* if(option == 1 ) */
			System.out.println("option = 1");
			break;

		default:
			System.out.println("option != 1");
			break;
		}

		String choice = "y";

		switch (choice) {
		case "y":
			/* if(choice == "y" ) */
			System.out.println("Choice : OUI");
			break;

		case "n":
			/* if(choice == "y" ) */
			System.out.println("Choice : NON");
			break;

		default:
			System.out.println("Choice : Ni oui, ni non");
			break;
		}
		System.out.println("----------");
		// -----------------------------------------------------------------
	}
}