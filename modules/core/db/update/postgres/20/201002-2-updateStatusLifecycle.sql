alter table status_lifecycle add column DELETED_BY varchar(50) ;
alter table status_lifecycle add column UPDATE_TS timestamp ;
alter table status_lifecycle add column DELETE_TS timestamp ;
alter table status_lifecycle add column UPDATED_BY varchar(50) ;
alter table status_lifecycle add column CREATED_BY varchar(50) ;
alter table status_lifecycle add column ID uuid ^
update status_lifecycle set ID = newid() where ID is null ;
alter table status_lifecycle alter column ID set not null ;
alter table status_lifecycle add column CREATE_TS timestamp ;
alter table status_lifecycle add column VERSION integer ^
update status_lifecycle set VERSION = 0 where VERSION is null ;
alter table status_lifecycle alter column VERSION set not null ;
