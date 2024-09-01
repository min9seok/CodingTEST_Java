-- 코드를 작성해주세요
SELECT ID, LENGTH 
FROM FISH_INFO
where LENGTH >= 10
order by 2 desc, 1
LIMIT 10