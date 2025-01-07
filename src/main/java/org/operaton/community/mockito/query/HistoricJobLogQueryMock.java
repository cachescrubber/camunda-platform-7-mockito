package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.HistoryService;
import org.operaton.bpm.engine.history.HistoricJobLog;
import org.operaton.bpm.engine.history.HistoricJobLogQuery;

public class HistoricJobLogQueryMock extends AbstractQueryMock<HistoricJobLogQueryMock, HistoricJobLogQuery, HistoricJobLog, HistoryService> {

  public HistoricJobLogQueryMock() {
    super(HistoricJobLogQuery.class, HistoryService.class);
   }

}
