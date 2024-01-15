import java.util.ArrayList;
import java.util.List;

public class Ecole {
	String nom;
	TypeEcole typeEcole;
	List<Personne> listePersonnes = new ArrayList<Personne>();

	public Ecole(String nom,TypeEcole ecole) {
		this.nom = nom;
		this.typeEcole = ecole;
	}


	public void ajouterPersonne(Personne personne) {
		listePersonnes.add(personne);
	}

	public void supprimerPersonne(Personne personne) {
		listePersonnes.remove(personne);
	}

	public List<Intervenant> getDynamicListIntervenants() {
		List<Intervenant> listeIntervenant = new ArrayList<Intervenant>();
		for (int i = 0; i < listePersonnes.size();i++) {
			if (listePersonnes.get(i) instanceof Intervenant) {
				listeIntervenant.add((Intervenant) listePersonnes);
			}
		}
		return listeIntervenant;
	}

	public List<Etudiant> getDynamicListEtudiant() {
		List<Etudiant> listeEtudiant = new ArrayList<Etudiant>();
		for (int i = 0; i < listePersonnes.size();i++) {
			if (listePersonnes.get(i) instanceof Etudiant) {
				listeEtudiant.add((Etudiant) listePersonnes);
			}
		}
		return listeEtudiant;
	}

	public Float getMoyenneEtudiantByClasse(Classe c) {
		Float accumulateur = null;
		int incrementateur = 0;
		for (int i = 0; i < listePersonnes.size() ; i++ ) {
			if (listePersonnes.get(i) instanceof Etudiant && listePersonnes.get(i).getClasse() == c) {
				for (int j = 0; j < ((Etudiant)listePersonnes.get(i)).getNotes().size(); j++) {
					accumulateur += ((Etudiant)listePersonnes.get(i)).getNotes().get(j);
					incrementateur = j;
				}
			}
		}
		return accumulateur/incrementateur;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public TypeEcole getTypeEcole() {
		return typeEcole;
	}
	public void setTypeEcole(TypeEcole typeEcole) {
		this.typeEcole = typeEcole;
	}
	public List<Personne> getListePersonnes() {
		return listePersonnes;
	}
	public void setListePersonnes(List<Personne> listePersonnes) {
		this.listePersonnes = listePersonnes;
	}


}
