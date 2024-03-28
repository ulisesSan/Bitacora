create table usuario(
num_Emp varchar(10) primary key,
Nombre varchar(50),
apellidos varchar(100),
passwd text);

create table catServ(
 id int primary key, 
nombre varchar(15), 
criticidad varchar(10), 
impacto text);

create table bitacora(
num_Emp varchar(10),
diaSem int,
folio varchar(10),
idServ int,
fechIni datetime,
fechFin datetime,
timSol int,
estatus varchar(20),
timDev int,
descTarea text);

alter table bitacora add foreign key (num_Emp) references usuario(num_Emp) on delete cascade on update cascade;
alter table bitacora add foreign key (idServ) references catServ(id) on delete cascade on update cascade;

a
