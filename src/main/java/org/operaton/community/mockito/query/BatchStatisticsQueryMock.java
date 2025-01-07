package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.ManagementService;
import org.operaton.bpm.engine.batch.BatchStatistics;
import org.operaton.bpm.engine.batch.BatchStatisticsQuery;

public class BatchStatisticsQueryMock extends AbstractQueryMock<BatchStatisticsQueryMock, BatchStatisticsQuery, BatchStatistics, ManagementService> {

  public BatchStatisticsQueryMock() {
    super(BatchStatisticsQuery.class, ManagementService.class);
   }

}
