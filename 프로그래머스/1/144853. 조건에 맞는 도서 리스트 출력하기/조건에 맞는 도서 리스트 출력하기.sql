-- 코드를 입력하세요
SELECT book_id,to_char(PUBLISHED_DATE,'yyyy-mm-dd')
from book
where to_char(PUBLISHED_DATE,'yyyy') like '2021'
and category ='인문'
order by PUBLISHED_DATE