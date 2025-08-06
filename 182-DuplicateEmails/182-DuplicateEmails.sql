-- Last updated: 6/8/2025, 11:12:59 pm
# Write your MySQL query statement below
select email from Person
group by email
having count(email)>1;