## Original Schema

```
CREATE TABLE `user_debug` (
`id` int NOT NULL AUTO_INCREMENT,
`version` mediumint unsigned NOT NULL DEFAULT '1',
`member_id` int NOT NULL,
`debug_level` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
`create_date` datetime NOT NULL,
`update_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE
CURRENT_TIMESTAMP,
PRIMARY KEY (`id`),
UNIQUE KEY `ud_umid` (`member_id`),
CONSTRAINT `ud_mid` FOREIGN KEY (`member_id`) REFERENCES `member` (`id`)

) ENGINE=InnoDB AUTO_INCREMENT=11802 DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci
```


To set the debug_level column to 'NONE' if the last time the row was updated is more than 10 days in the past, we would run:
```
UPDATE user_debug
SET debug_level = 'NONE'
WHERE update_date < DATEADD(DAY, -10, CURRENT_TIMESTAMP)
```
