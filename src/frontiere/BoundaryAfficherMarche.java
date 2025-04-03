package frontiere;

import java.util.Iterator;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String infosMarch[] = controlAfficherMarche.donnerInfosMarche();
		if (infosMarch.length == 0) {
			System.out.println("Le marché est vide revenée plus tard");
		} else {
			System.out.println(nomAcheteur + " , vous trouverez au marcher : ");
			for (int i = 0; i < infosMarch.length; i++) {
				String vendeur = infosMarch[i];
				i++;
				String nbProduit = infosMarch[i];
				i++;
				String produit = infosMarch[i];
				
				System.out.println("- " + vendeur + " qui vend " + nbProduit + " " + produit);
			}
		}
	}
}
