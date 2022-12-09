use capgemini_arg;

desc locations;
SELECT COUNT(SALARY), MAX(salary), MIN(salary), AVG(salary) FROM Employees
where DEPARTMENT_ID = 110 or DEPARTMENT_ID = 20;

update employees set salary=null
where employee_id in (114,115);

SELECT SALARY, EMPLOYEE_ID FROM EMPLOYEES;

update employees set salary=11000
where employee_id =114;

update employees set salary=3100
where employee_id =115;

update employees set salary=0
	where employee_id in (114,115);
