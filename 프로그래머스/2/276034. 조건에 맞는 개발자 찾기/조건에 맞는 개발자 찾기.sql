-- 코드를 작성해주세요
SELECT DISTINCT(ID), EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS a, SKILLCODES b
WHERE a.SKILL_CODE & b.CODE
AND ( b.NAME ='C#' OR b.NAME = 'Python')
ORDER BY ID