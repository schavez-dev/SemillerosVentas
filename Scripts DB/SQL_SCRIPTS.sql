create database semillerosBD;
show databases;

#drop table semillerosBD.tUsuariosRole
CREATE TABLE semillerosBD.tUsuariosRole (
ID_ROLE_USR int not null AUTO_INCREMENT,
DESC_ROLE varchar(50),
primary key (ID_ROLE_USR)
);

#drop table semillerosBD.t_usuarios_system
CREATE TABLE semillerosBD.t_usuarios_system (
	ID_USR int not null AUTO_INCREMENT,
    ID_ROLE_USR int not null,
    NOMBRE_USR varchar(50),
    PSW_USR varchar(50),
    PRIMARY KEY(ID_USR),
    INDEX(ID_ROLE_USR),
    foreign key(ID_ROLE_USR) REFERENCES tUsuariosRole(ID_ROLE_USR)
);

INSERT INTO semillerosBD.tUsuariosRole
(DESC_ROLE)
VALUES
('sysadmin: Administra todo el sistema'),
('usr_admin: El dueño o Patron o Razon Social'),
('usr_sup: Superviza las sucursales'),
('usr_gncia: LLeva el control de la sucursal'),
('usr_jefe: LLeva el control del personal'),
('usr_emp: Ejecuta las tareas asignadas');


##INSERTAMOS A LOS USUARIOS
INSERT INTO semillerosBD.t_usuarios_system
(ID_ROLE_USR,
NOMBRE_USR,
PSW_USR)
VALUES
(1,
'admin',
'admin123'),
(2,
'patron',
'patron123'),
(3,
'sup',
'sup123'),
(4,
'gncia',
'gncia123'),
(5,
'jefe',
'jefe123'),
(6,
'emp',
'emp123');



