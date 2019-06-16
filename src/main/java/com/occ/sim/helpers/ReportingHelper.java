package com.occ.sim.helpers;

import com.occ.sim.reporting.ElkReporting;

public class ReportingHelper {

    public void post(final String key, final Double value) {
        final ElkReporting elkReporting = new ElkReporting();
        elkReporting.post(key, value);
    }

}
