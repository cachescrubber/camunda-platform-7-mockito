package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.HistoryService;
import org.operaton.bpm.engine.history.HistoricCaseInstance;
import org.operaton.bpm.engine.history.HistoricCaseInstanceQuery;

public class HistoricCaseInstanceQueryMock extends AbstractQueryMock<HistoricCaseInstanceQueryMock, HistoricCaseInstanceQuery, HistoricCaseInstance, HistoryService> {

  public HistoricCaseInstanceQueryMock() {
    super(HistoricCaseInstanceQuery.class, HistoryService.class);
   }

}
