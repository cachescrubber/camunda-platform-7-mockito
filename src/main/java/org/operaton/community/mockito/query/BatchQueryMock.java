package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.ManagementService;
import org.operaton.bpm.engine.batch.Batch;
import org.operaton.bpm.engine.batch.BatchQuery;

public class BatchQueryMock extends AbstractQueryMock<BatchQueryMock, BatchQuery, Batch, ManagementService> {

  public BatchQueryMock() {
    super(BatchQuery.class, ManagementService.class);
   }

}
