package co.develhope.introduction._13;

import java.sql.SQLOutput;

public class While_Loop {

    public static void main(String[] args) {
        int poundsHolding = 10000;
        double poundToEurosRateThreshold = 1.15;
        int cap = 1000;
        int i = 1;



        while (poundsHolding > 0) {
            System.out.println(" giorno = " +i);
            double poundToEurosRate = 1 + (Math.random() * 0.2);
            if (poundToEurosRate > poundToEurosRateThreshold ) {
                if ( poundsHolding > cap) {
                    poundsHolding = poundsHolding - cap;
                } else {
                    poundsHolding = 0;
                }
                }
            i++;
            System.out.println("capitale alla fine del giorno "+ (i-1) + " = " + poundsHolding);
            }

        System.out.println("Hai venduto tutto in " + (i-1) + " giorni");
        }

    }

