alter table sl add column DELETED_BY varchar(50) ;
alter table sl add column UPDATE_TS timestamp ;
alter table sl add column DELETE_TS timestamp ;
alter table sl add column UPDATED_BY varchar(50) ;
alter table sl add column CREATED_BY varchar(50) ;
alter table sl add column ID uuid ^
update sl set ID = newid() where ID is null ;
alter table sl alter column ID set not null ;
alter table sl add column CREATE_TS timestamp ;
alter table sl add column VERSION integer ^
update sl set VERSION = 0 where VERSION is null ;
alter table sl alter column VERSION set not null ;
