package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.IdentityService;
import org.operaton.bpm.engine.identity.User;
import org.operaton.bpm.engine.identity.UserQuery;

public class UserQueryMock extends AbstractQueryMock<UserQueryMock, UserQuery, User, IdentityService> {

  public UserQueryMock() {
    super(UserQuery.class, IdentityService.class);
   }

}
