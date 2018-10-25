insert into CONTA_CORRENTE
values(100);
insert into CONTA_CORRENTE
values(101);
insert into CONTA_CORRENTE
values(102);


insert into SALDO_CONTA_CORRENTE
values(1, 100.00, (SELECT ID from CONTA_CORRENTE WHERE ID=100));

insert into SALDO_CONTA_CORRENTE
values(2, 200.00, (SELECT ID from CONTA_CORRENTE WHERE ID=101));

insert into SALDO_CONTA_CORRENTE
values(3, 300.00, (SELECT ID from CONTA_CORRENTE WHERE ID=102));