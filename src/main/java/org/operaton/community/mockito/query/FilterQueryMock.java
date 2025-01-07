package org.operaton.community.mockito.query;

import org.operaton.bpm.engine.FilterService;
import org.operaton.bpm.engine.filter.Filter;
import org.operaton.bpm.engine.filter.FilterQuery;

public class FilterQueryMock extends AbstractQueryMock<FilterQueryMock, FilterQuery, Filter, FilterService> {

  public FilterQueryMock() {
    super(FilterQuery.class, FilterService.class);
   }

}
