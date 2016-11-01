/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fantastic
 */
public final class TabAlgos {

    /**
     *
     */
    private TabAlgos() {
    }

    /**
     * Calcul la moyenne des valeurs d'un tableau.
     *
     * @param tab : le tableau.
     * @return moyenne
     */
    public static double moyenne(final int[] tab) {
        double moyenne = 0d;
        for (int v : tab) {
            moyenne += v;
        }
        return moyenne / tab.length;
    }

    /**
     * Renvoie la valeur mediane des valeurs d'un tableau.
     *
     * @param tab : le tableau.
     * @return La médiane du tableau.
     */
    public static int mediane(final int[] tab) {
        int[] tabTrie = getVersionTrieeCroissant(tab);
        if (tabTrie.length % 2 == 0) {
            int moitie = tab.length / 2;
            return (tab[moitie - 1] + tab[moitie]) / 2;
        } else {
            return tab[(tab.length + 1) / 2];
        }
    }

    /**
     * Renvoie la valeur la plus grande d'un tableau.
     *
     * @param tab : Le tableau.
     * @return La plus grande valeur.
     */
    public static int plusGrand(final int[] tab) {
        if (tab.length == 0) {
            return -1;
        }
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        return max;
    }

    /**
     * Teste si 2 tableaux sont identiques
     * (avec les elements dans le même ordre).
     *
     *
     * @param tab1 : premier tableau.
     * @param tab2 : deuxième tableau.
     * @return booleéen précisant si les tableaux sont égaux.
     */
    public static boolean egaux(final int[] tab1, final int[] tab2) {
        int taille = tab1.length;
        if (taille != tab2.length) {
            return false;
        }
        for (int i = 0; i < taille; i++) {
            if (tab1[i] != tab2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Teste si 2 tableaux sont similaires
     * (les elements peuvent etre dans un ordre différent).
     *
     *
     * @param tab1 : premier tableau.
     * @param tab2 : deuxième tableau.
     * @return booleéen précisant si les tableaux sont similaires.
     */
    public static boolean similaires(final int[] tab1, final int[] tab2) {
        int[] trieTab1 = getVersionTrieeCroissant(tab1),
                trieTab2 = getVersionTrieeCroissant(tab2);
        return egaux(trieTab1, trieTab2);
    }

    /**
     * Fournis une copie triée du tableau (ordre croissant)
     * en utilisant le tri par insertion.
     *
     * @param tab : le tableau.
     * @return la copie triée du tableau.
     */
    private static int[] getVersionTrieeCroissant(final int[] tab) {
        int taille = tab.length, j;
        int[] copie = new int[taille];
        for (int i = 0; i < taille; i++) {
            j = i - 1;
            copie[i] = tab[i];
            while (j >= 0 && copie[j] > copie[i]) {
                int tmp = copie[i];
                copie[i] = copie[j];
                copie[j] = tmp;
                j--;
            }
        }
        return copie;
    }

}
