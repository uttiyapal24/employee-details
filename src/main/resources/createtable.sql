CREATE TABLE `employeedb`.`employee` (
  `emp_id` INT NOT NULL AUTO_INCREMENT,
  `emp_name` VARCHAR(45) NOT NULL,
  `emp_email` VARCHAR(100) NOT NULL,
  `emp_unit` VARCHAR(45) NULL,
  `emp_location` VARCHAR(45) NULL,
  `emp_phnum` VARCHAR(12) NULL,
  `emp_doj` VARCHAR(12) NULL,
  PRIMARY KEY (`emp_id`))
ENGINE = InnoDB;

CREATE TABLE employee_seq (
    next_val BIGINT
);

INSERT INTO employee_seq VALUES (1);