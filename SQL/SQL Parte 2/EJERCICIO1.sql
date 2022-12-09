use capgemini_arg;
-- rwbfi 2 tablas
-- job y otra employees
desc jobs;
desc employees;
desc departments;
select FIRST_NAME, LAST_NAME, JOB_ID, DEPARTMENT_NAME, SALARY, COMMISSION_PCT from Employees AS emp inner join Departments as dep
on emp.department_id = dep.department_id
where (COMMISSION_PCT is null or COMMISSION_PCT = 0) and
	(SALARY between 7000 and 10000)
    -- otra manera (SALARY > 7000 and SALARY < 10000)
