CREATE TABLE `users` (
`userid` int(11) NOT NULL AUTO_INCREMENT, 
`username` varchar(30) DEFAULT NULL, 
`userage` int(11) DEFAULT NULL, PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;