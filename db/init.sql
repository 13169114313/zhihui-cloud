-- 创建oauth 终端表
DROP TABLE IF EXISTS `oauth_client_details`;
CREATE TABLE `oauth_client_details` (
  `client_id` varchar(48) NOT NULL COMMENT '终端ID',
  `resource_ids` varchar(256) DEFAULT NULL COMMENT '资源ID',
  `client_secret` varchar(256) DEFAULT NULL ,
  `scope` varchar(256) DEFAULT NULL COMMENT '范围',
  `authorized_grant_types` varchar(256) DEFAULT NULL COMMENT '授权类型',
  `web_server_redirect_uri` varchar(256) DEFAULT NULL COMMENT '重定向地址',
  `authorities` varchar(256) DEFAULT NULL,
  `access_token_validity` int(11) DEFAULT NULL,
  `refresh_token_validity` int(11) DEFAULT NULL,
  `additional_information` varchar(4096) DEFAULT NULL,
  `autoapprove` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '终端表';
