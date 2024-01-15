
public class Intervenant extends Personne{
public Intervenant(String nom, String prenom, Classe classe) {
		super(nom, prenom, classe);
		// TODO Auto-generated constructor stub
	}

boolean isValidate;

@Override
public String toString() {
	return "Intervenant [isValidate=" + isValidate + "] [type de l'instance = Intervenant]";
}


}
