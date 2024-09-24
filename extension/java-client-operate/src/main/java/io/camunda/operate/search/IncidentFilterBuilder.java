package io.camunda.operate.search;

import io.camunda.operate.model.OperateDate;

public class IncidentFilterBuilder {

  IncidentFilter filter;

  IncidentFilterBuilder() {
    filter = new IncidentFilter();
  }

  public IncidentFilterBuilder key(Long key) {
    filter.setKey(key);
    return this;
  }

  public IncidentFilterBuilder processDefinitionKey(Long processDefinitionKey) {
    filter.setProcessDefinitionKey(processDefinitionKey);
    return this;
  }

  public IncidentFilterBuilder processInstanceKey(Long processInstanceKey) {
    filter.setProcessInstanceKey(processInstanceKey);
    return this;
  }

  public IncidentFilterBuilder type(String type) {
    filter.setType(type);
    return this;
  }

  public IncidentFilterBuilder message(String message) {
    filter.setMessage(message);
    return this;
  }

  public IncidentFilterBuilder creationTime(OperateDate creationTime) {
    filter.setCreationTime(creationTime);
    return this;
  }

  public IncidentFilterBuilder state(String state) {
    filter.setState(state);
    return this;
  }

  public IncidentFilterBuilder tenantId(String tenantId) {
    filter.setTenantId(tenantId);
    return this;
  }

  public IncidentFilterBuilder jobKey(Long jobKey) {
    filter.setJobKey(jobKey);
    return this;
  }

  public IncidentFilter build() {
    return filter;
  }
}
