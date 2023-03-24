# Course_API

This API has 9 function, end point URL, JSON syntax and use case are as below
Only RegisterUser and Login works without logging in:-


[RegisterUser](https://course-api.up.railway.app/RegisterUser):- This is use to register a new user by providing name, email and
password. Where email must be always unique. It is a POST method.

Syntax-- {

               "name": "",
               "email": "",
               "password": ""
         }



[Login](https://course-api.up.railway.app/login):-This is use to login with the above credentials. It is a POST method. And
create JWT token.

Syntax-- {

               "email": "",
               "password": ""
         }
 
 
 
[Get All user](https://course-api.up.railway.app/GetAllUsers):-This is used to get the list of all user register so far. It is GET method.

No Syntax just fire the URL.



[Delete User by Id](https://course-api.up.railway.app/delUser/):- This delete the User by taking its unique ID.It is DEL method
Syntax-- In URL add ID at last “/ID”



[Add Course](https://course-api.up.railway.app/addCourse):- It will add the course for that particular User. It is POST method.

Syntax-- {

               "title": "",
               "description": ""
         }
 
 
 
[Get all course](https://course-api.up.railway.app/courses):- It will get all course that are associated to the user which is logged
in. It is GET method.

No Syntax just fire the URL.



[Get course by Id](https://course-api.up.railway.app/course_by_Id/):- It will get the one course with particular Id mapped with user
logged in. It is a GET method.

Syntax-- In URL add ID at last “/ID”



[Update course](https://course-api.up.railway.app/updateCourses):- It update already existing course for mapped with the User. Only
takes the Id of course that are already present for user. It is a PUT method.

Syntax-- {

            "id": ,
            "title": "",
            "description": ""
         }
 


[Delete course by Id](https://course-api.up.railway.app/delCourse/):-It delete the course by taking Id. Only those that are mapped to
that user. It is DEL method.

Syntax-- In URL add ID at last “/ID”



### If any of the link does not work that could be down for maintenance until then check the following content:- 



[Source Code](https://github.com/harshit2806/Course_API)

[Demo](https://www.youtube.com/watch?v=m3oCCkTtphY&ab_channel=HarshitSoni)
