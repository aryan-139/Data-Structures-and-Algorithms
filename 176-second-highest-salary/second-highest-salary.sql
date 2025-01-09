-- SELECT 
--     MAX(salary) AS SecondHighestSalary
-- FROM 
--     Employee
-- WHERE 
--     salary < (SELECT MAX(salary) FROM Employee);

select (select distinct salary from employee 
order by salary DESC LIMIT 1 OFFSET 1) as SecondHighestSalary