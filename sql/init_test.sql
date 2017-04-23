use test;
DROP TABLE IF EXISTS user_t;

CREATE TABLE user_t(
  id int(11) NOT NULL AUTO_INCREMENT,
  user_name varchar(40) NOT NULL,
  password varchar(255) NOT NULL,
  age int(4) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table user_t */

insert  into user_t(user_name,password,age) values ('LQQ','123',18);
insert  into user_t(user_name,password,age) values ('LQQ','123',20);
insert  into user_t(user_name,password,age) values ('LQQ','123',21);
insert  into user_t(user_name,password,age) values ('LQQ','123',22);
insert  into user_t(user_name,password,age) values ('LQQ','123',23);
insert  into user_t(user_name,password,age) values ('LQQ','123',24);
insert  into user_t(user_name,password,age) values ('LQQ','123',25);
insert  into user_t(user_name,password,age) values ('LQQ','123',26);
insert  into user_t(user_name,password,age) values ('LQQ','123',27);
insert  into user_t(user_name,password,age) values ('LQQ','123',28);  