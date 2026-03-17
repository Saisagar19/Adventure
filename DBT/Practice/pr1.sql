/*
drop procedure if exists pro1;
delimiter $
create procedure pro1()
begin		
	select "Hello Ishwar" as Name;
end $
delimiter ;
*/

/*
Procedure 2
drop procedure if exists pro2;
delimiter #
create procedure pro2(in y int)
	begin		
		declare x int default 0;
	lb1:loop
		set x = x + 1;
        select concat(y," X ",x," = ",y*x) as "Table"; 
        if x =10 then
			leave lb1;
		end if;
	end loop lb1;
	end #
delimiter ;
*/
/*
drop procedure if exists pro2;
delimiter #
create procedure pro2(in x int)
	begin		
		select * from emp where deptno = x;
	end #
delimiter ;
*/
/*
drop procedure if exists pro2;
delimiter #
create procedure pro2(in x int)
	begin		
		if x <= 10 then
			select "<= 10";
			elseif x > 11 then 
				select "> 11";
		else
			select "good";
		end if;
	end #
delimiter ;
*/

drop procedure if exists pro2;
delimiter #
create procedure pro2(in x int)
	begin		
		select gender,max(sal) from emp where deptno = x order by ename group by gender;
	end #
delimiter ;








