package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.RuntimeService;
import org.operaton.bpm.engine.runtime.Incident;
import org.operaton.bpm.engine.runtime.IncidentQuery;

public class IncidentQueryMock extends AbstractQueryMock<IncidentQueryMock, IncidentQuery, Incident, RuntimeService> {

  public IncidentQueryMock() {
    super(IncidentQuery.class, RuntimeService.class);
   }

}
