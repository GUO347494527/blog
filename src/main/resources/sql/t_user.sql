create table t_user (
  id bigint(20) not null auto_increment comment '编号',
  login_name varchar(20) not null comment '用户名',
  nickname varchar(20) not null comment '页面显示名',
  password varchar(100) not null comment '密码',
  salt varchar(100) not null comment 'salt',
  avatar varchar(100) default null comment '头像',
  primary key (id)
);

insert into t_user values ('00001', 'admmin', '李俊英', 'omb+V/PuKpz9ocFd3HTklQ==', '959b557c-5a8e-4362-99ef-1344e4db72fc', null);