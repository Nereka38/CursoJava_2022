use capgemini_arg;

select employee_id, department_id, hire_date from employees
where hire_date = '1997-08-17';

select department_id, count(employee_id) from employees
group by department_id;

update employees
set department_id = 50
where hire_date = '1997-08-17';
