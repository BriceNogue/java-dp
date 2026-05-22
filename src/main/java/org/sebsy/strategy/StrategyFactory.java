package org.sebsy.strategy;

import org.sebsy.strategy.Interfaces.Strategy;
import org.sebsy.strategy.enums.TypeTri;

public class StrategyFactory {
    public static Strategy getStrategy(TypeTri type) {
        switch (type) {
            case BUBBLE:
                return new TriBulles();
            case INSERTION:
                return new TriInsertion();
            case SELECTION:
                return new TriSelection();
            default:
                throw new IllegalArgumentException("Type de tri non supporté : " + type);
        }
    }
}
