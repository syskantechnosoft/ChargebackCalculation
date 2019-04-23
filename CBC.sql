CREATE TABLE `loan` (
  `loan_id` int(11) NOT NULL,
  `account_number` decimal(19,2) DEFAULT NULL,
  `emi_amount` double DEFAULT NULL,
  `interest_rate` double DEFAULT NULL,
  `loan_amount` double DEFAULT NULL,
  `no_of_years` int(11) DEFAULT NULL,
  `sanction_date` datetime DEFAULT NULL,
  PRIMARY KEY (`loan_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `refund` (
  `refund_id` int(11) NOT NULL AUTO_INCREMENT,
  `comments` varchar(255) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `refund_amount` double DEFAULT NULL,
  `refund_date` datetime DEFAULT NULL,
  `refund_status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`refund_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `bank_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `contact_number` bigint(20) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `account_number` decimal(19,2) DEFAULT NULL,
  `chargeback_amount` double DEFAULT NULL,
  `chargeback_date` datetime DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `reason` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `emi` (
  `loanId` int(11) NOT NULL,
  `dueDate` datetime DEFAULT NULL,
  `paidDate` datetime DEFAULT NULL,
  `loan_id` int(11) DEFAULT NULL,
  `due_date` datetime DEFAULT NULL,
  `paid_date` datetime DEFAULT NULL,
  PRIMARY KEY (`loanId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

