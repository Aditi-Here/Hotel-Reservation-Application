USE `hotel_management_system`;


DROP TABLE IF EXISTS `payment`;

CREATE TABLE `payment` (
  `payment_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(75) DEFAULT NULL,
  `last_name` varchar(75) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `card_number` varchar(100) DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  
  -- constraint FK_Customer foreign key (`customer_id`) references customer(`customer_id`),
  PRIMARY KEY (`payment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

