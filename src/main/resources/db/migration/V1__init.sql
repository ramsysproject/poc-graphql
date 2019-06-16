--CREATE TABLE `customer` (
--  `id` bigint(20) NOT NULL AUTO_INCREMENT,
--  `name` varchar(255) NOT NULL,
--  `last_name` varchar(255) DEFAULT NULL,
--  `phone` bigint(20) DEFAULT NULL,
--  `shipment_address` varchar(255) DEFAULT NULL,
--  `street` varchar(255) NOT NULL,
--  `neighbourhood` varchar(255) NOT NULL,
--  `street_number` bigint(20) NOT NULL,
--  `email` varchar(255) DEFAULT NULL,
--  `status` int(11) DEFAULT NULL,
--  `province_id` bigint(20) DEFAULT NULL,
--  PRIMARY KEY (`id`),
--  KEY `fk_customer_province_id` (`province_id`),
--  CONSTRAINT `fk_customer_province_id` FOREIGN KEY (`province_id`) REFERENCES `province` (`id`),
--) ENGINE=InnoDB AUTO_INCREMENT DEFAULT CHARSET=utf8
--
--CREATE TABLE `province` (
--  `id` bigint(20) NOT NULL AUTO_INCREMENT,
--  `name` varchar(255) NOT NULL,
--  PRIMARY KEY (`id`)
--) ENGINE=InnoDB AUTO_INCREMENT DEFAULT CHARSET=utf8
--
--CREATE TABLE `order` (
--  `id` bigint(20) NOT NULL AUTO_INCREMENT,
--  `date` date NOT NULL,
--  `status` varchar(255) NOT NULL,
--  `bill_number` int(11) DEFAULT NULL,
--  `bill_type` bigint(20) DEFAULT NULL,
--  `customer_id` bigint(20) DEFAULT NULL,
--  PRIMARY KEY (`id`),
--  KEY `fk_order_customer_id` (`customer_id`),
--  CONSTRAINT `fk_order_customer_id` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
--) ENGINE=InnoDB AUTO_INCREMENT DEFAULT CHARSET=utf8

CREATE TABLE CUSTOMER (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  last_name varchar(255) DEFAULT NULL,
  phone bigint(20) DEFAULT NULL,
  shipping_address varchar(255) DEFAULT NULL,
  street varchar(255) NOT NULL,
  neighbourhood varchar(255) NOT NULL,
  street_number int NOT NULL,
  email varchar(255) DEFAULT NULL,
  status int DEFAULT NULL,
  province_id bigint(20) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE CUSTOMER_ORDER (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  created_date date NOT NULL,
  status varchar(255) NOT NULL,
  bill_number int(11) DEFAULT NULL,
  bill_type bigint(20) DEFAULT NULL,
  customer_id bigint(20) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE PROVINCE (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id)
);