--2019.11.20



--사용자의 소유 테이블 정보

select *from tab; --테이블 사용시작 

-테이블 구조 확인
desc emp;

--테이블의 데이터 조회(검색, 질의)

select *
from emp
;

select *
from dept;

-사원과 이름과 직급 급여 출력하자
select ename, job, sal

from emp;

--사칙현산
select ename, sal ,sal*12
from emp;

--null 아직 정해지지 안흥ㄴ 데이터, 연산은 불가능-nully

select ename,sal, sal*12, sal*12+comm
from emp
;

-- Null 값을 치환하는 함수:  NVL(컬럼, 기본값)
select ename,sal, sal*12,nvl(comm,0), sal*12+nvl(comm,0)
from emp
;

-- 문자열의 연산(+) --> ||
select ename || 'is a'|| job from emp
;

-- DISTINCT: 중복데이터를 출력하지 않는다.
select deptno from emp;
select distinct deptno  from emp;
select distinct job  from emp;

-- 특정 행 선택 : where(조건식) 절 이용

select *
from emp
where sal >= 3000;
 // 보여주고 속성만 select
select ename, job, sal 
from emp
where sal >= 3000;

-- 조건식 
select *
from emp
Where deptno=10;

--문자열 비교 문자열은 작은 따움표 사용, 대소분자 구별한다.
select* from emp where ename= 'scott';
select* from emp where ename = 'SCOTT';

--날짜 비교
select *
from emp
where hiredate between '81/01/01' and  '81/12/31';
 hiredate = '87/04*19';
select* from emp where hiredate < '87/04*19';
select* from emp where hiredate > '87/04*19';

select * from emp where hiredate>= '81/01/01' and hiredate <= '81/12/31';
select *
from emp
where hiredate between '81/01/01' and  '81/12/31';

--OR 연산의 코드를 줄이는 IN 연산자
select* from emp where comm=300 or comm 500 or comm 1400;
select* from emp where comm in(300 , 500 , 1400);

- 패턴검색 : 컬럼 이름 Like 패턴식
select ename from emp where ename LIKE '%F';
select ename from emp where ename LIKE '%S';
select ename from emp where ename LIKE '%A%';

select ename from emp where ename like '_A%';

--NULL 연산자 : IS NULL, IS NOT NULL
select ename, comm from emp where comm is  null;

-- 결과 데이터 행의 정렬: oder by 컬럼명 asc(오름차순)/ desc (내림차순)

select ename, sal from emp order by sal asc;

select ename from emp order by ename asc;

--중복의 정열조건
select ename, sal from emp order by sal desc, ename asc;

--변환 한수: 날짜 -> 
select sysdate, to_char(sysdate, 'YYYY-MM-DD') as "날짜"
from dual;
select sysdate, to_char(sysdate, 'YYYY-MM-DD DAY') as "날짜"
from dual;

select to_char(12345, 'L0,000,000'), to_char(12345, 'L9,999,999'),to_char(123453.67, 'L9,999,999')
from dual;
select ename, sal, to_char(sal*1000, 'L9,999,999')
from emp
order by sal asc;

--정수변환
select trunc(sysdate-to_date('2000/01/01','YYYY/MM/DD'))
from dual;

--변환함수: to_date (문자열 /숫자,"패턴"
select to_number('20,000','999,999') -to_number('10,000','999,999')
from dual;


select empno, ename, job, sal, 
        decode(job, 'ANALYST', sal + sal*0.05,
                    'SALESMAN', sal + sal*0.1,
                    'MANAGER', sal + sal*0.15,
                    'CLERK', sal + sal*0.2
        ) upsal
from emp
order by job
;

select sum(sal) as "월 총 급여", trunc(avg(sal)) as "월평균 급여",
count(*) as "총사원의 수",
max(sal) as "최고 급여",
min(sal) as "최저 급여",
sum(comm) as "총상여금 ",
avg(comm) as "총상여금 평균 ",
count(comm) as "상여금 책정 인원"
from emp;

-- ____________________과제_____________________________________


--1.덧셈연산자를 이용하여 모든 사원에 대해서 $300의 급여 인상을 계산한 후 사원의 이름, 급여, 인상된 급여를 출력하시오.

select ename,sal, sal+300
from emp;
--2. 사원의 이름, 급여, 연간 총 수입을 총 수입이 많은 것부터 작은 순으로 출력하시오,
--연간 총수입은 월급에 12를 곱한 후 $100의 상여금을 더해서 계산하시오.
select ename,sal, sal*12+100
from emp
order by sal*12+100 desc;

--3. 급여가 2000을 넘는 사원의 이름과 급여를 표현, 급여가 많은 것부터 작은 순으로 출력하시오.

select ename,sal
from emp
where sal > 2000
order by sal desc;

--4. 사원번호가 7788인 사원의 이름과 부서번호를 출력하시오.
--ps: 사원번호도 보여줬음
select ename,deptno,empno from emp where empno = 7788;



--5. 급여가 2000에서 3000 사이에 포함되지 않는 사원의 이름과 급여를 출력하시오.
select ename,sal
from emp
where sal < 2000 or sal>3000;

--6. 1981년 2월 20일 부터 1981년 5월 1일 사이에 입사한 사원의 이름, 담당업무, 입사일을 출력하시오.
select ename,job,hiredate
from emp
where hiredate>= '81/02/20' and hiredate <= '81/05/01';

--7. 부서번호가 20 및 30에 속한 사원의 이름과 부서번호를 출력, 이름을 기준(내림차순)으로 영문자순으로 출력하시오.
select ename,deptno
from emp
where deptno= 20 or deptno= 30 
order by ename desc;

--8. 사원의 급여가 2000에서 3000사이에 포함되고 부서번호가 20 또는 30인 사원의 이름, 급여와 부서번호를 출력, 이름순(오름차순)으로 출력하시오
select ename,sal, deptno
from emp
where (deptno= 20 or deptno= 30) and (sal>=2000 and sal<=3000)
order by ename asc;

--9. 1981년도에 입사한 사원의 이름과 입사일을 출력하시오. (like 연산자와 와일드카드 사용)
select ename,hiredate
from emp
where hiredate LIKE '%81%';

--10. 관리자가 없는 사원의 이름과 담당 업무를 출력하시오.

select ename,job
from emp
where mgr is null;

--11. 커미션을 받을 수 있는 자격이 되는 사원의 이름, 급여, 커미션을 출력하되 급여 및 커미션을 기준으로 내림차순 정렬하여 표시하시오.

select ename,sal, comm
from emp
where comm>0
order by comm desc;

--12. 이름의 세번째 문자가 R인 사원의 이름을 표시하시오.

select ename
from emp
where ename like '__R%';

--13. 이름에 A와 E를 모두 포함하고 있는 사원의 이름을 표시하시오.

select ename
from emp
where ename like '%E%' and ename like '%A%';

--14. 담당업무가 CLERK, 또는 SALESMAN이면서 급여가 $1600, $950 또는 $1300이 아닌 사원의 이름, 담당업무, 급여를 출력하시오.

select ename,job,sal
from emp
where  (job ='CLERK' or job ='SALESMAN')  and (sal !=1300 or sal in(1600,950));



--15. 커미션이 $500 이상인 사원의 이름과 급여 및 커미션을 출력하시오.

select ename,sal, comm
from emp
where comm>=500 ;


--16. SUBSTR 함수를 사용하여 사원들의 입사한 년도와 입사한 달만 출력하시오.

select ename, substr(hiredate,0,5)
from emp;

--17. SUBSTR 함수를 사용하여 4월에 입사한 사원을 출력하시오

select ename, hiredate
from emp
where substr(hiredate,5,1)=4;

--18. MOD 함수를 사용하여 사원번호가 짝수인 사람만 출력하시오.
select ename, empno
from emp
where mod(empno,2)=0;

--19. 입사일을 년도는 2자리(YY), 월은 숫자(MON)로 표시하고 요일은 약어 (DY)로 지정하여 출력하시오.

select hiredate, to_char(hiredate, 'YY-MM-DY') 
from emp;

--20. 올해 몇 칠이 지났는지 출력하시오. 현재날짜에서 올해 1월 1일을 뺀 결과를 출력하고 TO_DATE 함수를 사용하여 데이터 형을 일치 시키시오.

select sysdate, to_date(sysdate, 'YYYY-MM-DD')-to_date('19/01/01', 'YYYY-MM-DD')
from dual;
--21. 사원들의 상관 사번을 출력하되 상관이 없는 사원에 대해서는 NULL 값 대신 0으로 출력하시오.

select nvl(mgr,0)
from emp;

--22. DECODE 함수로 직급에 따라 급여를 인상하도록 하시오. 직급이 ‘ANALIST”인 사원은 200, ‘SALESMAN’인 사원은 180, 
--‘MANAGER’인 사원은 150, ‘CLERK”인 사원은 100을 인상하시오

select ename, job, sal, 
        decode(job, 'ANALYST', sal + 200,
                    'SALESMAN', sal + 180,
                    'MANAGER', sal + 150,
                    'CLERK', sal + 100
        ) upsal
from emp
group by deptno;

--23. 모든 사원의 급여 최고액, 최저액, 총액 및 평균 급여를 출력하시오. 평균에 대해서는 정수로 반올림하시오.

select sum(sal) as "월 총 급여", 
trunc(avg(sal)) as "월평균 급여",
max(sal) as "최고 급여",
min(sal) as "최저 급여"
from emp;

--24. 각 담당 업무 유형별로 급여 최고액, 최저액, 총액 및 평균 액을 출력하시오. 평균에 대해서는 정수로 반올림 하시오

select job,max(sal), min(sal),sum(sal),trunc(avg(sal))
from emp
group by job;

--25. COUNT(*) 함수를 이용하여 담당업무가 동일한 사원 수를 출력하시오

select job, count(*)
from emp
group by job;

--26. 관리자 수를 나열하시오.

select count(mgr)
from emp;

--27. 급여 최고액, 급여 최저액의 차액을 출력하시오.

select max(sal)-min(sal) as "최고 최저 차액" 
from emp;

--28. 직급별 사원의 최저 급여를 출력하시오. 관리자를 알 수 없는 사원의 최저 급여가 2000 미만인 
--그룹은 제외시키고 결과를 급여에 대한 내림차순으로 정렬하여 출력하시오.
--직급이 있는지 모르겠네요?? empno: 사원번호 ename:사원이름 job:담당업무 mgr:관리자번호 hiredate:입사날짜 comm:상여금 deptno:부서번호

--29. 각 부서에 대해 부서번호, 사원 수, 부서 내의 모든 사원의 평균 급여를 출력하시오. 평균 급여는 소수점 둘째 자리로 반올림 하시오.

select deptno,count(*),round(avg(sal),2)
from emp
group by deptno;


--30. 각 부서에 대해 부서번호 이름, 지역 명, 사원 수, 부서내의 모든 사원의 평균 급여를 출력하시오. 평균 급여는 정수로 반올림 하시오. DECODE 사용.
--잘모르겠습니다.

select deptno ,count(*) as "부서 인원수",
decode(deptno, 10, round(avg(sal),0),20, round(avg(sal),0),30, round(avg(sal),0)) as "부서 평균",
decode(deptno, 10, '   하',20, '   중',30, '   상') as "부서 이름"
from emp
group by deptno
order by deptno;
--지역명이 뭔지는 모르겠네요??? empno: 사원번호 ename:사원이름 job:담당업무 mgr:관리자번호 hiredate:입사날짜 comm:상여금 deptno:부서번호

--31.

select job, deptno as "DNO",
decode(deptno, 10, avg(sal)) as "부서 10",
decode(deptno, 20, avg(sal)) as "부서 20",
decode(deptno, 30, avg(sal)) as "부서 30",
sum(sal) as "총액"
from emp
group by job, deptno
order by deptno
;
