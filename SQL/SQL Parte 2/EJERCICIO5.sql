use capgemini_arg;

desc employees;
select MANAGER_ID, LAST_NAME, JOB_ID from employees
WHERE JOB_ID <any (select JOB_ID from employees where job_id = 'SA_REP')
order by JOB_ID;

select MANAGER_ID, LAST_NAME, JOB_ID from employees
WHERE JOB_ID >any (select JOB_ID from employees where job_id = 'AD_VP')
order by JOB_ID;

select MANAGER_ID, LAST_NAME, JOB_ID from employees
WHERE LAST_NAME like 'k%' or manager_id = 100
order by MANAGER_ID DESC;

select MANAGER_ID, LAST_NAME, JOB_ID from employees
WHERE LAST_NAME like 'k%' or manager_id = 100
order by LAST_NAME ASC;

