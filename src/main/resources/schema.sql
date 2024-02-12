create table course (
    id int not null unique,
    name varchar(50) not null,
    author varchar(50) not null,
    primary key(id)
);