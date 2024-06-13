RESUM-COURS-JAVA
//-------------------------------------------------------------------------------------
types_de_donnees | variables_constantes | operateurs | conditions | boucles
//-------------------------------------------------------------------------------------

	// Installer java sous Linux
		sudo apt install default-jdk
--------------------------------------------------------------cours-01	
	// Les commentaires
		//	un cmtaire sur une ligne
		/*	Des cmtaires sur plusieurs lignes */
--------------------------------------------------------------cours-02
	// Hello World EN JAVA
		// Créer un class dans un fichier.java
			// ====================================================
				class MainApp
				{
					public static void main(String[] args)
					{
						System.out.println("Bonjour tout le monde ! :)");
					}
				}
			// ====================================================
		// Compiler à la main
			javac MainApp.java
		// Execte le programme java
			java MainApp
--------------------------------------------------------------cours-03
	// TYPE DE DONNEES

	TYPE PRIMITIF	|	TYPE "OBJET" ASSOCIE	|	PLACE en MEMOIRE	|
	 boolean		|		Boolean
	 byte			|		Byte
	 char			|		Character	
	 short			|		Short
	 int			|		Integer
	 long			|		Long	
	 float			|		Float
	 double			|		Double
	 
	/*
		bases numeriques	: 	decimale		(10	-> 0 a 9) 	14
								bineaire		(2	-> 0 a 1) 	0b11110111
								octale			(8	-> 0 a 7) 	0755
								hexadecimale	(16	-> 0 a F)	0xAF55
		nombre entier 		: 	14
								18_666
								100_000_000_000
		\n : nouvelle ligne
		\t : tabulation
		\r : retour chariot
		\b : retour arriere
	*/
--------------------------------------------------------------cours-04
	Variables et constantes
	/*
		- Pas de caracteres speciaux, pas d espaces
		- Commence par une lettre ou underscore (_)
		
		uneVariable 	( Camel case)
		UneVariable 	( Pascal case)
		une_variable 	( snake case)
	*/
	// Declaration de variable
		int ageUser = 0 ;
	// Affiche la valeur d'une variable
		System.out.println(ageUser);

--------------------------------------------------------------cours-05
	Operateurs

	//  
			int age = 24: // age <- 23 Affectation (=) 	
			System.out.println("Tu as " + age + " ans"); // Concatenations (+)
	// 	Arthimetiques + - * / % 
			
			int result1 = 5 + 2; //Expression
			int result2 = 5 - 2; //Expression
			int result3 = 5 * 2; //Expression
			int result4 = 5 / 2; //Expression
		// pour gerer la priorité ()
			int result = (4 + 5) * 2; // Gerer la priorité
	/* Comparaison 
		d'egalite == , === pour verifier les types et les valeurs 
		!= < <= > >=   ! && || operateur de negation
	*/
	/* Incrementation et decrementation 
		+= -= *= /= %=   
		++ -- pour ajouter 1
		
		++A pre-incrementation
		--A post-incrementation
		
		A++ post-incrementation
		A-- post-incrementation
		
		
		
		int argent = 0;
		System.out.println(argent);
		
		argent = argent + 10;
		argent =+ 10;// gain de 10
		System.out.println(argent);
		
		argent =+ 100;// Gain de 100
		System.out.println(argent);
		
		--
	 
	*/
--------------------------------------------------------------cours-06
	CONDITIONS
		IF		
			int value = 24;
			
			if(value < 0)
			{
				System.out.println("values < 0");
			}
			else if(value > 100)
			{	
				System.out.println("values > 100");
			}
			else
			{	
				System.out.println(value);
			}
			
		SWITCH
			int option = 1;
			
			switch(option)
			{
				case 1 : 
					/*if(option == 1 )*/
					System.out.println("option = 1");
					break;
				
				default:
					System.out.println("option != 1");
					break;
			}
				
				
			String choice = "y";
			
			switch(choice)
			{
				case "y" : 
					/*if(choice == "y" )*/
					System.out.println("Choice : OUI");
					break;
				
				case "n" : 
					/*if(choice == "y" )*/
					System.out.println("Choice : NON");
					break;
					
				default:
					System.out.println("Choice : Ni oui, ni non");
					break;
			}

		
--------------------------------------------------------------cours-07
	BOUCLES -> while | do{...}while | for(init, condition, incre...){}
 		public class App
		{
			public static void main(String[] args)
			{
				//------------------------------------------------
				System.out.println("------- while ------ ");
				int i = 0;        
				while(i != 10)
				{
					i++;
					
					if(i == 5)
						break; // To stop boucle
						//continue; // To continue iteration
					System.out.println(i);
				}

				//------------------------------------------------
				System.out.println("------- do{...}while ------ ");
				int j = 0;
				do 
				{
					j++;
					
					if(j == 5)
						//break; // To stop boucle
						continue; // To continue iteration
					System.out.println(j);
				}
				while(j != 10);

				//------------------------------------------------
				System.out.println("------- for ------ ");
				//int i;
				for(i = 0; i!= 10; i++)
				{
					System.out.println(i);
				}
			}
		}
//-------------------------------------------------------------------------------------
Class - Constructeur - OBJET/instance - this 
//-------------------------------------------------------------------------------------
// Class App 
    public class App
    {
        public static void main(String []args)
        {
            Cat miaou = new Cat();  // instance/objet de la classe Cat
            Cat miaou2 = new Cat(); // instance/objet de la classe Cat
        }
    }

// Class Cat pour instanciation dans le fichier Cat.java
    public class Cat
    {
        public Cat()
        {
            System.out.println("Je suis un chat" + this);
        }
    }