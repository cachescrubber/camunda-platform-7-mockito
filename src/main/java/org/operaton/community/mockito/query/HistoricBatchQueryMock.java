package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.HistoryService;
import org.operaton.bpm.engine.batch.history.HistoricBatch;
import org.operaton.bpm.engine.batch.history.HistoricBatchQuery;

public class HistoricBatchQueryMock extends AbstractQueryMock<HistoricBatchQueryMock, HistoricBatchQuery, HistoricBatch, HistoryService> {

  public HistoricBatchQueryMock() {
    super(HistoricBatchQuery.class, HistoryService.class);
   }

}
