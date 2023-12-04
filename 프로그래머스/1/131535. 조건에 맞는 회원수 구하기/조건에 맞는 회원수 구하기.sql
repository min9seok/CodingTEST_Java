-- 코드를 입력하세요
SELECT count(user_id)
FROM user_info
where to_char(joined,'yyyy')= '2021'
and age >= 20
and age <= 29