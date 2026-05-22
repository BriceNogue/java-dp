package org.sebsy.strategy;

import org.sebsy.strategy.Interfaces.Strategy;

public class TriInsertion implements Strategy {
    @Override
    public void trier(int[] tableau) {
        int n = tableau.length;
        for (int i = 1; i < n; ++i) {
            int cle = tableau[i];
            int j = i - 1;
            while (j >= 0 && tableau[j] > cle) {
                tableau[j + 1] = tableau[j];
                j = j - 1;
            }
            tableau[j + 1] = cle;
        }
    }
}
