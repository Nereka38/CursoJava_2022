use capgemini_arg;

desc locations;
desc departments;
desc countries;

select * from employees;
select * from countries;
select * from locations;
select * from departments;

select emp.employee_id, dep.department_id, loc.location_id, cou.country_id from Employees emp
inner join departments dep
on emp.department_id = dep.department_id
inner join locations loc
on loc.location_id = dep.location_id
inner join countries cou
on cou.country_id = loc.country_id
where cou.country_id = 'CA';

DELETE FROM employees
WHERE department_id = 20; 
