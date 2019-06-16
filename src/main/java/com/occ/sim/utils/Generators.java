package com.occ.sim.utils;

import java.util.Random;

public class Generators {

    private static Random random = new Random();

    public static Double getDouble() {
        int power = random.nextInt(2);
        return random.nextDouble() * Math.pow(-1.0, power);
    }

}
