package com.occ.sim.builders;

import com.occ.common.VariableType;
import com.occ.entities.Variable;
import com.occ.sim.utils.Generators;

import java.util.ArrayList;
import java.util.List;

public class VariableBuilder {

    private List<Variable> variables;

    public VariableBuilder fromGlobal() {
        this.variables = new ArrayList<>();
        this.variables.add(new Variable(VariableType.SENSE_OF_REALITY, String.valueOf(Math.abs(Generators.getDouble()))));
        this.variables.add(new Variable(VariableType.PROXIMITY, String.valueOf(Math.abs(Generators.getDouble()))));
        this.variables.add(new Variable(VariableType.UNEXPECTEDNESS, String.valueOf(Math.abs(Generators.getDouble()))));
        this.variables.add(new Variable(VariableType.AROUSAL, String.valueOf(Math.abs(Generators.getDouble()))));
        return this;
    }

    public VariableBuilder add(VariableType variableType) {
        this.variables.add(new Variable(variableType, String.valueOf(Math.abs(Generators.getDouble()))));
        return this;
    }

    public VariableBuilder fromAll() {
        this.variables = new ArrayList<>();
        for (VariableType variableType : VariableType.values()) {
            this.variables.add(new Variable(variableType, String.valueOf(Math.abs(Generators.getDouble()))));
        }
        return this;
    }

    public List<Variable> build() {
        return this.variables;
    }

}
