package com.occ.sim.factory;

import com.occ.sim.helpers.EvaluatorHelper;
import com.occ.sim.helpers.ReportingHelper;

public class SimulatorHelperFactory {

    public EvaluatorHelper getEvaluatorHelper() {
        return new EvaluatorHelper();
    }

    public ReportingHelper getReportingHelper() {
        return new ReportingHelper();
    }

}
