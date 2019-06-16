package com.occ.sim.factory;

import com.occ.sim.builders.EmotionBuilder;
import com.occ.sim.builders.ModelBuilder;
import com.occ.sim.builders.VariableBuilder;

public class SimulatorBuilderFactory {

    public VariableBuilder getVariableBuilder() {
        return new VariableBuilder();
    }

    public ModelBuilder getModelBuilder() {
        return new ModelBuilder();
    }

    public EmotionBuilder getEmotionBuilder() {
        return new EmotionBuilder();
    }

}
