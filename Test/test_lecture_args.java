import java.lang.NumberFormatException;

public class test_lecture_args {
	public static void main (String args[]){


		System.out.println(args.length + " arguments detectés. Voici leur valeur :");
		int somme = 0;

		for (int i=0; i<args.length; i++) {
			
			boolean success = true;

			try{ // On essaye de convertir l'argument donné en entier
				Integer.parseInt(args[i]);	
			}
			catch(NumberFormatException e){ // Si l'argument NE peut PAS être convertit en entier
				System.out.println("Erreur de conversion avec : " + args[i]);
				success = false;
			}
			if (success){ // Si l'argument peut être convertit en entier
				somme += Integer.parseInt(args[i]);
			}
			System.out.println("Argument " + i + " : " + args[i]);
			System.out.println("Somme partielle : " + somme);
	  	} 
	  	System.out.println("Somme totale : " + somme); // Ici j'additionne les arguments qui peuvent être convertis en entiers 
	  	//mais on pourrait très bien les utiliser pour en faire autre chose ! C'est histoire de voir que ça marche.
    }
}