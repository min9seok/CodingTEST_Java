-- 코드를 입력하세요
SELECT a.TITLE , a.BOARD_ID, b.REPLY_ID , b.WRITER_ID, 
b.CONTENTS, to_char(b.CREATED_DATE,'YYYY-MM-DD') as CREATED_DATE
from USED_GOODS_BOARD a ,USED_GOODS_REPLY b
where TO_CHAR(a.CREATED_DATE,'YYYY-MM-DD') like '2022-10%'
and a.BOARD_ID = b.BOARD_ID
order by b.CREATED_DATE,a.TITLE asc