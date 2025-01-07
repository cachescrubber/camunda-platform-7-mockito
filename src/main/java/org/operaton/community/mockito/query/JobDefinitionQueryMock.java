package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.ManagementService;
import org.operaton.bpm.engine.management.JobDefinition;
import org.operaton.bpm.engine.management.JobDefinitionQuery;

public class JobDefinitionQueryMock extends AbstractQueryMock<JobDefinitionQueryMock, JobDefinitionQuery, JobDefinition, ManagementService> {

  public JobDefinitionQueryMock() {
    super(JobDefinitionQuery.class, ManagementService.class);
   }

}
