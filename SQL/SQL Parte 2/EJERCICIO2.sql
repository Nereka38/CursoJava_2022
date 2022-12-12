use capgemini_arg;

select EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY
from employees
where job_id = 'IT_PROG' 
order by JOB_ID asc;

select EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY
from employees
where job_id = 'ST_MAN'
order by JOB_ID asc;

select EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY
from employees
where job_id = 'SA_REP'
order by JOB_ID asc;
