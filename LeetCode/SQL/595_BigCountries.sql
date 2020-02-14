-- A country is big if it has an area of bigger than 3 million square km or a
-- population of more than 25 million.
-- Write a SQL solution to output big countries' name, population and area.

-- #  Write your MySQL query statement below
Select name, population, area
from World
Where area > 3000000 or population > 25000000

-- Runtime: 218 ms, faster than 98.85% of MySQL online submissions for Big Countries.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Big Countries.
