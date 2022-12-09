use capgemini_arg;

desc locations;
desc departments;

select loc.CITY, dep.DEPARTMENT_NAME
from Locations loc
inner join Departments dep
on loc.location_id = dep.location_id;



