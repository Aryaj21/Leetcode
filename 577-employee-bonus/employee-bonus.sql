# Write your MySQL query statement below
SELECT name, bonus
FROM Employee LEFT JOIN Bonus
ON employee.empId=Bonus.empId
WHERE Bonus<1000 || Bonus IS NULL