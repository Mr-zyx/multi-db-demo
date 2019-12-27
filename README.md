# multi-db-demo
Springboot 2.x + JPA 实现mysql多数据源


*How to use it?*
--

首先我们需要修改resources文件夹下的application.properties中的数据库用户名以及密码，然后运行resources/mysql/init.sql文件。最后启动main方法即可。

API： 

GET localhost:11000/api/users

GET localhost:11000/api/books

这两个API无权限限制，可以直接调用/直接在浏览器URL输入也可得到结果


primary DB里 book为 “hamlet”，users为 “xiaoming”和“xiaohong”；

secondary DB里 book为 “Snow White“, users为 “DaHua”和“DaJun”
    
