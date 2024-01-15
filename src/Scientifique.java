
public class Scientifique implements Specialite {
String nom = "Scientifique";
int coefficient = 10;
@Override
public String getNom() {
	// TODO Auto-generated method stub
	return this.nom;
}
@Override
public int getCoefficient() {
	// TODO Auto-generated method stub
	return coefficient;
}
@Override
public String toString() {
	return "Scientifique [nom=" + nom + ", coefficient=" + coefficient + "]";
}




}
