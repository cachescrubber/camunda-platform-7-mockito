package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.RepositoryService;
import org.operaton.bpm.engine.repository.CaseDefinition;
import org.operaton.bpm.engine.repository.CaseDefinitionQuery;

public class CaseDefinitionQueryMock extends AbstractQueryMock<CaseDefinitionQueryMock, CaseDefinitionQuery, CaseDefinition, RepositoryService> {

  public CaseDefinitionQueryMock() {
    super(CaseDefinitionQuery.class, RepositoryService.class);
   }

}
