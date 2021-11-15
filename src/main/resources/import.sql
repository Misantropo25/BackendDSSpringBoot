
--Ingreso de DetalleServicio
insert into detalle_servicio(costo_servicio, descripcion, fecha_creacion, fecha_expiracion) values(50.00 ,"Descripcion", "2021-09-08 17:51:04.78", "2022-09-08 17:51:04.78");
insert into detalle_servicio(costo_servicio, descripcion, fecha_creacion, fecha_expiracion) values(50.00 ,"Descripcion", GETDATE(), DATEADD(DAY,100,GETDATE()));

--Ingreso de Servicio
insert into servicio(estado_servicio, nombre_servicio, tiene_detalle) values(1 ,"Plan 3Mbs con Cable",1);
insert into servicio(estado_servicio, nombre_servicio, tiene_detalle) values(0 ,"Plan 3Mbs con Cable",NULL);

--Ingreso de Usuarios
insert into usuario(contrasenia, nom_usuario, usuario_validado) values("1234","Juan2021",0);
insert into usuario(contrasenia, nom_usuario, usuario_validado) values("1234","Dayannas",1);

--Ingreso de Empleados
insert into empleado(dni, ape_paterno, ape_materno, area, direccion, email, nombre, num_telefono, sexo, tiene_usuario) values("70445735","Perez","Quispe","Administrativa","Av. Bella Vista","ElYulius@gmail.com","Juan","983709108","M",1);

--Ingreso de Clientes
insert into cliente(dni, ape_paterno, ape_materno, email, nombre, num_telefono, sexo, tiene_usuario) values("70445734","Aranda","Arellano","Dayanne@gmail.com","Maria Dayanna","983709100","F","2");


--Ingreso de Ticket
insert into ticket(descripcion_ticket, estado_ticket, fec_creacion, cliente_solicito) values("Solicitud de arreglo",0,"2021-09-08 17:51:04.78",1);


--Ingreso de Respuestas
insert into respuesta(contenido, empleado_respondio, ticket_respondio) values("Envio de tecnico a direccion en contrato",1,1);


--Ingreso de Contrato
insert into contrato(descripcion,direccion,estado_contrato,corresponde_cliente,tiene_servicio) values("Contrato de plan de internet y television","Av. Los Rozales",0,1,1);


--Ingreso de PagoContrato
insert into pago(estado_pago,fecha_limite_pago,fecha_pago,monto,mora,corresponde_contrato) values(true,"2021-11-15 17:51:04.78" , "2021-11-15 17:51:04.78" , 150.00, 15.00, 1);
insert into pago(estado_pago,fecha_limite_pago,fecha_pago,monto,mora,corresponde_contrato) values(false,"2021-11-15 17:51:04.78" , "2021-11-15 17:51:04.78" , 150.00, NULL, 1);
insert into pago(estado_pago,fecha_limite_pago,fecha_pago,monto,mora,corresponde_contrato) values(false,"2021-11-15 17:51:04.78" , "2021-11-15 17:51:04.78" , 150.00, NULL, 1);

--Modelo de Consultas






