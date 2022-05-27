create table test1 (
    id                              bigserial primary key,
    title                           varchar(255),
    created_at                      timestamp default current_timestamp,
    updated_at                      timestamp default current_timestamp
);

create table test2 (
    id                              bigserial primary key,
    title                           varchar(255),
    price                           numeric (8, 2),
    test1_id                        bigint references test1 (id),
    created_at                      timestamp default current_timestamp,
    updated_at                      timestamp default current_timestamp
);

insert into test1 (title)
values
('title1'),
('title2');

insert into test2 (title, price, test1_id)
values
('title1', 30.00, 1),
('title2', 45.25, 2);