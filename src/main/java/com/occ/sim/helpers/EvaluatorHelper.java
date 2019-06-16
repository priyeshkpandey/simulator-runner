package com.occ.sim.helpers;

import com.occ.common.Evaluator;
import com.occ.entities.Emotion;
import com.occ.entities.Variable;
import com.occ.models.infra.Model;
import com.occ.sim.factory.SimulatorFactory;

import java.util.List;

public class EvaluatorHelper {

    public void evaluateAll() throws Exception {
        final List<Variable> variables = SimulatorFactory.getSimulatorBuilderFactory().getVariableBuilder().fromAll().build();
        final Model model = SimulatorFactory.getSimulatorBuilderFactory().getModelBuilder().fromVariables(variables).build();
        final List<Emotion> emotions = SimulatorFactory.getSimulatorBuilderFactory().getEmotionBuilder().fromAll().build();
        final ReportingHelper reportingHelper = SimulatorFactory.getReportingHelper();
        for (Variable variable : variables) {
            reportingHelper.post(variable.getVarType().name(), Double.valueOf(variable.getValue()));
        }
        for (Emotion emotion : emotions) {
            if (Evaluator.evaluate(emotion, model)) {
                Double potential = emotion.getPotential();
                Double threshold = emotion.getThreshold();
                Double intensity = emotion.getIntensity();
                reportingHelper.post(emotion.getName() + "." + "potential", potential);
                reportingHelper.post(emotion.getName() + "." + "threshold", threshold);
                reportingHelper.post(emotion.getName() + "." + "intensity", intensity);
            }
        }
    }
}
