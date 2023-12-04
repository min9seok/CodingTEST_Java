-- 코드를 입력하세요
SELECT name, count(name)
FROM ANIMAL_INS 
WHERE name is not null
group by name
having count(name) >1
order by name