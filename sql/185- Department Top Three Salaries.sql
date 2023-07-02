/* 

Difficulty : Hard 

*/


SELECT D.name AS Department, E.name AS Employee, E.salary AS Salary
FROM Employee AS E
INNER JOIN Department AS D
ON E.departmentId = D.id
WHERE (

  SELECT COUNT(DISTINCT salary)
  FROM Employee
  WHERE departmentId = E.departmentId AND salary > E.salary

) < 3
