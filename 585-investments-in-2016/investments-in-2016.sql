# Write your MySQL query statement below
SELECT ROUND(SUM(i.tiv_2016), 2) AS tiv_2016
FROM Insurance i
JOIN (
    SELECT tiv_2015
    FROM Insurance
    GROUP BY tiv_2015
    HAVING COUNT(*) > 1
) t2015 ON i.tiv_2015 = t2015.tiv_2015
JOIN (
    SELECT lat, lon
    FROM Insurance
    GROUP BY lat, lon
    HAVING COUNT(*) = 1
) unique_location ON i.lat = unique_location.lat AND i.lon = unique_location.lon;
