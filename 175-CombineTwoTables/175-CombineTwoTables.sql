-- Last updated: 6/8/2025, 11:13:01 pm
# Write your MySQL query statement below
Select P.firstName, P.lastName , A.city, A.state
from Person P
Left Join Address A 
on P.personId = A.personId