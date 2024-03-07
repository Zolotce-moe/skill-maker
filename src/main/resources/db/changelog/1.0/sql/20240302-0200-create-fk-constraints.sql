alter table USERPROFILE add constraint FK_USERPROFILE__USER foreign key (USER_ID) references _USER(ID);

alter table PLAYER_SKILL add constraint FK_PLAYER_SKILL__USERPROFILE foreign key (USERPROFILE_ID) references USERPROFILE(ID);
alter table PLAYER_SKILL add constraint FK_PLAYER_SKILL__SKILL foreign key (SKILL_ID) references SKILL(ID);

alter table MESSAGE add constraint FK_MESSAGE__USERPROFILE__1 foreign key (FROM_USERPROFILE_ID) references USERPROFILE(ID);
alter table MESSAGE add constraint FK_MESSAGE__USERPROFILE__2 foreign key (FOR_USERPROFILE_ID) references USERPROFILE(ID);
