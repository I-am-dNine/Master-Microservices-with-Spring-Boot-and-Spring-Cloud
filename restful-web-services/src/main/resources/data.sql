insert into user_details(id, birth_date, name)
values(10001, current_date(), 'D9');

insert into user_details(id, birth_date, name)
values(10002, current_date(), 'D1');

insert into user_details(id, birth_date, name)
values(10003, current_date(), 'D2');

insert into post(id, description, user_id)
values(20001, 'I am D9-1', 10001);

insert into post(id, description, user_id)
values(20002, 'I am D9-2', 10001);

insert into post(id, description, user_id)
values(20003, 'I am D2-1', 10003);

insert into post(id, description, user_id)
values(20004, 'I am D1-1', 10002);