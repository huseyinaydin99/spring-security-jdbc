INSERT INTO users(username,password,enabled) values('ali','123',true);
INSERT INTO users(username,password,enabled) values('huso','123',true);

INSERT INTO authorities(username,authority) values('ali','ROLE_USER');
INSERT INTO authorities(username,authority) values('huso','ROLE_ADMIN');