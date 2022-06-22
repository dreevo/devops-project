create table t_employee (id bigint not null auto_increment, age integer, email varchar(255), username varchar(255), primary key (id));
INSERT INTO `devops-db`.`t_employee` (`id`, `email`, `username`, `age`) VALUES ('1', 'john@email.com', 'john doe', 25);
INSERT INTO `devops-db`.`t_employee` (`id`, `email`, `username`, `age`) VALUES ('2', 'jack@email.com', 'jack', 23);
INSERT INTO `devops-db`.`t_employee` (`id`, `email`, `username`, `age`) VALUES ('3', 'anthony@email.com', 'anthony', 14);
INSERT INTO `devops-db`.`t_employee` (`id`, `email`, `username`, `age`) VALUES ('4', 'roxy@email.com', 'roxy', 22);
INSERT INTO `devops-db`.`t_employee` (`id`, `email`, `username`, `age`) VALUES ('5', 'emily@email.com', 'emily', 33);
INSERT INTO `devops-db`.`t_employee` (`id`, `email`, `username`, `age`) VALUES ('6', 'steven@email.com', 'steven', 44);
INSERT INTO `devops-db`.`t_employee` (`id`, `email`, `username`, `age`) VALUES ('7', 'bob@email.com', 'bob', 18);

INSERT INTO `devops-db`.`t_transfer` (`id`, `name`, `location`, `start_date`, `end_date`) VALUES ('1', 'Angular Conference', 'England', '2019-01-10', '2019-06-10');
INSERT INTO `devops-db`.`t_transfer` (`id`, `name`, `location`, `start_date`, `end_date`) VALUES ('2', 'JavaScript Conference', 'Spain', '2019-01-10', '2020-06-10');

INSERT INTO `devops-db`.`emp_transfers` (`employees_id`, `transfers_id`) VALUES ('1', '1');
INSERT INTO `devops-db`.`emp_transfers` (`employees_id`, `transfers_id`) VALUES ('2', '1');

INSERT INTO `devops-db`.`emp_transfers` (`employees_id`, `transfers_id`) VALUES ('1', '2');
INSERT INTO `devops-db`.`emp_transfers` (`employees_id`, `transfers_id`) VALUES ('2', '2');