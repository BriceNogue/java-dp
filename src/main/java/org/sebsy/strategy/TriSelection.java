package org.sebsy.strategy;

import org.sebsy.strategy.Interfaces.Strategy;

public class TriSelection implements Strategy {
    @Override
    public void trier(int[] tableau) {
        int n = tableau.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (tableau[j] < tableau[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = tableau[minIdx];
            tableau[minIdx] = tableau[i];
            tableau[i] = temp;
        }
    }
}
