package com.weco;

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
NEW.Class - Constructeur - this - Attribut - OBJET/instance
//-------------------------------------------------------------------------------------
// Class App  MAIN CLASS
	public class App
	{
		public static void main(String []args)
		{
			System.out.println("-----------------------------------");
			// For Cat
			System.out.println("For CAT ");
			System.out.println("--------------");
			Cat miaou = new Cat("Kito", 1); // Instanciation de l'objet miaou
			Cat miaou2 = new Cat("Felix", 5); // Instanciation de l'objet miaou2

			System.out.println("--------------   ----------------");
			
			// For Player
			System.out.println("For PLAYER ");
			System.out.println("--------------");
			Player p1 = new Player();// Instanciation de l'objet p1
			p1.attack(); //Appel à la methode attack()

			
        System.out.println("--------------   ----------------");
        
        // For SoftwareRegistration
		 System.out.println("For <<"+ SoftwareRegistration.getNumberOfRegistration() +">> Software Registration ");
        System.out.println("For Software Registration ");
        System.out.println("--------------");
        SoftwareRegistration sr = new SoftwareRegistration(2020);// Instanciation de l'objet p1
		sr.setExpirationYear(2050);// setters
        System.out.println("Changement de date : " + sr.getExpirationYear()); // getters
        System.out.println("-----------------------------------");
        
        	// For Table
 		System.out.println("For Table");
 		System.out.println("--------------");
 		Table tab1 = new Table();// Instanciation de l'objet miaou
 		// Instanciation de l'objet miaou2
 		tab1.showTable();
 		System.out.println("---Dimensions");
 		tab1.showTable2();
 		System.out.println("--------------   ----------------");
 		int[] ta = { 1, 2, 3 };
 		tab1.printTab(ta);

		// For String
		System.out.println("For Strings");
		Stringg strr = new Stringg();
		strr.showStrings();
		
		// For Reader data
		System.out.println("For Reader data");
		ReadData read = new ReadData();
		read.showRead();

	}
// Class Cat pour instanciation dans le fichier Cat.java
    public class Cat
    {
        private String aName;// Attribut/variable membres de classe
        private int aAge;// Attribut/variable membres de classe

        public Cat(String name, int age) // Constructeur
        {
            this.aName = name;
            this.aAge = age;

            System.out.println(this.aName + " - " + this.aAge);
        }
	}
// Class Player pour instanciation dans le fichier Player.java
	public class Player
	{
		private String aName;// Attribut/variable membres de classe
		private int aLevel;// Attribut/variable membres de classe

		public Player() // Constructeur(...)
		{
			this.aName = "Inconnu";
			this.aLevel = 1;
			System.out.println(this.aName + " : " + " L " + this.aLevel);
		}

		public void attack() // Methode attack()
		{
			System.out.println(this.aName + " attaque un cible !");
		}
	}
//-------------------------------------------------------------------------------------
//	Encapsulation données - SoftwareRegistration - SoftwareRegistration.java
//-------------------------------------------------------------------------------------
//	SoftwareRegistration.java [ACCESSEURS - setter and getter]
public class SoftwareRegistration
{
    // Variable de Classe
    private static int aNumberOfRegistration = 5;

	/*
		[ACCESSEURS]
			getters : accès à un attribut (lecture)
			setters	: modification d'un attribut
	*/
	
	public SoftwareRegistration (int expiration)
	{
		this.aExpirationYear = expiration;
		System.out.println("Enregistrement du produit, valide jusqu'en " + this.aExpirationYear);
	}

    private int aExpirationYear;
    public int getExpirationYear(){ return this.aExpirationYear;} //[ACCESSEURS : Getter]
    public void setExpirationYear(int expiration){ this.aExpirationYear = expiration;} //[ACCESSEURS : setter]

	public static int getNumberOfRegistration(){ return aNumberOfRegistration;} //[ACCESSEURS : Getter]
}
//-------------------------------------------------------------------------------------
//	Tableau - Table 1 & 2 Dimensions - Table.java
//-------------------------------------------------------------------------------------
//	Table.java [] |	* int tab[] / int[] * tab int tab[] = {1, 2, 3}	* int tab[] = new int [3]  * int tab[] = new int[]{1, 2, 3}

package com.weco;

public class Table {
	/* * int tab[] / int[] tab int tab[] = {1, 2, 3} int tab[] = new int [3] int tab[] = new int[]{1, 2, 3} */

	public Table() {}

	public int aTable;

	void printTab(int[] t) {
		for (int element : t)
			System.out.println(element);
	}

	void showTable() {
		System.out.println("Tableau à 1 dimension");
		int[] tab = { 1, 2, 3 };
		System.out.println("Form 1");
		System.out.println("-------");

		for (int i = 0; i < tab.length; i++)
			System.out.println(tab[i]);

		System.out.println("Form 2");
		System.out.println("-------");

		for (int number : tab)
			System.out.println(number);
	}

	void showTable2() {
		System.out.println("Tableau à 2 dimension");
		int[][] tab = { { 1, 2, 3 }, { 11, 11, 13 } };
		System.out.println("Form 1");
		System.out.println("-------");

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++)
				System.out.println(tab[i][j]);
		}

		System.out.println("Form 2");
		System.out.println("-------");

		for (int[] k : tab)
			for (int number : k)
				System.out.println(number);
	}
//-------------------------------------------------------------------------------------
//	String | Some Methodes - StringTokenizer - StringBuilder VS StringBuffer
//-------------------------------------------------------------------------------------
//	StringTokenizer - StringBuilder  StringBuffer
	// concat() rapide que "+", length() , toUpperCase(), toLowerCase(), trim(), replace("old","new")
	// charAt("index"), substring("index", "nb"), equals("str"), compareTo("str")
	// length(), capacity(), append("str"), insert("index", "str")

	
	package com.weco;

	import java.util.StringTokenizer;

	public class Stringg {
	    public Stringg() {
	    }

	    /**
	     *
	     * Show Strings
	     * 
	     * <pre></pre>
	     * 
	     * showString1() <br>
	     * showString2() <br>
	     * showString3() <br>
	     */
	    void showStrings() {
		System.out.println("-----------------------------------");
		System.out.println("For Strings");
		System.out.println("--------------   ----------------");
		showString1();
		showString2();
		showString3();
		System.out.println("--------------   ----------------");
		System.out.println("-----------------------------------");
	    }

	    /**
	     *
	     * Test de Methodes sur String
	     * 
	     * <pre>
	     *String : immuable (UnEdit) 
	     *concat() rapide que "+" 
	     *length() , toUpperCase(),
	     *toLowerCase(), trim(),
	     *replace("old","new")
	     *charAt("index")
	     *substring("index", "nb")
	     *equals("str"), compareTo("str")
	     * </pre>
	     */
	    void showString1() {
		System.out.println("--------------String 1");

		String s = "TOTO";
		String s2 = "toto";

		System.out.println("--------------1\n" + "Concat with + \n " + s + " " + s2);
		System.out.println("--------------2 \n" + "concat() \n " + s.concat(" ").concat(s2));
		System.out.println("--------------3 \n" + "length() \n " + s.length());
		System.out.println("--------------4 \n" + "toUpperCase() \n " + s.toUpperCase());
		System.out.println("--------------5 \n" + "toLowerCase() \n" + s.toLowerCase());
		System.out.println("--------------6\n" + "trim() \n" + s.trim());
		System.out.println("--------------7\n" + "replace(O, I) \n" + s.replace("O", "I"));
		System.out.println("--------------8 \n" + "charAt(0) \n" + s.charAt(3));
		System.out.println("--------------9 \n" + "substring(0, 3) \n" + s.substring(0, 3));
		System.out.println("--------------10 \n" + "equals(s2) \n" + s.equals(s2));
		System.out.println("--------------11\n" + "compareTo(s2) \n" + s.compareTo(s2));
	    }

	    /**
	     * Tokenizer : Example
	     * 
	     * <pre></pre>
	     * 
	     * StringTokenizer st = new StringTokenizer(s, "/", true);<br>
	     */
	    void showString2() {

		System.out.println("--------------String 2");

		String s = "news/titre-de-la-news/14";
		StringTokenizer st = new StringTokenizer(s, "/", true);
		while (st.hasMoreTokens())
		    System.out.println(st.nextToken());
	    }

	    /**
	     * StringBuilder VS StringBuffer <br>
	     * 
	     * <pre></pre>
	     * 
	     * StringBuilder(asynchrone) Monothreading : 1 seul thread <br>
	     * StringBuffer(synchronisé, thread-safe) Multi-treading : plusieurs threads
	     * <br>
	     * <br>
	     * >length(), capacity(), append("str"), insert("index", "str") <br>
	     */
	    void showString3() {

		System.out.println("--------------String 3");

		StringBuffer sBuffer = new StringBuffer();

		sBuffer.append(" tout le monde");
		System.out.println(sBuffer);

		sBuffer.insert(0, "Bonjour");
		System.out.println(sBuffer);
	    }
	}
//-------------------------------------------------------------------------------------
//	DataReader | BufferredReader - Scanner
//-------------------------------------------------------------------------------------
//	- read() - readLine() - skip(N) - nextInt() - nextbyte() - . . .
	package com.weco;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Scanner;

	public class ReadData {
	    public ReadData() throws IOException{
		
	    }
	    
	    /**
	     *Show Readers <pre></pre>
	     *	BufferredReader | 	Scanner <br>
	     */
	    void showRead() throws IOException {
		System.out.println("-----------------------------------");
		System.out.println("For ReadData");
		System.out.println("--------------   ----------------");
		readBufferredReader();
		readScanner();
		System.out.println("--------------   ----------------");
		System.out.println("Merci - Have A good Game ");
		System.out.println("-----------------------------------");

	    }
	    
	    /**
	     * BufferredReader <pre></pre> 
	     *		fast for string only  synchrone <br>
	     *		thread-safe | lecture de String <br>
	     *		tampon de 8192 caracteres <br>
	     *		- read() 		: lire un caractere <br> 
	     *		- readLine() 	: line une chaine <br>
	     *		- skip(N) 	: ignore (N) carateres 	<br>	
	     */
	    void readBufferredReader() throws IOException {
		System.out.println("--------------BufferredReader");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Comment t'appelles-tu ? ");
		String name = br.readLine();

		System.out.println("Bonjour " + name);
	    }
	    
	    /**
	     *	Scanner <pre></pre>
	     *		check dataType asynchrone <br>
	     *		not thread-safe <br>
	     *		lecture de donnee + parsing <br>
	     *		tampon de 1024 caracteres <br> 
	     */
	    void readScanner() {
		System.out.println("--------------Scanner");

		Scanner sc = new Scanner(System.in);

		System.out.println("Acceder a quel niveau ? ");
		int game_level = sc.nextInt();

		System.out.println("Niveau " + game_level + "\n" + "Un bon niveau");
	    }
	}

}
