use capgemini_arg;

desc departments;

select * from departments;
update departments
set location_id = 9999
where department_name = 'IT';