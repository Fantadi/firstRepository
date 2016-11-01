/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fantastic
 */
public class TabAlgosTest {

    public TabAlgosTest() {
    }

    /**
     * Fonction permettant de tester le calcul la moyenne des 
     * valeurs d'un tableau.
     */
    @Test
    public void testMoyenne() {
        System.out.println("Test de la moyenne");
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double expResult = 55d / 10;
        double result = TabAlgos.moyenne(tab);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Fonction permettant de tester le calcul la médiane des 
     * valeurs d'un tableau.
     */
    @Test
    public void testMediane() {
        System.out.println("Test de la mediane");
        int[] tab = {7, 7, 8, 10, 11, 14};
        int expResult = 9;
        int result = TabAlgos.mediane(tab);
        assertEquals(expResult, result);
    }
    
    /**
     * Fonction permettant de tester l'identification la plus grande des 
     * valeurs dans un tableau.
     */
    @Test
    public void testPlusGrand() {
        System.out.println("Test du plus Grand");
        int[] tab = {1, 2, 4, 6, 2, 5, 5, 8, 5, 45, 2};
        int expResult = 45;
        int result = TabAlgos.plusGrand(tab);
        assertEquals(expResult, result);
    }

    /**
     * Fonction permettant de vérrifier que le test d'égalité
     * de deux tableaux fonctionne correctement
     */
    @Test
    public void testEgaux() {
        System.out.println("Test des tableaux égaux");
        int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tab2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean expResult = true;
        boolean result = TabAlgos.egaux(tab1, tab2);
        assertEquals(expResult, result);

        int[] tab3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tab4 = {1, 2, 3, 4, 5, 4, 7, 8, 9, 10};
        boolean expResult2 = false;
        boolean result2 = TabAlgos.egaux(tab3, tab4);
        assertEquals(expResult2, result2);
    }

    /**
     * Fonction permettant de vérrifier que le test de similitude
     * de deux tableaux fonctionne correctement.
     */
    @Test
    public void testSimilaires() {
        System.out.println("Test des tableaux similaires");
        int[] tab1 = {1, 2, 3, 5, 4, 6, 7, 8, 9, 10};
        int[] tab2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean expResult = true;
        boolean result = TabAlgos.similaires(tab1, tab2);
        assertEquals(expResult, result);

        int[] tab3 = {1, 2, 3, 5, 4, 6, 6, 8, 9, 10};
        int[] tab4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean expResult2 = false;
        boolean result2 = TabAlgos.similaires(tab3, tab4);
        assertEquals(expResult2, result2);
    }
    
}
