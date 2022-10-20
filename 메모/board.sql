--  테이블삭제
DROP TABLE BOARD;
 DROP SEQUENCE BOARD_BDNO_SEQ;

-- 게시판 글번호 시퀀스
CREATE SEQUENCE BOARD_BDNO_SEQ START WITH 1
  INCREMENT BY 1;

-- 게시판 테이블
 CREATE TABLE BOARD (
  BDNO          NUMBER(8),
  BDCG 		    VARCHAR2(20),
  BDTITLE 		VARCHAR2(100),
  MEMNO 	    NUMBER(8),
  BDCONTENT 	CLOB,
  UFNO          NUMBER(8),
  BDGROUP 	    NUMBER(8)DEFAULT 0,
  BDDEPTH 	    NUMBER(8)DEFAULT 0,
  BDVIEW        NUMBER(8)DEFAULT 0,
  BDHIT         NUMBER(8)DEFAULT 0,
  BDCDATE       timestamp default systimestamp,
  BDUDATE       timestamp default systimestamp
  );


 ALTER TABLE BOARD ADD CONSTRAINT BOARD_BDNO_PK PRIMARY KEY (BDNO);
 ALTER TABLE BOARD ADD CONSTRAINT BOARD_MEMNO_FK FOREIGN KEY (MEMNO)
      REFERENCES MEMBER(MEMNO);
 ALTER TABLE BOARD ADD CONSTRAINT BOARD_UFNO_FK FOREIGN KEY (UFNO)
      REFERENCES UPLOADFILE(UFNO);
 ALTER TABLE BOARD MODIFY BDCG CONSTRAINT BOARD_BDCG_NN NOT NULL;
 ALTER TABLE BOARD MODIFY BDTITLE CONSTRAINT BOARD_BDTITLE_NN NOT NULL;
 ALTER TABLE BOARD MODIFY MEMNO CONSTRAINT BOARD_MEMNO_NN NOT NULL;
 ALTER TABLE BOARD MODIFY BDCONTENT CONSTRAINT BOARD_BDCONTENT_NN NOT NULL;
 ALTER TABLE BOARD MODIFY UFNO CONSTRAINT BOARD_UFNO_NN NOT NULL;
 ALTER TABLE BOARD MODIFY BDGROUP CONSTRAINT BOARD_BDGROUP_NN NOT NULL;
 ALTER TABLE BOARD MODIFY BDDEPTH CONSTRAINT BOARD_BDDEPTH_NN NOT NULL;
 ALTER TABLE BOARD MODIFY BDVIEW CONSTRAINT BOARD_BDVIEW_NN NOT NULL;
 ALTER TABLE BOARD MODIFY BDHIT CONSTRAINT BOARD_BDHIT_NN NOT NULL;
 ALTER TABLE BOARD MODIFY BDCDATE CONSTRAINT BOARD_BDCDATE_NN NOT NULL;
 ALTER TABLE BOARD MODIFY BDUDATE CONSTRAINT BOARD_BDUDATE_NN NOT NULL;

 --게시판 추가 test
  INSERT INTO BOARD (BDNO, BDCG,BDTITLE,MEMNO,BDCONTENT)
  VALUES (BOARD_BDNO_SEQ.nextval, 1,'제목',1,'본문내용입니다.');

  SELECT * FROM BOARD;
