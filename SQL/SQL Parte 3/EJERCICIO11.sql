use capgemini_arg;

desc departments;
desc countries;
desc regions;
desc locations;

select COUNT(dep.department_name) as departamentos, cou.country_name, reg.region_name from departments dep
inner join locations loc
on dep.LOCATION_ID = loc.LOCATION_ID
inner join countries cou
on loc.COUNTRY_ID = cou.COUNTRY_ID
inner join Regions reg
on reg.region_id = cou.region_id
and reg.region_name in ('Americas','Europe')
group by COU.COUNTRY_ID;