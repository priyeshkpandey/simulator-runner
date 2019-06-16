package com.occ.sim.builders;

import com.occ.entities.Variable;
import com.occ.models.infra.Model;

import java.util.List;

public class ModelBuilder {

    private Model model;

    public ModelBuilder fromEmpty() {
        this.model = new Model();
        return this;
    }

    public ModelBuilder fromVariables(List<Variable> variables) {
        this.model = new Model();
        for (Variable variable : variables) {
            this.model.add(variable);
        }
        return this;
    }

    public ModelBuilder add (Variable variable) {
        this.model.add(variable);
        return this;
    }

    public Model build() {
        return this.model;
    }

}
