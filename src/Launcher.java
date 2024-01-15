import java.util.IllegalFormatException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		String input;
		Specialite Scientifique = new Scientifique();
		Specialite Litteraire = new Litteraire();
		Specialite Economie = new Economie();
		Scanner scanner = new Scanner(System.in);
		Ecole ecole = new Ecole(null, null);
		Etudiant etudiant1 = new Etudiant("oui", "non", null);
		etudiant1.ajouterSpecialite(Economie);
		etudiant1.ajouterSpecialite(Scientifique);
		((Etudiant) etudiant1).ajouterNote(Economie, 20.00f);
		System.out.println( etudiant1.getNotes().keySet());

		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Comment voulez vous nommer votre école ? Vous pouvez quitter a n'importe quel moment en entrant 'q'");
		ecole.setNom(scanner.nextLine()); 	
		System.out.println("Quel type d'école est-ce que ce sera ?");
		System.out.println("PRIMAIRE ? COLLEGE ? LYCEE ? UNIVERSITE ?");
		while(true ) {
			try {
				input = scanner.nextLine();
				switch (input) {
				case "PRIMAIRE": {
					ecole.setTypeEcole(TypeEcole.PRIMAIRE);
					break;
				}
				case "COLLEGE": {
					ecole.setTypeEcole(TypeEcole.COLLEGE);
					break;
				}
				case "LYCEE": {
					ecole.setTypeEcole(TypeEcole.LYCEE);
					break;
				}
				case "UNIVERSITE": {
					ecole.setTypeEcole(TypeEcole.UNIVERSITE);
					break;
				}
				case "q":{
					System.out.println("vous quittez donc le programme");
					return;
				}
				default: {
					throw new NoSuchElementException();
				}
				}
				break;
			}
			catch (NoSuchElementException e)
			{
				System.out.println("Veuillez entrez l'une des options valide qui sont: PRIMAIRE,COLLEGE,LYCEE,UNIVERSITE");
			}
		}
		System.out.println("Vous avez bien créez une école " + ecole.getTypeEcole());
		do {
			System.out.println("voulez vous enregistrez un ETUDIANT ou un INTERVENANT ?");
			while (true) {
				try {
					input = scanner.nextLine();
					switch (input) {
					case "ETUDIANT": {
						ecole.ajouterPersonne(new Etudiant(null, null, null));
						System.out.println("Etudiant ajouté.");
						break;
					}
					case "INTERVENANT": {
						ecole.ajouterPersonne(new Intervenant(null, null, null));
						System.out.println("Intervenant ajouté.");
						break;
					}
					case "q": {
						System.out.println("vous quittez donc le programme");
						return;
					}
					default: {
						System.out.println("Veuillez entrez l'une des options valide qui sont: ETUDIANT ou INTERVENANT");
						continue;
					}
					}
					break;
				} catch (NoSuchElementException e) {
					System.out.println("Veuillez entrez l'une des options valide qui sont: ETUDIANT ou INTERVENANT");
				}
			}
			ecole.ajouterPersonne(new Personne(null, null, null));
			System.out.print("Quel est son nom ? : ");
			ecole.listePersonnes.get(ecole.listePersonnes.size()-1).setNom(scanner.nextLine());
			System.out.println();
			System.out.print("quel est son prenom ? : ");
			ecole.listePersonnes.get(ecole.listePersonnes.size()-1).setPrenom(scanner.nextLine());
			System.out.println();
			System.out.print("quel est sa classe NV1 , NV2 , NV3 , NV4 , NV5 ?: ");
			while(true) {
				try {
					input = scanner.nextLine();
					switch (input) {
					case "NV1": {
						ecole.listePersonnes.get(ecole.listePersonnes.size()-1).setClasse(Classe.NV1);
						System.out.println("Le profil appartiendra donc a la classe "+ ecole.listePersonnes.get(ecole.listePersonnes.size()-1).getClasse() );
						break;
					}
					case "NV2": {
						ecole.listePersonnes.get(ecole.listePersonnes.size()-1).setClasse(Classe.NV2);
						System.out.println("Le profil appartiendra donc a la classe "+ ecole.listePersonnes.get(ecole.listePersonnes.size()-1).getClasse() );
						break;
					}
					case "NV3": {
						ecole.listePersonnes.get(ecole.listePersonnes.size()-1).setClasse(Classe.NV3);
						System.out.println("Le profil appartiendra donc a la classe "+ ecole.listePersonnes.get(ecole.listePersonnes.size()-1).getClasse() );
						break;
					}
					case "NV4": {
						ecole.listePersonnes.get(ecole.listePersonnes.size()-1).setClasse(Classe.NV4);
						System.out.println("Le profil appartiendra donc a la classe "+ ecole.listePersonnes.get(ecole.listePersonnes.size()-1).getClasse() );
						break;
					}
					case "NV5": {
						ecole.listePersonnes.get(ecole.listePersonnes.size()-1).setClasse(Classe.NV5);
						System.out.println("Le profil appartiendra donc a la classe "+ ecole.listePersonnes.get(ecole.listePersonnes.size()-1).getClasse() );
						break;
					}
					case "q":{
						System.out.println("vous quittez donc le programme");
						return;
					}
					default: {
						throw new NoSuchElementException();
					}
					}
				}catch(NoSuchElementException e)
				{
					System.out.println("Veuillez entrez l'une des options valide qui sont: NV1 , NV2 , NV3 , NV4 ou NV5");
					continue;
				}
				break;
			}
			System.out.println("Quels spécialité a t'il ? SCIENTIFIQUE , LITTERAIRE , ECONOMIE ou exit quand vous aurez fini");
			while (true) {
				try {
					input = scanner.nextLine();
					switch (input) {
					case "SCIENTIFIQUE": {
						ecole.listePersonnes.get(ecole.listePersonnes.size()-1).ajouterSpecialite(Scientifique);
						break;
					}
					case "LITTERAIRE": {
						ecole.listePersonnes.get(ecole.listePersonnes.size()-1).ajouterSpecialite(Litteraire);
						break;
					}
					case "ECONOMIE": {
						ecole.listePersonnes.get(ecole.listePersonnes.size()-1).ajouterSpecialite(Economie);
						break;
					}
					case "q":{
						System.out.println("vous quittez donc le programme");
						return;
					}
					case "exit": {
						break;
					}
					default: {
						System.out.println("Veuillez entrez l'une des options valide qui sont: SCIENTIFIQUE, LITTERAIRE ou ECONOMIE");
						continue;
					}
					}
					System.out.println("Spécialité ajoutée avec succès !");
					System.out.println("Voulez-vous ajouter une autre spécialité ? (Oui/Non)");
					if (scanner.nextLine().equalsIgnoreCase("non")) {
						break;
					}
				} catch(NoSuchElementException e) {
					System.out.println("Veuillez entrez l'une des options valide qui sont: SCIENTIFIQUE, LITTERAIRE ou ECONOMIE");
					continue;
				}
			}
			System.out.println("Profil créé avec succés : "+ecole.listePersonnes.get(ecole.listePersonnes.size()-1));

			System.out.println("Voulez vous enregistrer quelqu'un d'autre ? continue ou exit.");
			while(true) {
				try {
					switch (scanner.nextLine()){
					case "exit": {
						input="exit";
						System.out.print("vous allez donc quitter le programme");
						break;
					} 
					case "continue":{
						input="continue";
						break;
					}
					case "q":{
						System.out.println("vous quittez donc le programme");
						return;
					}
					}
				}catch(NoSuchElementException e) {
					System.out.println("Veuillez entrez l'une des options valide qui sont: exit ou continue");
					continue;
				}
				finally {}
				break;
			}
		}while(input.equals("continue"));
	}
}
