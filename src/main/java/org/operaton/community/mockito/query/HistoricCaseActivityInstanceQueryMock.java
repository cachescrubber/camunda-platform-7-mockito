package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.HistoryService;
import org.operaton.bpm.engine.history.HistoricCaseActivityInstance;
import org.operaton.bpm.engine.history.HistoricCaseActivityInstanceQuery;

public class HistoricCaseActivityInstanceQueryMock extends AbstractQueryMock<HistoricCaseActivityInstanceQueryMock, HistoricCaseActivityInstanceQuery, HistoricCaseActivityInstance, HistoryService> {

  public HistoricCaseActivityInstanceQueryMock() {
    super(HistoricCaseActivityInstanceQuery.class, HistoryService.class);
   }

}
