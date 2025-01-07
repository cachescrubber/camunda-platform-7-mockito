package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.ExternalTaskService;
import org.operaton.bpm.engine.externaltask.ExternalTask;
import org.operaton.bpm.engine.externaltask.ExternalTaskQuery;

public class ExternalTaskQueryMock extends AbstractQueryMock<ExternalTaskQueryMock, ExternalTaskQuery, ExternalTask, ExternalTaskService> {

  public ExternalTaskQueryMock() {
    super(ExternalTaskQuery.class, ExternalTaskService.class);
   }

}
