/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2013/3/30 14:35:17                           */
/*==============================================================*/


drop table if exists Forum;

drop table if exists Reply;

drop table if exists SubForum;

drop table if exists Topic;

drop table if exists User;

/*==============================================================*/
/* Table: Forum                                                 */
/*==============================================================*/
create table Forum
(
   id                   int not null,
   name                 varchar(20),
   description          varchar(50),
   primary key (id)
);

/*==============================================================*/
/* Table: Reply                                                 */
/*==============================================================*/
create table Reply
(
   id                   varchar(32) not null,
   replyPoster          varchar(32),
   topic_id             varchar(32),
   replyTime            datetime,
   replyContent         text,
   reply_id             varchar(32),
   primary key (id)
);

/*==============================================================*/
/* Table: SubForum                                              */
/*==============================================================*/
create table SubForum
(
   id                   int not null,
   name                 varchar(20),
   description          varchar(50),
   forum_id             int,
   moderato             varchar(32),
   primary key (id)
);

/*==============================================================*/
/* Table: Topic                                                 */
/*==============================================================*/
create table Topic
(
   id                   varchar(32) not null,
   originalPoster       varchar(32),
   subforum_id          int,
   postTime             datetime,
   lastreplyTime        datetime,
   topicContent         text,
   primary key (id)
);

/*==============================================================*/
/* Table: User                                                  */
/*==============================================================*/
create table User
(
   id                   varchar(32) not null,
   userName             varchar(20),
   nickName             varchar(20),
   password             varchar(32),
   email                varchar(20),
   primary key (id)
);

alter table Reply add constraint FK_Reference_2 foreign key (topic_id)
      references Topic (id);

alter table Reply add constraint FK_Reference_3 foreign key (reply_id)
      references Reply (id);

alter table Reply add constraint FK_Reference_6 foreign key (replyPoster)
      references User (id);

alter table SubForum add constraint FK_Reference_4 foreign key (forum_id)
      references Forum (id);

alter table SubForum add constraint FK_Reference_7 foreign key (moderato)
      references User (id);

alter table Topic add constraint FK_Reference_1 foreign key (originalPoster)
      references User (id);

alter table Topic add constraint FK_Reference_5 foreign key (subforum_id)
      references SubForum (id);

