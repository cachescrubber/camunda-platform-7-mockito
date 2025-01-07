package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.HistoryService;
import org.operaton.bpm.engine.history.HistoricIncident;
import org.operaton.bpm.engine.history.HistoricIncidentQuery;

public class HistoricIncidentQueryMock extends AbstractQueryMock<HistoricIncidentQueryMock, HistoricIncidentQuery, HistoricIncident, HistoryService> {

  public HistoricIncidentQueryMock() {
    super(HistoricIncidentQuery.class, HistoryService.class);
   }

}
