package histoire;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.Boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);

	}

}