/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2013/4/13 10:27:29                           */
/*==============================================================*/


drop table if exists AddressMapping;

drop table if exists Admins;

drop table if exists Applyment;

drop table if exists Fans;

drop table if exists OAuth;

drop table if exists Product;

drop table if exists Reply;

drop table if exists Users;

/*==============================================================*/
/* Table: AddressMapping                                        */
/*==============================================================*/
create table AddressMapping
(
   id                   varchar(32) not null,
   shortUrl             varchar(32),
   longUrl              varchar(512),
   primary key (id)
);

/*==============================================================*/
/* Table: Admins                                                */
/*==============================================================*/
create table Admins
(
   id                   varchar(32) not null,
   userName             varchar(32),
   password             varchar(32),
   status               int,
   primary key (id)
);

/*==============================================================*/
/* Table: Applyment                                             */
/*==============================================================*/
create table Applyment
(
   id                   varchar(32) not null,
   productUrl           varchar(512),
   applyStatus          int,
   imageUrl             varchar(256),
   productSection       int,
   productType          int,
   taobaoPrice          decimal(6,2),
   lowestPrice          decimal(6,2),
   tuanPrice            decimal(6,2),
   productInventory     int,
   expressType          int,
   saleCount            int,
   recommendReason      varchar(1024),
   productId            varchar(32),
   applyTime            datetime,
   mainWangwang         varchar(32),
   storeLevel           int,
   contactPhone         varchar(32),
   contactQQ            varchar(32),
   contactWangwang      varchar(32),
   contactName          varchar(32),
   userId               varchar(32),
   feedback             varchar(1024),
   schedulingTime       datetime,
   shopType             int,
   vipOnly              int,
   primary key (id)
);

/*==============================================================*/
/* Table: Fans                                                  */
/*==============================================================*/
create table Fans
(
   id                   varchar(32) not null,
   author               varchar(32),
   follower             varchar(32),
   primary key (id)
);

/*==============================================================*/
/* Table: OAuth                                                 */
/*==============================================================*/
create table OAuth
(
   id                   varchar(32) not null,
   userId               varchar(32),
   provider             tinyint,
   accessToken          varchar(50),
   refreshToken         varchar(50),
   expireTime           datetime,
   primary key (id)
);

/*==============================================================*/
/* Table: Product                                               */
/*==============================================================*/
create table Product
(
   id                   varchar(32) not null,
   productStatus        int,
   productName          varchar(512),
   originalPrice        decimal(6,2),
   currentPrice         decimal(6,2),
   saveMoney            decimal(6,2),
   discount             decimal(6,2),
   productSection       int,
   ImageUrl             varchar(512),
   productCategory      int,
   orderSequence        int,
   productUrl           varchar(512),
   createdTime          datetime,
   startTime            datetime,
   endTime              datetime,
   saleNumber           int,
   totalVisits          int,
   expressType          int,
   displayContent       varchar(2028),
   isVisible            int,
   shopType             int,
   vipOnly              int,
   isBargain            int,
   shortUuid            varchar(32),
   primary key (id)
);

/*==============================================================*/
/* Table: Reply                                                 */
/*==============================================================*/
create table Reply
(
   id                   varchar(32) not null,
   productId            varchar(32),
   replyTime            datetime,
   replyContent         varchar(512),
   speakerName          varchar(32),
   speakerId            varchar(32),
   primary key (id)
);

/*==============================================================*/
/* Table: Users                                                 */
/*==============================================================*/
create table Users
(
   id                   varchar(32) not null,
   userName             varchar(32),
   password             varchar(32),
   email                varchar(32),
   sex                  int,
   province             varchar(32),
   city                 varchar(32),
   selfIntroduction     varchar(512),
   credits              int,
   avatar               varchar(32),
   fansNum              int,
   followingNum         int,
   registerTime         datetime,
   primary key (id)
);

alter table Applyment add constraint FK_Reference_10 foreign key (productId)
      references Product (id) on delete restrict on update restrict;

alter table Applyment add constraint FK_Reference_9 foreign key (userId)
      references Users (id) on delete restrict on update restrict;

alter table Fans add constraint FK_Reference_7 foreign key (author)
      references Users (id) on delete restrict on update restrict;

alter table Fans add constraint FK_Reference_8 foreign key (follower)
      references Users (id) on delete restrict on update restrict;

alter table OAuth add constraint FK_Reference_4 foreign key (userId)
      references Users (id) on delete restrict on update restrict;

alter table Reply add constraint FK_Reference_1 foreign key (productId)
      references Product (id) on delete restrict on update restrict;

alter table Reply add constraint FK_Reference_3 foreign key (speakerId)
      references Users (id) on delete restrict on update restrict;

