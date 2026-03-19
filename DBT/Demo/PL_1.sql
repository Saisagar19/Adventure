/*
drop PROCEDURE if exists pro1;
delimiter $
create PROCEDURE pro1()
begin
	set @s = "Hello World";
	call display();
end $
delimiter ;


drop PROCEDURE if exists display;
delimiter $
create PROCEDURE display()
begin
	select @s;
end $
delimiter ;
*/







