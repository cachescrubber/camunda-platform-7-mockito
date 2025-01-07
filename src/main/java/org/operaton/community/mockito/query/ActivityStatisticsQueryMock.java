package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.ManagementService;
import org.operaton.bpm.engine.management.ActivityStatistics;
import org.operaton.bpm.engine.management.ActivityStatisticsQuery;

public class ActivityStatisticsQueryMock extends AbstractQueryMock<ActivityStatisticsQueryMock, ActivityStatisticsQuery, ActivityStatistics, ManagementService> {

  public ActivityStatisticsQueryMock() {
    super(ActivityStatisticsQuery.class, ManagementService.class);
   }

}
