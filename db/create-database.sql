drop database if exists Baemtli;
create database Baemtli;
use Baemtli;

create table team (
  ID_Team int primary key auto_increment,
  Name varchar(30)
);

create table trainee (
    ID_Trainee int primary key auto_increment,
    FirstName varchar(30) not null,
    LastName varchar(30) not null,
    Team_ID int not null,
    foreign key (Team_ID) references team(ID_Team)
        on update no action on delete cascade
);

create table login (
                       ID_Login int primary key auto_increment,
                       Username varchar(50) unique not null,
                       PasswordHash varchar(255),
                       Role ENUM('Coach', 'Teamresponsible', 'Teammember') not null,
                       AuthSource varchar(10) not null DEFAULT 'LOCAL',
                       Team_ID int,
                       foreign key (Team_ID) references team(ID_Team)
                           on update no action on delete cascade
);

create table chorecategory (
    ID_Chorecategory int primary key auto_increment,
    Name varchar(30) not null,
    Description longtext
);

create table month (
    ID_Month int primary key auto_increment,
    Month int not null,
    Year YEAR not null,
    CHECK ( Month between 1 and 12)
);

create table monthassignment (
    ID_Monthassignment int primary key auto_increment,
    Team_ID int not null,
    Chorecategory_ID int not null,
    Month_ID int not null,
    foreign key (Team_ID) references team(ID_Team)
        on update no action on delete cascade,
    foreign key (Chorecategory_ID) references chorecategory(ID_Chorecategory)
        on update no action on delete cascade,
    foreign key (Month_ID) references month(ID_Month)
        on update no action on delete cascade
);

create table workday (
    ID_Workday date primary key not null
);

create table choreassignment (
    ID_Choreassignment int primary key auto_increment,
    Workday_ID date not null,
    Monthassignment_ID int not null,
    Trainee_ID int,
    foreign key (Workday_ID) references workday(ID_Workday)
        on update no action on delete cascade,
    foreign key (Monthassignment_ID) references monthassignment(ID_Monthassignment)
        on update no action on delete cascade,
    foreign key (Trainee_ID) references trainee(ID_Trainee)
        on update no action on delete cascade
);