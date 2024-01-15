import java.util.HashMap;

public class Etudiant extends Personne {
	public Etudiant(String nom, String prenom, Classe classe) {
		super(nom, prenom, classe);
		// TODO Auto-generated constructor stub
	}

	HashMap<Specialite, Float> notes = new HashMap<Specialite, Float>();

	public HashMap<Specialite, Float> getNotes() {
		return notes;
	}

	public void getMoyenne() {
		float accumulateur = 0f;
		for (float note : notes.values()) {
			accumulateur += note;
		}
		System.out.println(accumulateur);
	}

	public void ajouterNote(Specialite specialite, Float note) {
		notes.put(specialite, note);
	}

	public void supprimerNote(Specialite specialite, Float note) {
		notes.remove(specialite, note);
	}

	@Override
	public String toString() {
		return "Etudiant [notes=" + notes + "] [type de l'instance = Etudiant]";
	}

}
