alter table api_impl_def add column DELETED_BY varchar(50) ;
alter table api_impl_def add column UPDATE_TS timestamp ;
alter table api_impl_def add column DELETE_TS timestamp ;
alter table api_impl_def add column UPDATED_BY varchar(50) ;
alter table api_impl_def add column CREATED_BY varchar(50) ;
alter table api_impl_def add column ID uuid ^
update api_impl_def set ID = newid() where ID is null ;
alter table api_impl_def alter column ID set not null ;
alter table api_impl_def add column CREATE_TS timestamp ;
alter table api_impl_def add column VERSION integer ^
update api_impl_def set VERSION = 0 where VERSION is null ;
alter table api_impl_def alter column VERSION set not null ;
