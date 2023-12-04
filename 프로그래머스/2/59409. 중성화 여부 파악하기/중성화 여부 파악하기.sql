-- 코드를 입력하세요
SELECT ANIMAL_ID , name, 
CASE
WHEN SEX_UPON_INTAKE like '%Neutered%' THEN 'O'
WHEN SEX_UPON_INTAKE like '%Spayed%' THEN 'O'
ELSE 'X'
END as 중성화
-- SEX_UPON_INTAKE as 중성화 
from animal_ins
order by ANIMAL_ID