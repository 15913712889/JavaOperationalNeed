--`user` 

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userName` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `creationTime` datetime NOT NULL COMMENT '创建时间',
  `modificationTime` datetime DEFAULT NULL COMMENT '修改时间',
  `status` int NOT NULL COMMENT '是否删除,0表示已删除，1表示未删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';