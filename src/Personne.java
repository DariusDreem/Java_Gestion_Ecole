import java.util.ArrayList;
import java.util.List;

public class Personne {
	String nom;
	String prenom;
	Classe classe;
	List <Specialite> specialites = new ArrayList<Specialite>();

	public Personne(String nom,String prenom,Classe classe) {
		this.nom = nom;
		this.prenom = prenom;
		this.classe = classe;
	}


	public void ajouterSpecialite(Specialite specialite) {
		specialites.add(specialite);
	}

	public void supprimerSpecialite (Specialite specialite) {
		specialites.remove(specialite);
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public List<Specialite> getSpecialites() {
		return specialites;
	}
	public void setSpecialites(List<Specialite> specialites) {
		this.specialites = specialites;
	}


	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", classe=" + classe + ", specialites=" + specialites + "]";
	}


}
