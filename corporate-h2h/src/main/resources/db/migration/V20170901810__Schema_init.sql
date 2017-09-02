create table client(
	clientid VARCHAR(20),
	clientname VARCHAR(255) not null,
	description VARCHAR(255) not null,
	primary key (clientid)
	);
create table clientpic (
	idpic varchar(20),
	client varchar(20) not null,
	picname varchar(20) not null,
	picunit varchar(20),
	picemail varchar(40),
	piccontact varchar(20) not null,
	primary key (idpic),
	foreign key (client) references client (clientid)
	);
create table clientips (
	ipid varchar(20),
	client varchar(20) not null,
	clientip varchar(20) not null,
	primary key (ipid),
	foreign key (client) references client (clientid)
	);