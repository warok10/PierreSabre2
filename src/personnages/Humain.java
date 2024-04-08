
package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;

	
	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoisson() {
		return boisson;
	}
	
	
	public void direBonjour() {
		String texte = "Bonjour ! je m'appelle " +  getNom() +" et j'aime boire du " + boisson;
		parler(texte);
	}
	
	
	public void Boire() {
		String texte = "Mmm, un bon verre de  " +boisson +" ! GLOUPS";
		parler(texte);
	}
	
	public void acheter(String bien,int prix) {
		String texte;
		if (argent>=prix) {
			texte = "j'ai "+ argent+ " Je vais pouvoir m'offrir une "+ bien +" à "+ prix + " sous";
			argent-=prix;}
		else 
			texte = "Je n'ai plus que " + argent + " je ne peux pas m'offrir un "+ bien +" à "+ prix;
		parler(texte);
	}
	
	public void parler(String texte) {
		System.out.println("("+ getNom()+") - " + texte );
	}
	public void perdreArgent(int argentPerdu) {
		argent-=argentPerdu;
	}
	public void gagnerArgent(int argentGagner) {
		argent-=argentGagner;
	}
	
}
