CREATE table restaurants (
    id int not null auto_increment,
    restaurant_name varchar(200) not null,
    kind varchar(200) not null,
    location varchar(500) not null,
    maximum_chair int not null,
    start_time TIME not null,
    closed_time TIME not null,

    primary key (id),
);

CREATE table user(
    id int not null auto_increment,
    user_name varchar(100) not null,

    primary key (id),
);

CREATE table reservations (
    id int not null auto_increment,
    user_id int unique,
    restaurant_id int unique,
    reservation_time dtime
);
