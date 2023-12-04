-- 코드를 입력하세요
SELECT i.name , i.datetime
FROM ANIMAL_INS i , ANIMAL_OUTS o
WHERE i.animal_id = o.animal_id(+)
AND o.ANIMAL_ID IS NULL
-- AND ROWNUM <=3
order by i.DATETIME
FETCH FIRST 3 ROWS ONLY