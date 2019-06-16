package com.occ.sim.factory;

import com.occ.sim.helpers.EvaluatorHelper;
import com.occ.sim.helpers.ReportingHelper;

public class SimulatorFactory {

    private static SimulatorBuilderFactory simulatorBuilderFactory;
    private static SimulatorHelperFactory simulatorHelperFactory;
    private static EvaluatorHelper evaluatorHelper;
    private static ReportingHelper reportingHelper;

    public static SimulatorBuilderFactory getSimulatorBuilderFactory() {
        if (null == simulatorBuilderFactory) {
            simulatorBuilderFactory = new SimulatorBuilderFactory();
        }
        return simulatorBuilderFactory;
    }

    public static SimulatorHelperFactory getSimulatorHelperFactory() {
        if (null == simulatorHelperFactory) {
            simulatorHelperFactory = new SimulatorHelperFactory();
        }
        return simulatorHelperFactory;
    }

    public static EvaluatorHelper getEvaluatorHelper() {
        if (null == evaluatorHelper) {
            evaluatorHelper = new EvaluatorHelper();
        }
        return evaluatorHelper;
    }

    public static ReportingHelper getReportingHelper() {
        if (null == reportingHelper) {
            reportingHelper = new ReportingHelper();
        }
        return reportingHelper;
    }

}
