
--CREATE TABLE "user" (
--    id  long NOT NULL,
--    email VARCHAR(255),
--    firstName VARCHAR(255),
--    lastName VARCHAR(255),
--    password VARCHAR(255)
--);

INSERT INTO student (id, firstName, lastName, email,password) VALUES (1111, 'Tyrion', 'Lannister', 'tyrion.lannister@mail.univ.ca','123456');
INSERT INTO student (id, firstName, lastName, email,password) VALUES (1121, 'Tyrion', 'Lannister', 'tyrion.lannister@mail.univ.ca','123456');

INSERT INTO Management (id, firstName, lastName, email,password) VALUES (1131, 'Tyrion', 'Lannister', 'tyrion.lannister@mail.univ.ca','123456');

INSERT INTO EngineeringStreams(streamId, streamName, ManagementId) VALUES ('1', 'Indy',1131);

INSERT INTO Indy(Id, Spec, Indus, Certifications, Degree, Sim_degree, Job_name, Job_salary,Skills ) VALUES ('1', 'SomeSpec', 'SomeIndustry', 'Cert1', 'Degree1', 'SimDegree1', 'JobName1', 50000, 'Skill1');


