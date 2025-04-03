package controleur;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlAfficherVillageTest {
	
	private Village village;
	private ControlAfficherVillage affichervillage;
	private Gaulois gaulois;
	private Chef chef;
	
	@BeforeEach
	public void initialiserSituation() {
		gaulois = new Gaulois("Abracadabra", 12);
		chef = new Chef("chef", 14, village);
		village = new Village("le village des irréductibles", 10, 5);
		affichervillage = new ControlAfficherVillage(village);
		village.ajouterHabitant(gaulois);
		village.setChef(chef);
	}

	@Test
	void testControlAfficherVillage() {
		assertNotNull(affichervillage,"Constructeur ne renvoie pas null");
	}

	@Test
	void testDonnerNomsVillageois() {
		assertEquals(affichervillage.donnerNomsVillageois()[0], "chef");
		assertEquals(affichervillage.donnerNomsVillageois()[1], "Abracadabra");
		assertEquals(affichervillage.donnerNomsVillageois().length, 2);
	}

	@Test
	void testDonnerNomVillage() {
		assertEquals(affichervillage.donnerNomVillage(), "le village des irréductibles");
	}

	@Test
	void testDonnerNbEtals() {
		assertEquals(affichervillage.donnerNbEtals(), 5);
	}

}
