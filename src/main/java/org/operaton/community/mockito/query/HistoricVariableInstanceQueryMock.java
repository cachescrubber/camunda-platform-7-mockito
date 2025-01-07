package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.HistoryService;
import org.operaton.bpm.engine.history.HistoricVariableInstance;
import org.operaton.bpm.engine.history.HistoricVariableInstanceQuery;

public class HistoricVariableInstanceQueryMock extends AbstractQueryMock<HistoricVariableInstanceQueryMock, HistoricVariableInstanceQuery, HistoricVariableInstance, HistoryService> {

  public HistoricVariableInstanceQueryMock() {
    super(HistoricVariableInstanceQuery.class, HistoryService.class);
   }

}
