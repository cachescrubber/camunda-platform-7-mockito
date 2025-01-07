package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.RepositoryService;
import org.operaton.bpm.engine.repository.DecisionDefinition;
import org.operaton.bpm.engine.repository.DecisionDefinitionQuery;

public class DecisionDefinitionQueryMock extends AbstractQueryMock<DecisionDefinitionQueryMock, DecisionDefinitionQuery, DecisionDefinition, RepositoryService> {

  public DecisionDefinitionQueryMock() {
    super(DecisionDefinitionQuery.class, RepositoryService.class);
   }

}
