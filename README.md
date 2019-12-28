# multi-db-demo
Springboot 2.x + JPA 实现mysql多数据源

***
*How to use it?*
--

首先我们需要修改resources文件夹下的application.properties中的数据库用户名以及密码，然后运行resources/mysql/init.sql文件。最后启动main方法即可。

API： 

GET localhost:11000/api/users/primary

GET localhost:11000/api/users/secondary

GET localhost:11000/api/books

这两个API无权限限制，可以直接调用/直接在浏览器URL输入也可得到结果


primary DB里 book为 “hamlet”，users为 “xiaoming”和“xiaohong”；

secondary DB里 book为 “Snow White“, users为 “DaHua”和“DaJun”

***
🏷️如果你使用的是develop分支，你将会看到最简化的多数据源配置,原user API改为GET localhost:11000/api/users；如果你查看的为master分支，将会看到更偏向实际应用的复杂情况：加入了一个新的元素“School”，同时加入了GET localhost:11000/api/schools API

首先看一下我们的层级，发现models以如下规则分布：

>|- model<br/>
>&nbsp;&nbsp;&nbsp;&nbsp;|- primary<br/>
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|- Book.java<br/>
>&nbsp;&nbsp;&nbsp;&nbsp;|- secondary<br/>
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|- User.java<br/>
>&nbsp;&nbsp;&nbsp;&nbsp;|- School.java<br/>

repository接口类也以同样的方式分布。

这个时候我仍然想将User.java以第二个数据源的方式读出，我们需要在第一个数据源配置中使用ant风格的路径配置，然后在第二个源的配置中把User单独配置出来（可以看作是更精确的路径覆盖不精确的路径）。

⚠️要注意的是，我们需要在application.properties配置中加入`spring.main.allow-bean-definition-overriding=true`使其允许重写覆盖
