Aby uruchomić, należy wykonać poniższe skrypty w PgAdmin

create table STUDENT (
   student_id SERIAL NOT NULL,
   first_name VARCHAR(30) NOT NULL,
   last_name  VARCHAR(30) NOT NULL,
   PRIMARY KEY (student_id)
);


create table SUBJECT (
   subject_id SERIAL NOT NULL,
   name VARCHAR(30) NOT NULL,
   PRIMARY KEY (subject_id)
);


CREATE TABLE STUDENT_SUBJECT (
    student_id BIGINT NOT NULL,
    subject_id BIGINT NOT NULL,
    PRIMARY KEY (student_id, subject_id),
    CONSTRAINT FK_STUDENT FOREIGN KEY (student_id) REFERENCES STUDENT (student_id),
    CONSTRAINT FK_SUBJECT FOREIGN KEY (subject_id) REFERENCES SUBJECT (subject_id)
);