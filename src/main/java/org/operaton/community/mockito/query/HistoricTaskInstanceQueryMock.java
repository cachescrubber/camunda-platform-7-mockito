package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.HistoryService;
import org.operaton.bpm.engine.history.HistoricTaskInstance;
import org.operaton.bpm.engine.history.HistoricTaskInstanceQuery;

public class HistoricTaskInstanceQueryMock extends AbstractQueryMock<HistoricTaskInstanceQueryMock, HistoricTaskInstanceQuery, HistoricTaskInstance, HistoryService> {

  public HistoricTaskInstanceQueryMock() {
    super(HistoricTaskInstanceQuery.class, HistoryService.class);
   }

}
