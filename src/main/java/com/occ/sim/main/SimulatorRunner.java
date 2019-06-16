package com.occ.sim.main;

import com.occ.sim.factory.SimulatorFactory;

/**
 * Hello world!
 *
 */
public class SimulatorRunner
{
    public static void main( String[] args ) {
        try {
            while (true) {
                SimulatorFactory.getEvaluatorHelper().evaluateAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
