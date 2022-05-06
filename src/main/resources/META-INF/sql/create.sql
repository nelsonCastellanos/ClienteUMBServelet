create table client_umb
(
    id    int auto_increment,
    email nvarchar(100) not null,
    constraint client_umb_pk
        primary key (id)
);

create unique index client_umb_email_uindex
    on client_umb (email);

