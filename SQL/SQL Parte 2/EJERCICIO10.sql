use capgemini_arg;

desc jobs;

select job_title, min_salary + max_salary as salary, job_id from jobs
where job_id <any (select AVG(min_salary + max_salary) >=13000) and job_id != 'MK_REP'
group by job_id;


