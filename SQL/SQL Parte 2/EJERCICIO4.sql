use capgemini_arg;

desc employees;
select DEPARTMENT_ID from employees;
select MIN(DEPARTMENT_ID) FROM employees
GROUP BY DEPARTMENT_ID
ORDER BY Department_id DESC;