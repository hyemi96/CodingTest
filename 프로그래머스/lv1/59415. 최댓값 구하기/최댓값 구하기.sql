-- 코드를 입력하세요
select DATETIME
from(
   select *
   from ANIMAL_INS
   order by DATETIME DESC
)
where ROWNUM = 1