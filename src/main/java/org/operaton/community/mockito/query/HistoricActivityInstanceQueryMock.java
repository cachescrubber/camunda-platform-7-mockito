package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.HistoryService;
import org.operaton.bpm.engine.history.HistoricActivityInstance;
import org.operaton.bpm.engine.history.HistoricActivityInstanceQuery;

public class HistoricActivityInstanceQueryMock extends AbstractQueryMock<HistoricActivityInstanceQueryMock, HistoricActivityInstanceQuery, HistoricActivityInstance, HistoryService> {

  public HistoricActivityInstanceQueryMock() {
    super(HistoricActivityInstanceQuery.class, HistoryService.class);
   }

}
