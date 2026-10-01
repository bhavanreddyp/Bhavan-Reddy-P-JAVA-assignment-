- 1. Create the students table
CREATE TABLE students (
student_id INT AUTO_INCREMENT,
roll_no VARCHAR(20),
name VARCHAR(100) NOT NULL,
age INT,
date_of_birth DATE,
email_id VARCHAR(100) NOT NULL,
phone_number VARCHAR(15) NOT NULL,
address TEXT,
PRIMARY KEY (student_id)
);
​-- 2. Insert three records into the students table
INSERT INTO students (roll_no, name, age, date_of_birth, email_id, phone_number, address)
VALUES
('101', 'Aarav Sharma', 20, '2006-03-15', 'aarav.sharma@example.com', '9876543210', '123 MG Road, Bengaluru, Karnataka'),
('102', 'Priya Patel', 21, '2005-08-22', 'priya.patel@example.com', '9876543211', '45 Park Street, Mumbai, Maharashtra'),
('103', 'Rohan Verma', 19, '2007-01-10', 'rohan.verma@example.com', '9876543212', '78 Civil Lines, Delhi');