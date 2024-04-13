-- 코드를 입력하세요
SELECT PT_NAME , PT_NO , GEND_CD , AGE , decode(tlno,null,'NONE',tlno) TLNO
FROM patient
WHERE age <= 12
AND gend_cd = 'W'
ORDER BY age desc , pt_name asc