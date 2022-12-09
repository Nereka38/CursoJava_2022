use capgemini_arg;

desc locations;
SELECT MAX(salary), MIN(salary), AVG(salary) FROM Employees
where DEPARTMENT_ID = 110 OR DEPARTMENT_ID = 20;