use capgemeni_arg;

select * from employees;

desc departments;
desc employees;

-- encontramos a Kimberely
select emp.FIRST_NAME, emp.LAST_NAME, emp.SALARY, dep.DEPARTMENT_NAME
from Employees emp left join Departments dep
on emp.department_id = dep.department_id
where emp.FIRST_NAME like "Kimberely";

-- encontramos el Departament ID de IT
select dep.DEPARTMENT_ID, dep.DEPARTMENT_NAME
from Departments dep
where dep.DEPARTMENT_NAME like "IT";

-- encontramos la fecha del ultimo empleado que entro en IT
select min(hire_date) 
from employees e, departments d
where e.DEPARTMENT_ID=d.DEPARTMENT_ID
and   d.DEPARTMENT_NAME='IT';

-- encontramos el salario minimo del primer empleado por ID
select SALARY, FIRST_NAME, LAST_NAME
from employees
where HIRE_DATE = (select min(HIRE_DATE) from employees where DEPARTMENT_ID = 60);

-- solucion: buscamos salary por un lado, department_id por otro y juntarlo aqui
update employees
set SALARY = 9000, DEPARTMENT_ID = 60
where FIRST_NAME like "Kimberely";

-- select salary from employees where HIRE_DATE = (SELECT MIN(HIRE_DATE) FROM EMPLOYEES WHERE DEPARTMENT_ID = 60)) WHERE FIRST_NAME LIKE "KIMBERELY"))


