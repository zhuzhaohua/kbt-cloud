

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for oauth_client_details
-- ----------------------------
DROP TABLE IF EXISTS `oauth_client_details`;
CREATE TABLE `oauth_client_details` (
  `client_id` varchar(250) NOT NULL,
  `resource_ids` varchar(256) DEFAULT NULL,
  `client_secret` varchar(256) DEFAULT NULL,
  `scope` varchar(256) DEFAULT NULL,
  `authorized_grant_types` varchar(256) DEFAULT NULL,
  `web_server_redirect_uri` varchar(256) DEFAULT NULL,
  `authorities` varchar(256) DEFAULT NULL,
  `access_token_validity` int(11) DEFAULT NULL,
  `refresh_token_validity` int(11) DEFAULT NULL,
  `additional_information` varchar(4096) DEFAULT NULL,
  `autoapprove` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`client_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of oauth_client_details
-- ----------------------------
BEGIN;
INSERT INTO `oauth_client_details` VALUES ('client', 'kbt', '{noop}123456', 'api', 'authorization_code,client_credentials,password,refresh_token', NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;




-- ----------------------------
-- Table structure for kbt_user
-- ----------------------------
DROP TABLE IF EXISTS `kbt_user`;
CREATE TABLE `kbt_user` (
  `id` varchar(64) NOT NULL,
  `username` varchar(64) NOT NULL,
  `nickname` varchar(64) NOT NULL,
  `password` varchar(255) NOT NULL,
  `enabled` tinyint(1) DEFAULT '1',
  `email` varchar(64) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `roles` varchar(255) NOT NULL,
  `reg_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kt_user
-- ----------------------------
BEGIN;
INSERT INTO `kbt_user` VALUES (1, 'test1', 'test1', '{noop}123456', 1, '332139558@qq.com', '/img/1.jpeg', 'admin', '2019-05-01 09:28:15');
INSERT INTO `kbt_user` VALUES (2, 'admin', 'admin', '{noop}admin', 1, '332139558@qq.cm', '/img/1.jpeg', 'admin', '2019-05-02 17:14:38');
COMMIT;


SET FOREIGN_KEY_CHECKS = 1;
