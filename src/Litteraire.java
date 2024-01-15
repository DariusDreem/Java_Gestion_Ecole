import javax.swing.SpinnerModel;

public class Litteraire implements Specialite {
String nom = "Litteraire";
int coefficient = 6;
	
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}

	@Override
	public String toString() {
		return "Litteraire [nom=" + nom + ", coefficient=" + coefficient + "]";
	}

	@Override
	public int getCoefficient() {
		// TODO Auto-generated method stub
		return coefficient;
	}

}
