package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		boolean vendeurReconnu = controlLibererEtal.isVendeur(nomVendeur);
		
		
		if (!vendeurReconnu) {
			System.out.println("Mais vous n'etes pas inscrit sur notre marché aujourd'hui");

		} else {
			String donneesEtal[] = controlLibererEtal.libererEtal(nomVendeur);
			String etalOccuper = donneesEtal[0];
			String produit = donneesEtal[1];
			String quantiteInitial  = donneesEtal[2];
			String quantiteVendue = donneesEtal[3];
			if ("true".equals(etalOccuper)) {
				System.out.println("Vous avez vendue " + quantiteVendue + " sur " + quantiteInitial + " " + produit);
				System.out.println("Au revoir " + nomVendeur + " passe une bonne journées");
			}
		}
	}

}
