use capgemini_arg;

select MANAGER_ID, LAST_NAME, JOB_ID from employees
WHERE JOB_ID in (select JOB_ID from employees where job_id != 'SA_REP' and job_id != 'AD_VP')
order by last_name asc, manager_id desc;

select MANAGER_ID, LAST_NAME, JOB_ID from employees
WHERE LAST_NAME like 'k%' and manager_id = 100
order by MANAGER_ID DESC;


