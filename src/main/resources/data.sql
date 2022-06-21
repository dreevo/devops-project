DELETE FROM `devops-db`.`t_employee` ;
INSERT INTO `devops-db`.`t_employee` (`id`, `email`, `username`, `age`,`department_id`) VALUES ('1', 'john@email.com', 'john doe', 25,'2');
INSERT INTO `devops-db`.`t_employee` (`id`, `email`, `username`, `age`,`department_id`) VALUES ('2', 'jack@email.com', 'jack', 23,'2');
INSERT INTO `devops-db`.`t_employee` (`id`, `email`, `username`, `age`,`department_id`) VALUES ('3', 'anthony@email.com', 'anthony', 14,'3');
INSERT INTO `devops-db`.`t_employee` (`id`, `email`, `username`, `age`,`department_id`) VALUES ('4', 'roxy@email.com', 'roxy', 22,'1');
INSERT INTO `devops-db`.`t_employee` (`id`, `email`, `username`, `age`,`department_id`) VALUES ('5', 'emily@email.com', 'emily', 33,'1');
INSERT INTO `devops-db`.`t_employee` (`id`, `email`, `username`, `age`,`department_id`) VALUES ('6', 'steven@email.com', 'steven', 44,'2');
INSERT INTO `devops-db`.`t_employee` (`id`, `email`, `username`, `age`,`department_id`) VALUES ('7', 'bob@email.com', 'bob', 18,'3');

DELETE FROM `devops-db`.`t_department` ;
INSERT INTO `devops-db`.`t_department` (`id`, `name`,`dept_chef_id`) VALUES ('1', 'HR','4');
INSERT INTO `devops-db`.`t_department` (`id`, `name`,`dept_chef_id`) VALUES ('2', 'Cloud','2' );
INSERT INTO `devops-db`.`t_department` (`id`, `name`,`dept_chef_id`) VALUES ('3', 'Finance','7' );