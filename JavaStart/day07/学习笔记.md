# Day06
## String
- String 类表示字符串。Java 程序中所有字符串文字（例如"abc"）都实现为此类的实例
- 构造方法
	- String(): 初始化新创建的 String 对象，使其表示空字符序列
	- String(String original): 初始化新创建的 String 对象，使其表示与参数相同的字符序列
## 基本类型包装类
- 将基本数据类型封装成对象的好处就是可以通过对象调用方法操作数据
- 常用的操作之一：用于基本数据类型与字符串之间的转换

### Integer
- Integer 类在对象中包装基本类型 int 的值
- 构造方法
	- Integer(int value): 根据 int 值创建 Integer 对象
	- Integer(String s): 根据 String 值创建 Integer 对象
- 成员方法
	- static Integer valueOf(int i): 返回表示指定的 int 值的 Integer 实例
	- static Integer valueOf(String s): 返回一个保存指定值的 Integer 对象 String
### int 和 String 的相互转换
- int - String
	- static String valueOf(int i): 返回 int 参数的字符串表示形式。该方法是 String 类中的方法
- String - int
	- static int parseInt(String s): 将字符串解析为 int 类型。该方法是 Integer 类中的方法

### 自动装箱和拆箱
- 装箱：把基本数据类型转换为对应的包装类类型
- 拆箱：把包装类类型转换为对应的基本数据类型

## Date
- Date 类表示特定的时刻，精度为毫秒
- 构造方法
	- Date(): 分配 Date 对象并对其进行初始化，使其表示分配时间，测量 Date 到毫秒
	- Date(long date):分配 Date 对象并初始化它以表示自标准时间以来的指定毫秒数，即 1970 年 1 月 1 日 00:00:00

## SimpleDateFormat
- SimpleDateFormat 是一个用于以区域设置敏感的方式格式化和解析日期的具体类。重点学习日期格式化和解析
- 日期和时间格式由日期和时间模式字符串指定，在日期和时间模式字符串中，从'A'到'Z'以及从'a'到'z'的字母被解释为表示日期或时间字符串的组成部分的模式字母
- 常用的模式字母以及对应关系如下：

	| y | 年 |
	|---|----|
	| M | 月 |
	| d | 日 |
	| H | 时 |
	| m | 分 |
	| s | 秒 |

- 构造方法
	- SimpleDateFormat(): 构造一个 SimpleDateFormat,使用默认模式和日期格式
	- SimpleDateTimeFormat(String pattern):构造一个 SimpleDateFormat 使用给定的模式和默认的日期格式
- 格式化（从 Date 到 String）
	- String format(Date date):将日期格式化成日期/时间字符串
- 解析（从 String 到 Date）
	- Date parse(String source):从给定字符串的开始解析文本以生成日期
