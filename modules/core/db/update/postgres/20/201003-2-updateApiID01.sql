alter table api_i_d add column DELETED_BY varchar(50) ;
alter table api_i_d add column UPDATE_TS timestamp ;
alter table api_i_d add column DELETE_TS timestamp ;
alter table api_i_d add column UPDATED_BY varchar(50) ;
alter table api_i_d add column CREATED_BY varchar(50) ;
alter table api_i_d add column ID uuid ^
update api_i_d set ID = newid() where ID is null ;
alter table api_i_d alter column ID set not null ;
alter table api_i_d add column CREATE_TS timestamp ;
alter table api_i_d add column VERSION integer ^
update api_i_d set VERSION = 0 where VERSION is null ;
alter table api_i_d alter column VERSION set not null ;
