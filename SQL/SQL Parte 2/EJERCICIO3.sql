use capgemini_arg;

desc employees;
select FIRST_NAME, LAST_NAME, JOB_ID, COMMISSION_PCT, SALARY
from employees
WHERE FIRST_NAME = 'Kimberely';