-- 코드를 입력하세요
SELECT round(AVG(daily_fee)) as average_fee
FROM CAR_RENTAL_COMPANY_CAR
WHERE car_type = 'suv'