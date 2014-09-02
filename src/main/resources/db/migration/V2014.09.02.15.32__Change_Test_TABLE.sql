ALTER TABLE test_data
ADD snapshot varchar(255) NOT NULL;

insert into test_data
values("tom","abc"),
("jack","123"),
("小明","中文");