-- 코드를 입력하세요
SELECT BOOK_ID,AUTHOR_NAME
    ,to_char(PUBLISHED_DATE,'yyyy-mm-dd') PUBLISHED_DATE
FROM BOOK a, AUTHOR b
WHERE a.AUTHOR_ID = b.AUTHOR_ID
AND CATEGORY = '경제'
order by 3