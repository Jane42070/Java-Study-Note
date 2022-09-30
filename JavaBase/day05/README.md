# 继承
## 继承概述
- 继承：让类与类之间产生关系（子父类关系）,子类可以直接使用父类中非私有的成员
- 继承的格式
	- 格式：public class 子类名 extends 父类名{}
	- 范例：public class Zi extends Fu {}
	- Fu:父类，基类，超类
	- Zi:子类，派生类
## 继承的好处和弊端
- 好处
	- 提高了代码的复用性
	- 提高了代码的维护性
	- 让类与类之间产生了关系，是多态的前提
- 弊端
	- 是侵入性的
	- 降低了代码的灵活性
		- 导致了子类必须拥有父类非私有属性和方法，让子类自由的世界中多了些约束
	- 增强了代码的耦合性
		- 代码与代码之间存在关联都可以将其称之为“耦合”
- 什么时候使用继承？
	- 类与类之间，存在相同类容，并且产生了 is a 的关系，就可以考虑使用继承来优化代码
## 继承的特点
- Java 只支持单继承，不支持多继承，但支持多层继承
	- 子类只有一个父类
	- 多层继承：子类 A 继承父类 B,父类 B 继承父类 C
## 继承的成员变量访问特点
- 在子类中访问一个变量
	- 子类局部范围找
	- 子类成员范围找
	- 父类成员范围找
- 就近原则
- super 关键字的用法和 this 关键字用法相似
	- this: 代表本类对象的引用
	- super: 代表父类存储空间的标识（可以理解为父类对象引用）
## 继承中成员方法的访问特点
- 通过子类对象访问一个方法
	- 子类成员范围找
    - 父类成员范围找
## 方法重写
- 方法重写概述
	- 在继承体系中，子类出现了和父类中一摸一样的方法声明
- 方法重写的应用场景
	- 当子类需要父类的功能，而功能主体子类有自己特有的内容，可以重写父类中的方法，这样，沿袭了父类的功能，又定义了子类特有的功能
### 方法重写注意事项
- 父类中私有方法不能被重写
- 父类中静态方法，子类必须通过静态方法重写，父类中非静态方法，子类必须通过非静态方法重写
	- 注意：静态方法不能被重写，如果子类中存在一摸一样的方法声明，可以理解为，子类将父类中同名的方法，隐藏了起来
- 父类中私有方法不能被重写，静态方法不能被重写
- 子类重写父类方法时，访问权限必须大于等于父类
	- 权限修饰符

| 修饰符    | 同一个类中 | 同一个包中子类无关类 | 不同包中的子类 | 不同包的无关类 |
|-----------|------------|----------------------|----------------|----------------|
| private   | +          |                      |                |                |
| 默认      | +          | +                    |                |                |
| protected | +          | +                    | +              |                |
| public    | +          | +                    | +              | +              |

## 继承中构造方法的访问特点
- 子类中所有的构造方法默认都会访问父类中无参的构造方法
	- 为什么？
		- 因为子类在初始化的时候，有可能会使用到父类中的数据，如果父类没有完成初始化，子类将无法使用父类的数据
		- 子类初始化之前，一定要先完成父类的初始化
	- 怎么初始化？
		- 构造方法的第一条语句默认都是：super()
	- 注意：如果编写的类，没有手动指定父类，系统也会自动继承 Object（Java 继承体系的最顶层父类）
- 如果父类中只有带参构造方法，会出现什么现象呢？
	- 子类通过 super,手动调用父类的带参构造方法
	- 子类通过 this,调用本类构造方法，本类其他构造方法再通过 super 去手动调用父类的带参构造方法
	- 注意：this() super() 这种访问构造方法的第一行有效语句，并且二者不能共存

# 抽象
- 抽象方法：将共性的行为（方法）抽取到父类后，发现该方法的实现逻辑无法在父类中给出具体明确，该方法就可以定义为抽象方法
- 抽象类：如果一个类中存在抽象方法，那么该类就必须声明为抽象类
- 抽象方法定义格式：
	- public abstract 返回值类型 方法名（参数列表）;
- 抽象类的定义格式：
	- public abstract class 类名{}
## 抽象类注意事项
- 抽象类不能实例化
- 抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
- 可以有构造方法
- 抽象类的子类
	- 要么重写抽象类中的所有抽象方法
	- 要么是抽象类
## 模版设计模式
- 设计模式是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验总结。
	- 使用设计模式是为了可重用代码、让代码更容易被他人理解、保证代码可靠性、程序的重用性
- 模板设计模式：把抽象类整体可以看做成一个模版，模版中不能决定东西定义成抽象方法
	- 让使用模板的类（继承抽象类的类）去重写抽象方法实现需求
- 小结：模板设计模式的优势，模板已经定义了通用结构，使用者只需要关心自己需要实现的功能即可
# final 关键字
- final 关键字是最终的意思，可以修饰（方法，变量，类）
- final 修饰的特点
	- 修饰方法：表明该方法是最终方法，不能被重写
	- 修饰变量：表明该变量是常量，不能再次被赋值
	- 修饰类：表明该类是最终类，不能被继承
- 变量是基本类型：final 修饰是指基本类型的数据值不能发生改变
- 变量是引用类型：final 修饰是指饮用类型的地址值不能发生改变，但是里面的内容是可以发生改变的
# 黑马信息管理系统改进
- 使用抽象类的方法，将 BaseStudentController 中的 inputStudentInfo 方法，定义为抽象方法
- 不希望子类重写的方法，使用 final 进行修饰
# 代码块
## 代码块概述与分类
- 在Java中,使用{}括起来的代码被称为代码块
- 分类:
	- 局部代码块
	- 构造代码块
	- 静态代码块