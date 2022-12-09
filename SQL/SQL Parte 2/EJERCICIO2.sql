use capgemini_arg;

desc employees;
select EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY
from employees
WHERE SALARY <any (select SALARY from employees where job_id = 'IT_PROG')
order by JOB_ID;

desc employees;
select EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY
from employees
WHERE SALARY <any (select SALARY from employees where job_id = 'ST_MAN')
order by JOB_ID;

desc employees;
select EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY
from employees
WHERE SALARY <any (select SALARY from employees where job_id = 'PR_REP')
order by JOB_ID;