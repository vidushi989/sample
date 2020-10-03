package com.company.tables.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.global.DdlGeneration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.CREATE_ONLY)
@Table(name = "api_impl_def")
@Entity(name = "tables_ApiImplDef")
public class ApiImplDef extends StandardEntity {
    private static final long serialVersionUID = 2535178481999838644L;
    @Column(name = "api_classification", length = 500)
    private String apiClassification;
    @Column(name = "api_implementation_pattern", length = 500)
    private String apiImplementationPattern;
    @Column(name = "api_int_destination_system_api_only", length = 500)
    private String apiIntDestinationSystemApiOnly;
    @Column(name = "api_int_source_app_experience_api_only", length = 500)
    private String apiIntSourceAppExperienceApiOnly;
    @Column(name = "api_processing_type", length = 500)
    private String apiProcessingType;
    @Column(name = "api_special_ops", length = 500)
    private String apiSpecialOps;
    @Column(name = "design_pattern", length = 500)
    private String designPattern;
    @Column(name = "integration_platform_abreviation", length = 500)
    private String integrationPlatformAbreviation;
    @Column(name = "integration_platform_version", length = 500)
    private String integrationPlatformVersion;

    public String getIntegrationPlatformVersion() {
        return integrationPlatformVersion;
    }

    public void setIntegrationPlatformVersion(String integrationPlatformVersion) {
        this.integrationPlatformVersion = integrationPlatformVersion;
    }

    public String getIntegrationPlatformAbreviation() {
        return integrationPlatformAbreviation;
    }

    public void setIntegrationPlatformAbreviation(String integrationPlatformAbreviation) {
        this.integrationPlatformAbreviation = integrationPlatformAbreviation;
    }

    public String getDesignPattern() {
        return designPattern;
    }

    public void setDesignPattern(String designPattern) {
        this.designPattern = designPattern;
    }

    public String getApiSpecialOps() {
        return apiSpecialOps;
    }

    public void setApiSpecialOps(String apiSpecialOps) {
        this.apiSpecialOps = apiSpecialOps;
    }

    public String getApiProcessingType() {
        return apiProcessingType;
    }

    public void setApiProcessingType(String apiProcessingType) {
        this.apiProcessingType = apiProcessingType;
    }

    public String getApiIntSourceAppExperienceApiOnly() {
        return apiIntSourceAppExperienceApiOnly;
    }

    public void setApiIntSourceAppExperienceApiOnly(String apiIntSourceAppExperienceApiOnly) {
        this.apiIntSourceAppExperienceApiOnly = apiIntSourceAppExperienceApiOnly;
    }

    public String getApiIntDestinationSystemApiOnly() {
        return apiIntDestinationSystemApiOnly;
    }

    public void setApiIntDestinationSystemApiOnly(String apiIntDestinationSystemApiOnly) {
        this.apiIntDestinationSystemApiOnly = apiIntDestinationSystemApiOnly;
    }

    public String getApiImplementationPattern() {
        return apiImplementationPattern;
    }

    public void setApiImplementationPattern(String apiImplementationPattern) {
        this.apiImplementationPattern = apiImplementationPattern;
    }

    public String getApiClassification() {
        return apiClassification;
    }

    public void setApiClassification(String apiClassification) {
        this.apiClassification = apiClassification;
    }
}