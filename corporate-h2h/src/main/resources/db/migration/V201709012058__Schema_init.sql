create table client(
	id VARCHAR(36),
	clientid VARCHAR(20),
	clientname VARCHAR(255) not null,
	description VARCHAR(255) not null,
	primary key (id),
	unique (clientid)
	);
create table clientpic (
	idpic varchar(36),
	clientid varchar(20) not null,
	picname varchar(20) not null,
	picunit varchar(20),
	picemail varchar(40),
	piccontact varchar(20) not null,
	primary key (idpic),
	foreign key (clientid) references client (clientid),
	unique (idpic)
	);
create table clientips (
	ipid varchar(36),
	clientid varchar(20) not null,
	clientip varchar(20) not null,
	primary key (ipid),
	foreign key (clientid) references client (clientid)
	);