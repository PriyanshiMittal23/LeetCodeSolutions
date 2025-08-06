-- Last updated: 6/8/2025, 11:08:18 pm
# Write your MySQL query statement below
select tweet_id from Tweets where CHAR_LENGTH(content)>15;