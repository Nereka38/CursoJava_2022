use capgemini_arg;

desc employees;
desc departments;
desc locations;

select emp.FIRST_NAME, emp.LAST_NAME, dep.DEPARTMENT_NAME, loc.CITY
from Employees emp inner join Departments dep
on emp.department_id = dep.department_id
inner join Locations loc
on dep.location_id = loc.location_id
order by emp.FIRST_NAME;