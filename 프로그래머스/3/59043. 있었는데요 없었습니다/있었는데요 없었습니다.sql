-- 코드를 입력하세요
SELECT b.ANIMAL_ID,b.NAME
FROM ANIMAL_INS a , ANIMAL_OUTS  b
WHERE a.ANIMAL_ID = b.ANIMAL_ID
AND a.datetime > b.datetime
order by a.DATETIME