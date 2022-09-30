# MyBatis

- 持久层框架，简化 JDBC 开发

## 持久层

- 负责将数据保存到数据库的那一层代码
- JavaEE 三层结构：表现层、业务层、持久层

## 框架

- 框架就是一个半成品软件，是一套可重用的、通用的软件基础代码模型
- 在框架的基础上构建软件编写更加高效、规范、通用、可拓展

## JDBC 缺点

- 硬编码
	- 注册驱动，获取连接
	- SQL 语句
- 操作繁琐
	- 手动设置参数
	- 手动封装结果集

## 配置文件完成增删改查

- 查询
	- 查询所有数据
	- 查看详情
	- 条件查询
		- 多条件查询
			- 编写 Map 接口
			- 参数 查询条件
			- 结果 List<Brand>
			- 编写 SQL 语句：SQL 映射条件
			- 执行方法、测试
- 添加
	- MyBatis 事务
		- sqlSession()：默认开启事务，进行增删改操作后需要使用 sqlSession.commit()，手动提交事务
		- openSession(true)：可以设置为自动提交事务
	- 主键返回
		- 数据添加成功后，需要获取到插入数据库的主键的值
		- 比如：添加订单和订单项
			- 添加订单
			- 添加订单中需要设置所属订单的id
		- 可是默认添加数据后在对象中属性没有值
		- 解决：在 insert 标签中设置 useGeneratedKeys, keyProperty 属性值设置为 id

```xml

<insert id="add" useGeneratedKeys="true" keyProperty="id">
```

- 修改
	- 修改全部字段
		- 编写接口方法：Mapper接口
		- 参数：所有数据
		- 结果：void
		- 编写 SQL 语句：SQL 映射文件
		- 执行方法，测试
	- 修改动态字段
	- 使用 MyBatis 的 set 标签解决 if 标签的语法问题
- 删除
	- 删除一个
		- 编写 Mapper 接口方法
		- 参数 id
		- 返回类型 void
		- 编写 SQL 语句：SQL 映射文件
		- 执行方法，测试
	- 批量删除
		- 编写 Mapper 接口方法
		- 参数：ids
		- 结果：void
		- 编写 SQL 语句：SQL 映射
		- 执行方法，测试

## MyBatis 动态 SQL

* 多条件动态条件查询
* 用户填写对应查询条件时不会每一个都填写，SQL 语句要根据用户输入的条件不同产生变化，就是动态SQL
* if 和 where
* if 条件判断
	* test：逻辑表达式
* 问题
	* 第一个条件不存在，后面会因为 and 连接语法错误
	* 解决
		* 用恒等式过渡：where 后加入 1=1 恒等式 后面跟 and
		* where 标签替换 where 关键字：自动删减 and 语法

- 单条件动态条件查询
	- 从多个条件中选择一个
	- choose(when, otherwise)：选择，类似于Java中的switch语句
	- 防止用户一个都不选，加上 otherwise，where 1+1 恒等式
	- 或者加入 where 动态标签，就不用加 otherwise

## MyBatis 参数传递

- MyBatis 接口方法中可以接收各种各样的参数，MyBatis 底层对于这些参数进行不同的封装处理方式
- MyBatis 提供了 ParamNameResolver 类来进行封装
- 单个参数：
	- POJO 类型：直接使用，保证参数占位符和属性名一致
	- Map 集合：直接使用，键名和参数占位符一致
	- Collection：封装为Map集合
		- map.put("arg0", collection集合);
		- map.put("collection", collection集合);
	- List 封装为Map集合
		- map.put("arg0", collection集合);
		- map.put("collection", collection集合);
		- map.put("list", list集合);
	- Array：封装为Map集合
		- map.put("arg0", 数组);
		- map.put("array", 数组);
	- 其他类型：直接使用
- 多个参数：
	- map.put("arg0", 参数值1)
	- map.put("arg1", 参数值2)
	- map.put("param1", 参数值1)
	- map.put("param2", 参数值2)
	- @Param("username")
	- map.put("username", 参数值1)
	- map.put("arg1", 参数值2)
	- map.put("param1", 参数值1)
	- map.put("param2", 参数值2)

## MyBatis 注解开发

- @Select("select * from tb_brand where id = #{id}")
- 注解进行简单开发
- 配置文件进行复杂开发