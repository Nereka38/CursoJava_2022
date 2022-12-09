use capgemini_arg;

desc employees;

SELECT emp.last_name as empleado, empl.department_id as departamento, empl.last_name as colega
FROM employees emp LEFT OUTER JOIN employees empl
ON emp.department_id = empl.department_id
WHERE emp.department_id IN (SELECT department_id
                        FROM employees where department_id in (60,20) );
