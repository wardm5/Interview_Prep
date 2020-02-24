-- Write your MySQL query statement below
-- Write a SQL query to find all duplicate emails in a table named Person.

Select Distinct(a.Email)
From Person a
Inner Join (
        Select Email, Count(Email) as count
        From Person
        group by Email) temp
On temp.Email = a.Email
where count > 1

-- Runtime: 260 ms, faster than 80.49% of MySQL online submissions for Duplicate Emails.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Duplicate Emails.
