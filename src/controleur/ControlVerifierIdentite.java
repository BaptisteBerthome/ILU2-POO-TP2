package controleur;

import java.util.Iterator;

import personnages.Gaulois;
import villagegaulois.Village;

public class ControlVerifierIdentite {
	private Village village;

	public ControlVerifierIdentite(Village village) {
		this.village = village;
	}

	public boolean verifierIdentite(String nomVendeur) {
		
		Gaulois vendeur = village.trouverHabitant(nomVendeur);
		if (village.getNom() == vendeur.getNom()){
			
		}else{
			for (int i = 0; i <= village.donnerVillageois().length; i++){
				
				
			}
		}
		return false;
	}
}
