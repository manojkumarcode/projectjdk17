-- noinspection SqlNoDataSourceInspectionForFile

-- noinspection SqlDialectInspectionForFile

CREATE TABLE IF NOT EXISTS EMPLOYEE (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    designation VARCHAR(255) NOT NULL,
    manager_id INT,
    FOREIGN KEY (manager_id) REFERENCES EMPLOYEE(id)
    );

INSERT INTO EMPLOYEE (name, designation) VALUES ('John Doe', 'CEO');
INSERT INTO EMPLOYEE (name, designation, manager_id) VALUES ('Manoj', 'Developer', 1);
INSERT INTO EMPLOYEE (name, designation, manager_id) VALUES ('Ram', 'Tester', 1);
INSERT INTO EMPLOYEE (name, designation, manager_id) VALUES ('Sri Vidya', 'Manager', 1);
INSERT INTO EMPLOYEE (name, designation, manager_id) VALUES ('Keshava Rao', 'Manager', 4);
INSERT INTO EMPLOYEE (name, designation, manager_id) VALUES ('Chinni Krishna', 'Manager', 4);
