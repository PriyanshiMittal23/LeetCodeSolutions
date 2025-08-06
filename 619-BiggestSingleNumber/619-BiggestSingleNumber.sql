-- Last updated: 6/8/2025, 11:10:41 pm
# Write your MySQL query statement below
select Max(num) as num
from(
    select num
    from MyNumbers
    group by num
    Having count(num)=1
) as un