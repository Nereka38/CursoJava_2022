use capgemini_arg;

desc employees;

SELECT first_name , count(*) FROM employees 
GROUP BY employee_id;
