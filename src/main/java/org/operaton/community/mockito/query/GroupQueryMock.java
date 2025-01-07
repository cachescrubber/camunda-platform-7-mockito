package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.IdentityService;
import org.operaton.bpm.engine.identity.Group;
import org.operaton.bpm.engine.identity.GroupQuery;

public class GroupQueryMock extends AbstractQueryMock<GroupQueryMock, GroupQuery, Group, IdentityService> {

  public GroupQueryMock() {
    super(GroupQuery.class, IdentityService.class);
   }

}
