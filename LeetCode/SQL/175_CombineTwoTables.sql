-- Write a SQL query for a report that provides the following information for each
-- person in the Person table, regardless if there is an address for each of those people:

# Write your MySQL query statement below
SELECT p.FirstName, p.LastName, City, State
FROM Person p
LEFT JOIN Address a
on p.PersonID = a.PersonID

-- Runtime: 263 ms, faster than 84.79% of MySQL online submissions for Combine Two Tables.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Combine Two Tables.
