CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
BEGIN
  RETURN QUERY (
    with RankedSalaries as (
        select e.id, e.salary, 
        dense_rank() over (order by e.salary desc) as rank
        from Employee as e
    )
    select r.salary 
    from RankedSalaries as r
    where rank = N
    limit 1
  );
END;
$$ LANGUAGE plpgsql;