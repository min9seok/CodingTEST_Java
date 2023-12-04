SELECT A.CAR_ID, A.CAR_TYPE,
-- 100-DISCOUNT_RATE,
-- 30*DAILY_FEE,
           (100-DISCOUNT_RATE)*(30*DAILY_FEE)/100 FEE
      FROM CAR_RENTAL_COMPANY_CAR A
INNER JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN B
        ON A.CAR_TYPE = B.CAR_TYPE
     WHERE A.CAR_ID NOT IN (SELECT CAR_ID
                              FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                             WHERE (CAR_ID, END_DATE) IN (  SELECT CAR_ID, MAX(END_DATE)
                                                              FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                                                          GROUP BY CAR_ID)
                               AND TO_CHAR(START_DATE,'YYYY-MM-DD') <= '2022-11-30'
                               AND TO_CHAR(END_DATE,'YYYY-MM-DD') >= '2022-11-01') 
      AND A.CAR_TYPE IN ('세단', 'SUV')
      AND B.DURATION_TYPE = '30일 이상'
      AND (100-DISCOUNT_RATE)*(30*DAILY_FEE)/100 BETWEEN 500000 AND 2000000
 ORDER BY 3 DESC, 2, 1 DESC