USE `hotel_management_system`;


DROP TABLE IF EXISTS `reservation`;

CREATE TABLE `reservation` (
  `reservation_id` int NOT NULL AUTO_INCREMENT,
  `property_id` int DEFAULT NULL,
  `check_in` varchar(75) DEFAULT NULL,
  `check_out` varchar(75) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `payment_id` int DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  constraint FK_Customer foreign key (`customer_id`) references customer(`customer_id`),
  PRIMARY KEY (`reservation_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

