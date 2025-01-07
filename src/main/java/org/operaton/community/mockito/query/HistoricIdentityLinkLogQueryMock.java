package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.HistoryService;
import org.operaton.bpm.engine.history.HistoricIdentityLinkLog;
import org.operaton.bpm.engine.history.HistoricIdentityLinkLogQuery;

public class HistoricIdentityLinkLogQueryMock extends AbstractQueryMock<HistoricIdentityLinkLogQueryMock, HistoricIdentityLinkLogQuery, HistoricIdentityLinkLog, HistoryService> {

  public HistoricIdentityLinkLogQueryMock() {
    super(HistoricIdentityLinkLogQuery.class, HistoryService.class);
   }

}
