use capgemini_arg;

desc employees;

SELECT emp.first_name "Nombre Empleado", emp.last_name "Apellido Empleado", emp.employee_id "EmpID",
       man.first_name "Nombre Man" , man.last_name "Apellido Man", man.employee_id "ManID"
FROM employees emp LEFT OUTER JOIN employees man
ON emp.manager_id = man.employee_id;
