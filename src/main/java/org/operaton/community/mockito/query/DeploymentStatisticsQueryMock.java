package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.ManagementService;
import org.operaton.bpm.engine.management.DeploymentStatistics;
import org.operaton.bpm.engine.management.DeploymentStatisticsQuery;

public class DeploymentStatisticsQueryMock extends AbstractQueryMock<DeploymentStatisticsQueryMock, DeploymentStatisticsQuery, DeploymentStatistics, ManagementService> {

  public DeploymentStatisticsQueryMock() {
    super(DeploymentStatisticsQuery.class, ManagementService.class);
   }

}
