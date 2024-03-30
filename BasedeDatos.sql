create table usuario(
num_Emp varchar(10) primary key,
Nombre varchar(50),
apellidos varchar(100),
passwd text,
fechPass date,
boss int);

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

DELIMITER //
CREATE DEFINER=`root`@`%` FUNCTION `fun_initsesion`(usuarioIN varchar(10), passwdIN text) RETURNS tinyint(1)
begin
    declare salida varchar(50);
    declare entrada varchar (10) default null;
    set entrada = (select fechpass from usuario where num_emp = usuarioIN);
	set salida = (select passwd from usuario where passwd = passwdIN and num_Emp = usuarioIN);
    return salida <=> passwdIN;
    /*if salida <=> passwdIN then
		if (datediff(entrada, date(now())) <= 60) then
			set salida = concat("fecha de cambio de contraseña");
		  end if;
	  end if;
    return salida;*/
  end//

a
