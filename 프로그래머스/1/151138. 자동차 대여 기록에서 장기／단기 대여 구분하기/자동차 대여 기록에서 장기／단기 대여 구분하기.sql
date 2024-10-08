SELECT HISTORY_ID , CAR_ID , 
to_char(start_date,'YYYY-MM-DD') as START_DATE , 
to_char(end_date,'YYYY-MM-DD') as END_DATE ,
CASE 
when (end_date-start_date+1) >= '30'  then '장기 대여'
else '단기 대여'
END RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where to_char(start_date,'YYYY-MM-DD') like '2022-09%'
order by HISTORY_ID desc