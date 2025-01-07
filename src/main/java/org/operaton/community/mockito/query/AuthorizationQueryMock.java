package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.AuthorizationService;
import org.operaton.bpm.engine.authorization.Authorization;
import org.operaton.bpm.engine.authorization.AuthorizationQuery;

public class AuthorizationQueryMock extends AbstractQueryMock<AuthorizationQueryMock, AuthorizationQuery, Authorization, AuthorizationService> {

  public AuthorizationQueryMock() {
    super(AuthorizationQuery.class, AuthorizationService.class);
   }

}
