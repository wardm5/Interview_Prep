-- Write your MySQL query statement below

select *
from cinema
where mod(id, 2) = 1 and description != 'boring'
order by rating desc

-- Runtime: 153 ms, faster than 86.18% of MySQL online submissions for Not Boring Movies.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Not Boring Movies.
