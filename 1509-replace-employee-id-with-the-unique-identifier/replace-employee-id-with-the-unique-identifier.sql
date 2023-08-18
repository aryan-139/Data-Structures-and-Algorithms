SELECT (
    SELECT unique_id
    FROM EmployeeUNI
    WHERE EmployeeUNI.id = Employees.id
) AS unique_id, Employees.name
FROM Employees;
