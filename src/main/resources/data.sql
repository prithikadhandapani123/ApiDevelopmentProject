--for the password using online bcrypt encoder, encode your password 
--and then use it here prefixed with {bcrypt}

INSERT INTO USER (user_id,user_name,password,role,firstname, middlename, lastname,email) VALUES (
   1, 'Sam','{bcrypt}$2y$12$946HuJr2jwqLLe5wqwJBJeupc.TS/3MdUFXDnqGpbVh8VfW5T6dZW','admin','sam','karan','samkaran','sam@1');

INSERT INTO USER (user_id,user_name,password,role,firstname, middlename, lastname,email) VALUES (
   2, 'Gaby','{bcrypt}$2y$12$R3m9wqwHTyKbhqGYoXgBMuDvNTqxs7aTJnE4XQwdo1LC9h375O5AS','user','gaby','gabrilla','gabygaby','gaby@1'); 
   
INSERT INTO USER (user_id,user_name,password,role,firstname, middlename, lastname,email) VALUES (
   3, 'Tim','{bcrypt}$2y$12$R3m9wqwHTyKbhqGYoXgBMuDvNTqxs7aTJnE4XQwdo1LC9h375O5AS','user','tim','tam','timtam','tim@1'); 
   
INSERT INTO USER (user_id,user_name,password,role,firstname, middlename, lastname,email) VALUES (
   4, 'Jim','{bcrypt}$2y$12$946HuJr2jwqLLe5wqwJBJeupc.TS/3MdUFXDnqGpbVh8VfW5T6dZW','admin','jim','jam','jimjam','jim@1');

INSERT INTO USER (user_id,user_name,password,role,firstname, middlename, lastname,email) VALUES (
   5, 'Bob','{bcrypt}$2y$12$R3m9wqwHTyKbhqGYoXgBMuDvNTqxs7aTJnE4XQwdo1LC9h375O5AS','manager','bob','morley','bobmorley','bob@1'); 
   
INSERT INTO USER (user_id,user_name,password,role,firstname, middlename, lastname,email) VALUES (
   6, 'Pam','{bcrypt}$2y$12$R3m9wqwHTyKbhqGYoXgBMuDvNTqxs7aTJnE4XQwdo1LC9h375O5AS','user','pam','ping','pimpom','pim@1'); 
   


 ---This is for CAR details 
   
INSERT INTO Resource (car_id,car_name,price,brand, owner,description,active) VALUES (1, 'Veloster',18600 , 'Hyundai','Sam','this is latest model','true');
INSERT INTO Resource (car_id,car_name,price,brand, owner,description,active) VALUES (5, 'Palisade',32525 , 'Hyundai','Gaby','this is old model','false');
INSERT INTO Resource (car_id,car_name,price,brand, owner,description,active) VALUES (2, 'price X', 79990, 'Tesla','Sam','this is latest model','true');
INSERT INTO Resource (car_id,car_name,price,brand, owner,description,active) VALUES (3, 'Camry',24970 , 'Toyota','Gaby','this is latest model','true');
INSERT INTO Resource (car_id,car_name,price,brand, owner,description,active) VALUES (4, 'Navigator',76185, 'Lincoln','Sam','this is latest model','true');
INSERT INTO Resource (car_id,car_name,price,brand, owner,description,active) VALUES (6,  'A Class',45850, 'Mercedes-Benz','Gaby','this is latest model','true');


----This is for Role details
INSERT INTO Roles (Roleid,Rolename,description,active) VALUES (1, 'ADMIN','Admin is main role in organization','true');
INSERT INTO Roles (Roleid,Rolename,description,active) VALUES (2, 'MANAGER','Manager is second main role in organization','true');
INSERT INTO Roles (Roleid,Rolename,description,active) VALUES (3, 'USER','User is employee in organization','true');
   ------This is for Permissiondetails
INSERT INTO Permission (permissionid,permissionname,description,active) VALUES (1, 'ADMIN','Admin is having permission for post,put,get','true');
INSERT INTO Permission (permissionid,permissionname,description,active) VALUES (2, 'MANAGER','Manager is having permission for post,put,get,delete','true');
INSERT INTO Permission (permissionid,permissionname,description,active) VALUES (3, 'USER','User is having permission for get all resource data and see own id not permit to see other details and post,put,delete','true');

   