use capgemini_arg;

desc employees;
desc jobs;

SELECT emp.EMPLOYEE_ID, emp.LAST_NAME, emp.JOB_ID, emp.SALARY, j.JOB_TITLE
from Employees emp
inner join Jobs j
on emp.JOB_ID = j.JOB_ID
WHERE j.job_id != 'IT_PROG' and salary > 9000;

