package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.HistoryService;
import org.operaton.bpm.engine.history.HistoricDecisionInstance;
import org.operaton.bpm.engine.history.HistoricDecisionInstanceQuery;

public class HistoricDecisionInstanceQueryMock extends AbstractQueryMock<HistoricDecisionInstanceQueryMock, HistoricDecisionInstanceQuery, HistoricDecisionInstance, HistoryService> {

  public HistoricDecisionInstanceQueryMock() {
    super(HistoricDecisionInstanceQuery.class, HistoryService.class);
   }

}
