package frontiere;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		boolean nomVendeurConnu = controlPrendreEtal.verifierIdentite(nomVendeur);
		if (!nomVendeurConnu) {
			System.out.println("Je suis desolé " + nomVendeur + " mais il faut être un habitant de notre village pour vendre au marché");
		} else {
			System.out.println("Bonjours " + nomVendeur + " je vais regarder si je peut vous trouver une étal ...");
			boolean etalDisponible = controlPrendreEtal.resteEtals();
			if (!etalDisponible) {
				System.out.println("Désoler " + nomVendeur + " je n'est plus d'étals disponible");
			} else {
				installerVendeur(nomVendeur);
			}
		}
		
	}

	private void installerVendeur(String nomVendeur) {
		System.out.println("C'est parfait, il me reste une étal pour vous");
		System.out.println("Il me faudrais quelques renseignements");
		String produit = Clavier.entrerChaine("Quelles produits voulais vous vendre");
		int nbProduit = Clavier.entrerEntier("Combien souhaitez vous vendre");
		int numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		if (numeroEtal != -1) {
			System.out.println("Le vendeur " + nomVendeur + " c'est installée a l'étal " + numeroEtal+1);;
		}
	}
}
