package com.company.tables.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.global.DdlGeneration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.CREATE_ONLY)
@Table(name = "status_lifecycle")
@Entity(name = "tables_StatusLifecycle")
public class StatusLifecycle extends StandardEntity {
    private static final long serialVersionUID = -7899950275363890027L;
    @Column(name = "activities", length = 500)
    private String activities;
    @Column(name = "exit_criteria", length = 500)
    private String exitCriteria;
    @Column(name = "integration_status", length = 500)
    private String integrationStatus;

    public String getIntegrationStatus() {
        return integrationStatus;
    }

    public void setIntegrationStatus(String integrationStatus) {
        this.integrationStatus = integrationStatus;
    }

    public String getExitCriteria() {
        return exitCriteria;
    }

    public void setExitCriteria(String exitCriteria) {
        this.exitCriteria = exitCriteria;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }
}