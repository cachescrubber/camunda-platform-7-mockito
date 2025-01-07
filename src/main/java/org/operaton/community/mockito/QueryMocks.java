package org.operaton.community.mockito;

import org.operaton.bpm.engine.AuthorizationService;
import org.operaton.bpm.engine.CaseService;
import org.operaton.bpm.engine.ExternalTaskService;
import org.operaton.bpm.engine.FilterService;
import org.operaton.bpm.engine.HistoryService;
import org.operaton.bpm.engine.IdentityService;
import org.operaton.bpm.engine.ManagementService;
import org.operaton.bpm.engine.RepositoryService;
import org.operaton.bpm.engine.RuntimeService;
import org.operaton.bpm.engine.TaskService;
import org.operaton.community.mockito.query.ActivityStatisticsQueryMock;
import org.operaton.community.mockito.query.AuthorizationQueryMock;
import org.operaton.community.mockito.query.BatchQueryMock;
import org.operaton.community.mockito.query.BatchStatisticsQueryMock;
import org.operaton.community.mockito.query.CaseDefinitionQueryMock;
import org.operaton.community.mockito.query.CaseExecutionQueryMock;
import org.operaton.community.mockito.query.CaseInstanceQueryMock;
import org.operaton.community.mockito.query.DecisionDefinitionQueryMock;
import org.operaton.community.mockito.query.DeploymentQueryMock;
import org.operaton.community.mockito.query.DeploymentStatisticsQueryMock;
import org.operaton.community.mockito.query.EventSubscriptionQueryMock;
import org.operaton.community.mockito.query.ExecutionQueryMock;
import org.operaton.community.mockito.query.ExternalTaskQueryMock;
import org.operaton.community.mockito.query.FilterQueryMock;
import org.operaton.community.mockito.query.GroupQueryMock;
import org.operaton.community.mockito.query.HistoricActivityInstanceQueryMock;
import org.operaton.community.mockito.query.HistoricActivityStatisticsQueryMock;
import org.operaton.community.mockito.query.HistoricBatchQueryMock;
import org.operaton.community.mockito.query.HistoricCaseActivityInstanceQueryMock;
import org.operaton.community.mockito.query.HistoricCaseInstanceQueryMock;
import org.operaton.community.mockito.query.HistoricDecisionInstanceQueryMock;
import org.operaton.community.mockito.query.HistoricDetailQueryMock;
import org.operaton.community.mockito.query.HistoricIdentityLinkLogQueryMock;
import org.operaton.community.mockito.query.HistoricIncidentQueryMock;
import org.operaton.community.mockito.query.HistoricJobLogQueryMock;
import org.operaton.community.mockito.query.HistoricProcessInstanceQueryMock;
import org.operaton.community.mockito.query.HistoricTaskInstanceQueryMock;
import org.operaton.community.mockito.query.HistoricVariableInstanceQueryMock;
import org.operaton.community.mockito.query.IncidentQueryMock;
import org.operaton.community.mockito.query.JobDefinitionQueryMock;
import org.operaton.community.mockito.query.JobQueryMock;
import org.operaton.community.mockito.query.ProcessDefinitionQueryMock;
import org.operaton.community.mockito.query.ProcessDefinitionStatisticsQueryMock;
import org.operaton.community.mockito.query.ProcessInstanceQueryMock;
import org.operaton.community.mockito.query.TaskQueryMock;
import org.operaton.community.mockito.query.TenantQueryMock;
import org.operaton.community.mockito.query.UserOperationLogQueryMock;
import org.operaton.community.mockito.query.UserQueryMock;
import org.operaton.community.mockito.query.VariableInstanceQueryMock;

@SuppressWarnings("unused")
public enum QueryMocks {
  ;

  public static FilterQueryMock mockFilterQuery(final FilterService serviceMock) {
    return new FilterQueryMock().forService(serviceMock);
  }

  public static TaskQueryMock mockTaskQuery(final TaskService serviceMock) {
    return new TaskQueryMock().forService(serviceMock);
  }

  public static CaseInstanceQueryMock mockCaseInstanceQuery(final CaseService serviceMock) {
    return new CaseInstanceQueryMock().forService(serviceMock);
  }

  public static CaseExecutionQueryMock mockCaseExecutionQuery(final CaseService serviceMock) {
    return new CaseExecutionQueryMock().forService(serviceMock);
  }

  public static ExecutionQueryMock mockExecutionQuery(final RuntimeService serviceMock) {
    return new ExecutionQueryMock().forService(serviceMock);
  }

  public static ProcessInstanceQueryMock mockProcessInstanceQuery(final RuntimeService serviceMock) {
    return new ProcessInstanceQueryMock().forService(serviceMock);
  }

  public static IncidentQueryMock mockIncidentQuery(final RuntimeService serviceMock) {
    return new IncidentQueryMock().forService(serviceMock);
  }

  public static EventSubscriptionQueryMock mockEventSubscriptionQuery(final RuntimeService serviceMock) {
    return new EventSubscriptionQueryMock().forService(serviceMock);
  }

  public static VariableInstanceQueryMock mockVariableInstanceQuery(final RuntimeService serviceMock) {
    return new VariableInstanceQueryMock().forService(serviceMock);
  }

  public static ProcessDefinitionQueryMock mockProcessDefinitionQuery(final RepositoryService serviceMock) {
    return new ProcessDefinitionQueryMock().forService(serviceMock);
  }

  public static CaseDefinitionQueryMock mockCaseDefinitionQuery(final RepositoryService serviceMock) {
    return new CaseDefinitionQueryMock().forService(serviceMock);
  }

  public static DecisionDefinitionQueryMock mockDecisionDefinitionQuery(final RepositoryService serviceMock) {
    return new DecisionDefinitionQueryMock().forService(serviceMock);
  }

  public static DeploymentQueryMock mockDeploymentQuery(final RepositoryService serviceMock) {
    return new DeploymentQueryMock().forService(serviceMock);
  }

  public static HistoricIdentityLinkLogQueryMock mockHistoricIdentityLinkLogQuery(final HistoryService serviceMock) {
    return new HistoricIdentityLinkLogQueryMock().forService(serviceMock);
  }

  public static HistoricProcessInstanceQueryMock mockHistoricProcessInstanceQuery(final HistoryService serviceMock) {
    return new HistoricProcessInstanceQueryMock().forService(serviceMock);
  }

  public static HistoricActivityInstanceQueryMock mockHistoricActivityInstanceQuery(final HistoryService serviceMock) {
    return new HistoricActivityInstanceQueryMock().forService(serviceMock);
  }

  public static HistoricActivityStatisticsQueryMock mockHistoricActivityStatisticsQuery(final HistoryService serviceMock) {
    return new HistoricActivityStatisticsQueryMock().forService(serviceMock);
  }

  public static HistoricVariableInstanceQueryMock mockHistoricVariableInstanceQuery(final HistoryService serviceMock) {
    return new HistoricVariableInstanceQueryMock().forService(serviceMock);
  }

  public static HistoricCaseActivityInstanceQueryMock mockHistoricCaseActivityInstanceQuery(final HistoryService serviceMock) {
    return new HistoricCaseActivityInstanceQueryMock().forService(serviceMock);
  }

  public static HistoricDecisionInstanceQueryMock mockHistoricDecisionInstanceQuery(final HistoryService serviceMock) {
    return new HistoricDecisionInstanceQueryMock().forService(serviceMock);
  }

  public static HistoricTaskInstanceQueryMock mockHistoricTaskInstanceQuery(final HistoryService serviceMock) {
    return new HistoricTaskInstanceQueryMock().forService(serviceMock);
  }

  public static HistoricDetailQueryMock mockHistoricDetailQuery(final HistoryService serviceMock) {
    return new HistoricDetailQueryMock().forService(serviceMock);
  }

  public static UserOperationLogQueryMock mockUserOperationLogQuery(final HistoryService serviceMock) {
    return new UserOperationLogQueryMock().forService(serviceMock);
  }

  public static HistoricIncidentQueryMock mockHistoricIncidentQuery(final HistoryService serviceMock) {
    return new HistoricIncidentQueryMock().forService(serviceMock);
  }

  public static HistoricCaseInstanceQueryMock mockHistoricCaseInstanceQuery(final HistoryService serviceMock) {
    return new HistoricCaseInstanceQueryMock().forService(serviceMock);
  }

  public static HistoricJobLogQueryMock mockHistoricJobLogQuery(final HistoryService serviceMock) {
    return new HistoricJobLogQueryMock().forService(serviceMock);
  }

  public static HistoricBatchQueryMock mockHistoricBatchQuery(final HistoryService serviceMock) {
    return new HistoricBatchQueryMock().forService(serviceMock);
  }

  public static UserQueryMock mockUserQuery(final IdentityService serviceMock) {
    return new UserQueryMock().forService(serviceMock);
  }

  public static GroupQueryMock mockGroupQuery(final IdentityService serviceMock) {
    return new GroupQueryMock().forService(serviceMock);
  }

  public static TenantQueryMock mockTenantQuery(final IdentityService serviceMock) {
    return new TenantQueryMock().forService(serviceMock);
  }

  public static JobQueryMock mockJobQuery(final ManagementService serviceMock) {
    return new JobQueryMock().forService(serviceMock);
  }

  public static BatchQueryMock mockBatchQuery(final ManagementService serviceMock) {
    return new BatchQueryMock().forService(serviceMock);
  }

  public static ProcessDefinitionStatisticsQueryMock mockProcessDefinitionStatisticsQuery(final ManagementService serviceMock) {
    return new ProcessDefinitionStatisticsQueryMock().forService(serviceMock);
  }

  public static JobDefinitionQueryMock mockJobDefinitionQuery(final ManagementService serviceMock) {
    return new JobDefinitionQueryMock().forService(serviceMock);
  }

  public static DeploymentStatisticsQueryMock mockDeploymentStatisticsQuery(final ManagementService serviceMock) {
    return new DeploymentStatisticsQueryMock().forService(serviceMock);
  }

  public static ActivityStatisticsQueryMock mockActivityStatisticsQuery(final ManagementService serviceMock) {
    return new ActivityStatisticsQueryMock().forService(serviceMock);
  }

  public static BatchStatisticsQueryMock mockBatchStatisticsQuery(final ManagementService serviceMock) {
    return new BatchStatisticsQueryMock().forService(serviceMock);
  }

  public static AuthorizationQueryMock mockAuthorizationQuery(final AuthorizationService serviceMock) {
    return new AuthorizationQueryMock().forService(serviceMock);
  }

  public static ExternalTaskQueryMock mockExternalTaskQuery(final ExternalTaskService serviceMock) {
    return new ExternalTaskQueryMock().forService(serviceMock);
  }

}

