use capgemini_arg;

desc employees;
SELECT COUNT(DEPARTMENT_ID) AS Employees FROM Employees;

select DEPARTMENT_ID, EMPLOYEE_ID FROM EMPLOYEES
where DEPARTMENT_ID > 40
ORDER BY EMPLOYEE_ID DESC;

select count(department_id) 
from employees 
	where department_id >=40
	group by department_id
	order by 1 desc;
