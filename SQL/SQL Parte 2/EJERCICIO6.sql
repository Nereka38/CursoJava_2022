use capgemini_arg;

desc employees;

select DEPARTMENT_ID, COUNT(EMPLOYEE_ID) as total FROM EMPLOYEES
where DEPARTMENT_ID > 40
GROUP BY department_id
ORDER BY department_id ASC;


select count(department_id) 
from employees 
	where department_id >=40
	group by department_id
	order by 1 desc;
