package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.HistoryService;
import org.operaton.bpm.engine.history.HistoricProcessInstance;
import org.operaton.bpm.engine.history.HistoricProcessInstanceQuery;

public class HistoricProcessInstanceQueryMock extends AbstractQueryMock<HistoricProcessInstanceQueryMock, HistoricProcessInstanceQuery, HistoricProcessInstance, HistoryService> {

  public HistoricProcessInstanceQueryMock() {
    super(HistoricProcessInstanceQuery.class, HistoryService.class);
   }

}
