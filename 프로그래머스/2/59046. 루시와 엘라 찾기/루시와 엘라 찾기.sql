-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE FROM ANIMAL_INS
where NAME in ('Lucy','Ella','Pickle','Rogan','Sabrina','Mitty') and SEX_UPON_INTAKE ='Spayed Female'
order by ANIMAL_ID