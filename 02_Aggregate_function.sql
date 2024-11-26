-- Aggregate Function

SELECT Employee_Name, Salary
FROM employees
Where (Salary = (SELECT min(Salary) FROM employees));

SELECT Employee_Name,min(Salary) as min_salary
FROM Employees
WHERE Salary = min_salary;

SELECT Employee_Name, Salary
FROM employees
ORDER BY Salary ASC
LIMIT 1;

