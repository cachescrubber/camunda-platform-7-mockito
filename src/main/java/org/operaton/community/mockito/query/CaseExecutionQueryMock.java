package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.CaseService;
import org.operaton.bpm.engine.runtime.CaseExecution;
import org.operaton.bpm.engine.runtime.CaseExecutionQuery;

public class CaseExecutionQueryMock extends AbstractQueryMock<CaseExecutionQueryMock, CaseExecutionQuery, CaseExecution, CaseService> {

  public CaseExecutionQueryMock() {
    super(CaseExecutionQuery.class, CaseService.class);
   }

}
