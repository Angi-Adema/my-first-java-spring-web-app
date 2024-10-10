--We can create queries in here that will execute at startup. Define your own order by putting the items into the parenthesis below. MUST USE SINGLE QUOTES.
insert into todo (ID, USERNAME, DESCRIPTION, TARGET_DATE, DONE)
values(10001, 'in28minutes', 'Get AWS Certified', CURRENT_DATE(), false);

insert into todo (ID, USERNAME, DESCRIPTION, TARGET_DATE, DONE)
values(10002, 'in28minutes', 'Learn Spring and related tech', CURRENT_DATE(), false);

insert into todo (ID, USERNAME, DESCRIPTION, TARGET_DATE, DONE)
values(10003, 'in28minutes', 'Get Java job using Spring', CURRENT_DATE(), false);

insert into todo (ID, USERNAME, DESCRIPTION, TARGET_DATE, DONE)
values(10004, 'in28minutes', 'Build new projects using Java/Spring', CURRENT_DATE(), false);