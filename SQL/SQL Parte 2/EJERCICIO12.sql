use capgemini_arg;

desc departments;
desc employees;

SELECT DEPARTMENT_ID, SALARY FROM (
    SELECT DEPARTMENT_ID,MAX(SALARY) SALARY
      FROM Employees
      GROUP BY 1  
  ) c1 JOIN employeeS USING(SALARY,DEPARTMENT_ID)
  WHERE SALARY=(SELECT MAX(SALARY) FROM EMPLOYEES);