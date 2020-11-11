
public class Personne {

	private DateDeNaissance DateDeNaissance;
	private String Nom;
	
	public String Age(){
		return(this.DateDeNaissance.Age());
	}
	
	public String toSrting() {
		return(this.Nom + " né le " + this.DateDeNaissance.toString()  + " : " + this.DateDeNaissance.Age());
	}
	
	public Personne(String Mois, int Jour, int Annee, String Nom) {
		this.DateDeNaissance = new DateDeNaissance(Mois, Jour, Annee);
		this.Nom = Nom;
	}
	
}
