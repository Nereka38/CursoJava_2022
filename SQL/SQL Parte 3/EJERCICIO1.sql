use capgemini_arg;

desc employees;
desc departments;
desc locations;

select emp.FIRST_NAME, emp.LAST_NAME, dep.MANAGER_ID, dep.DEPARTMENT_NAME, dep.LOCATION_ID
from Employees AS emp inner join Departments as dep
on emp.department_id = dep.department_id
where emp.MANAGER_ID = 149;





