-- begin STATUS_LIFECYCLE
create table status_lifecycle (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    activities varchar(500),
    exit_criteria varchar(500),
    integration_status varchar(500),
    --
    primary key (ID)
)^
-- end STATUS_LIFECYCLE
-- begin SL
create table sl (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    activities varchar(500),
    exit_criteria varchar(500),
    integration_status varchar(500),
    --
    primary key (ID)
)^
-- end SL
-- begin API_IMPL_DEF
create table api_impl_def (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    api_classification varchar(500),
    api_implementation_pattern varchar(500),
    api_int_destination_system_api_only varchar(500),
    api_int_source_app_experience_api_only varchar(500),
    api_processing_type varchar(500),
    api_special_ops varchar(500),
    design_pattern varchar(500),
    integration_platform_abreviation varchar(500),
    integration_platform_version varchar(500),
    --
    primary key (ID)
)^
-- end API_IMPL_DEF
-- begin API_I_D
create table api_i_d (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    api_classification varchar(500),
    api_implementation_pattern varchar(500),
    api_int_destination_system_api_only varchar(500),
    api_int_source_app_experience_api_only varchar(500),
    api_processing_type varchar(500),
    api_special_ops varchar(500),
    design_pattern varchar(500),
    integration_platform_abreviation varchar(500),
    integration_platform_version varchar(500),
    --
    primary key (ID)
)^
-- end API_I_D
