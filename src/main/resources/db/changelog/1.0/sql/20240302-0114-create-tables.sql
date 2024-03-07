create table _USER
(
    ID        varchar(255) not null,
    LOGIN     varchar(255),
    PASSWORD  varchar(255),
--     ROLE      varchar(255),
    primary key (ID)
);

create table USERPROFILE
(
    ID             varchar(255) not null,
    USER_ID        varchar(255) not null,
--     PHOTO          varchar(255),
    FIRST_NAME     varchar(255),
    MIDDLE_NAME    varchar(255),
    LAST_NAME      varchar(255),
    DATE_OF_BIRTH  date,
    ABOUT_ME       varchar(255),
    RATING         decimal(1,2),
    primary key (ID)
);

create table PLAYER_SKILL
(
    ID               varchar(255) not null,
    USERPROFILE_ID   varchar(255) not null,
    SKILL_ID         varchar(255) not null,
    EXPLANATIONS     varchar(255),
    RATING           smallint,
    primary key (id)
);

create table SKILL
(
    ID              varchar(255) not null,
    NAME            varchar(255),
    primary key (id)
);

create table MESSAGE
(
    ID                    varchar(255) not null,
    FROM_USERPROFILE_ID   varchar(255) not null,
    FOR_USERPROFILE_ID    varchar(255) not null,
    TEXT                  varchar(255),
    DATE_TIME             timestamp,
    primary key (id)
);
