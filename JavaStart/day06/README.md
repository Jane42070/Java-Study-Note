# Day06 常用API 学习
## API
- Application Programming interface
- API是接口，对象，里面有行为，方法

## 包
- 其实就是文件夹
- 作用：对类进行分类管理
### 包的定义格式
- package 包名;
- 包名一般是公司域名反写，多级包用.分开
- www.itheima.com
### 导包
- 使用不同包下的类时，要写类的全路径，太麻烦
- 为了简化带包的操作，Java就提供了导包的功能
#### 导包的格式
- 格式：`import 包名;`
- 范例：`import com.itheima.Student;`

## Scanner
- 模块：java.base
- 软件包：java.util
### 构造方法
- Scanner(InputStream source)：创建Scanner对象
    - System.in：对应的是InputStream类型，可以表示键盘输入
    - `Scanner sc = new Scanner(System.in);`
### 成员方法 
- int nextInt()：获取一个int类型数据
    - `int i = sc.nextInt();`

## Random
- 该类的实例用来生成随机数
### 构造方法
- Random(): 创建一个新的随机数生成器
### 成员方法
- int nextInt(int bound): 获取一个int类型的随机数，参数bound表示获取到的随机数在[0,bound]之间

## GUI
- Graphical User Interface (图形用户接口)
- 用图形的方式，来显示计算机操作的界面
### java.awt 包
- Abstract Window Toolkit (抽象窗口工具包)，需要调用本地系统方法实现功能，属重量级控件
### javax.swing 包
- 在 awt 的基础上，建立一套图形界面系统，提供了更多的组件，而且完全由 java 实现。增强了移植性，属轻量级控件
- 组件：是具有图形表示的对象，该图形可以显示在屏幕上且可以与用户交互

#### JFrame
- 是一个顶层窗口
- 构造方法
	- JFrame(): 构造一个最初不可见的新窗体
- 成员方法
	- void setVisible(boolean b): 显示或隐藏此窗体具体取决于参数b的值
	- void setSize(int width,int height): 调整此组件的大小，使其宽度为width，高度为height，单位是像素

#### JButton
- 按钮的实现
- 构造方法
	- JButton(String text): 创建一个带文本的按钮
- 成员方法
	- void setSize(int width, int height): 设置大小
	- void setLocation(int x, int y): 设置位置（x 坐标，y 坐标）
	- void setBounds(int x, int y, int width, int height): 设置位置和大小
- 和窗体相关操作
	- 取消窗体默认布局：窗体对象.setLayout(null);
	- 把按钮添加到窗体：窗体对象.add(按钮对象);

#### JLabel
- 短文本字符串或图像的显示区域
- 构造方法
	- JLabel(String text): 使用指定的文本创建JLabel实例
	- JLabel(Icon image): 使用指定的图像创建JLabel实例
		- ImageIcon(String filename): 从指定的文件创建ImageIcon 
		- 文件路径：绝对路径和相对路径
- 成员方法
	- void setBounds(int x, int y, int width, int height): 设置位置和大小

#### 事件监听机制
- 事件源：事件发生的地方。可以是按钮，窗体，图片等
- 事件：发生了什么事情。例如：鼠标点击事件，键盘按下事件等
- 事件绑定：把事件绑定到事件源上，当发生了某个事件，则触发对应的处理逻辑
	- 事件源对象.addXXXListener(事件);
#### JOptionPane
- 引出对话框
- showMessageDialog(frame, "");
- static 静态的成员方法和成员变量，是可以通过类名直接访问的
