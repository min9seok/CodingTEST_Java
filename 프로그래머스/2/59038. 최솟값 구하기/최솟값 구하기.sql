-- 코드를 입력하세요
SELECT DATETIME
FROM ANIMAL_INS 
WHERE DATETime = (select min(datetime) from ANIMAL_INS )