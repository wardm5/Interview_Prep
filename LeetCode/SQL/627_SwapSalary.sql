-- Given a table salary, such as the one below, that has m=male and f=female values.
-- Swap all f and m values (i.e., change all f values to m and vice versa) with a
-- single update statement and no intermediate temp table.
--
-- Note that you must write a single update statement, DO NOT write any select
-- statement for this problem.

# Write your MySQL query statement below
update salary set sex = (case when sex = 'f' then 'm' else 'f' end);

-- Runtime: 167 ms, faster than 93.24% of MySQL online submissions for Swap Salary.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Swap Salary.
