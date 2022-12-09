use capgemini_arg;

desc employees;
desc departments;

SELECT emp.first_name, emp.last_name, emp.salary, dep.department_name  
FROM employees emp
inner join Departments dep
on emp.department_id = dep.department_id 
WHERE salary IN  
( SELECT MIN(salary)  
FROM employees  
GROUP BY department_id 
);

SELECT emp.first_name, emp.last_name, emp.salary, dep.department_name  
FROM employees emp
inner join Departments dep
on emp.department_id = dep.department_id 
WHERE salary =any  
( SELECT MIN(salary)  
FROM employees  
GROUP BY department_id 
);