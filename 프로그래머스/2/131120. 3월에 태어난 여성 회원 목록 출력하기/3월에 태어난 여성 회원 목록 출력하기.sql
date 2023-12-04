-- 코드를 입력하세요
SELECT member_id, member_name, gender, to_char(date_of_birth,'yyyy-mm-dd') date_of_birth
FROM MEMBER_PROFILE 
WHERE tlno is not null
AND substr(to_char(date_of_birth,'yyyy-mm-dd'),6,2) = 03
AND gender = 'W'
ORDER BY member_id