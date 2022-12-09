use capgemini_arg;

desc employees;
desc departments;

select emp.first_name, emp.last_name, emp.hire_date, emp.department_id, dep.department_name,
		date_add(emp.hire_date, interval 6 month) as first_revision, 
        DATE_SUB(emp.hire_date, INTERVAL DAYOFWEEK(emp.hire_date)- 6 DAY) as first_friday
from employees emp
inner join departments dep
on emp.department_id = dep.department_id
where department_name = "Marketing";

-- sin acabar!!!!!!
