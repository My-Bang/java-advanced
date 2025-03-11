create database if not exists normalization;

use normalization;

CREATE TABLE 동아리가입학생학과 -- 기본키 {동아리번호,학번} 인 정규화되지 않은 동아리 가입학생학과 테이블
(
    동아리번호  CHAR(2)     NOT NULL,
    동아리명   VARCHAR(30) NOT NULL,
    동아리개설일 DATETIME    NOT NULL,
    학번     CHAR(6)     NOT NULL,
    이름     VARCHAR(20) NOT NULL,
    동아리가입일 DATETIME    NOT NULL,
    학과번호   CHAR(2)     NOT NULL,
    학과명    VARCHAR(50) NOT NULL,
    CONSTRAINT pk_동아리번호_학번 PRIMARY KEY (동아리번호, 학번)
);
DESC 동아리가입학생학과;

INSERT INTO 동아리가입학생학과
VALUES ('C1', '지구여행', 2000 - 02 - 01, '231001', '문지영', 2023 - 04 - 01, 'D1', '화학공학과'),
       ('C1', '지구여행', 2000 - 02 - 01, '231002', '배경민', 2023 - 04 - 03, 'D4', '경영학과'),
       ('C2', '클래식연구회', 2010 - 06 - 05, '232001', '김명희', 2023 - 03 - 22, 'D2', '통계학과'),
       ('C3', '위조이골프', 2020 - 03 - 01, '232002', '전은정', 2023 - 03 - 07, 'D2', '통계학과'),
       ('C3', '위조이골프', 2020 - 03 - 01, '231002', '배경민', 2023 - 04 - 02, 'D4', '경영학과'),
       ('C4', '끼춤', 2021 - 02 - 01, '231001', '문지영', 2023 - 04 - 30, 'D1', '화학공학과'),
       ('C4', '끼춤', 2021 - 02 - 01, '233001', '이현경', 2023 - 03 - 27, 'D3', '컴퓨터공학과');

-- ========================================================================
-- 의사
create table Doctors
(
    doc_id       integer     not null,
    major_treat  varchar(30) not null,
    doc_name     varchar(30) not null,
    doc_gender   char(1)     not null,
    doc_phone    varchar(15) null,
    doc_email    varchar(30) unique,
    doc_position varchar(20)

);

alter table Doctors
    add constraint doc_id_pk primary key (doc_id);

-- 간호사
create table Nurses
(
    nur_id       integer     not null,
    major_treat  varchar(30) not null,
    nur_name     varchar(30) not null,
    nur_gender   char(1)     not null,
    nur_phone    varchar(15) null,
    nur_email    varchar(30) unique,
    nur_position varchar(20)

);

alter table Nurses
    add constraint nur_id_pk primary key (nur_id);


-- 환자

create table Patients
(
    pat_id      integer      not null,
    nur_id      integer      not null,
    doc_id      integer      not null,
    pat_jumin   varchar(14)  not null,
    pat_name    varchar(30)  not null,
    pat_address varchar(100) not null,
    pat_phone   varchar(15)  not null,
    pat_email   varchar(30) unique,
    pat_job     varchar(20)  not null

);

alter table Patients
    add constraint pat_id_pk primary key (pat_id);


alter table Patients
    add constraint pat_doc_id_pk foreign key (doc_id) references Doctors(doc_id);


alter table Patients
    add constraint pat_nur_id_pk foreign key (nur_id) references Nurses(nur_id);


-- 진료

create table Treatments(
  treat_id integer not null,
  pat_id integer not null ,
  doc_id integer not null ,
  treat_contents text not null ,
  treat_date datetime not null

);


alter table Treatments
    add constraint treat_pat_id_pk primary key (treat_id,pat_id,doc_id);


alter table Treatments
    add constraint treat_pat_id_pk foreign key (pat_id) references Patients(pat_id);


alter table Treatments
    add constraint treat_doc_id_pk foreign key (doc_id) references Doctors(doc_id);


-- 차트

create table Charts(
    chart_id varchar(20) not null,
    treat_id integer not null,
    doc_id integer not null,
    pat_id integer not null,
    nur_id integer not null,
    chart_contents text not null

);

alter table Charts
    add constraint charts_terat_doc_pat_id_pk primary key (chart_id,treat_id,pat_id,doc_id);


alter table Charts
    add constraint charts_nur_id_pk foreign key (nur_id) references Nurses(nur_id);


alter table Charts
    add constraint charts_terat_doc_pat_id_pk foreign key (treat_id, pat_id, doc_id) references Treatments(treat_id, pat_id, doc_id);


use ssgdb;

create table account(name varchar(30), balance int);
insert into account values ('박지성', 100000);
insert into account values ('김연아', 100000);
start transaction;
update account set balance = balance - 1000000 where name = '박지성';
update account set balance = balance + 1000000 where name = '김연아';
commit;
select * from account;






























