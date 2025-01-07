package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.RepositoryService;
import org.operaton.bpm.engine.repository.Deployment;
import org.operaton.bpm.engine.repository.DeploymentQuery;

public class DeploymentQueryMock extends AbstractQueryMock<DeploymentQueryMock, DeploymentQuery, Deployment, RepositoryService> {

  public DeploymentQueryMock() {
    super(DeploymentQuery.class, RepositoryService.class);
   }

}
