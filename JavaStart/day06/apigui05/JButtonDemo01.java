package day06.apigui05;

import javax.swing.*;

/**
 * 构造方法
 * JButton(String Text): 创建一个带文本的按钮
 *
 * 成员方法
 * void setSize(int width, int height): 设置大小
 * void setLocation(int x, int y): 设置位置（x 坐标，y 坐标）
 *
 * @author qilin
 */

public class JButtonDemo01 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();

		jf.setTitle("福瑞婷");
		jf.setVisible(true);
		jf.setSize(800, 600);
		jf.setLocationRelativeTo(null);
		jf.setAlwaysOnTop(true);
		jf.setDefaultCloseOperation(3);
		// 取消窗体的默认布局
		jf.setLayout(null);

		// JButton(String Text): 创建一个带文本的按钮
		JButton btn = new JButton("福瑞婷");
		// void setSize(int width, int height): 设置大小
		btn.setSize(100, 20);

		// 设置按键位置
		btn.setLocation(100, 100);

		// 设置位置和宽高
		// setSize + setLocation
		btn.setBounds(100, 100, 100, 20);

		// 再加上一个按钮
		JButton btn1 = new JButton("我是按钮二");
		btn1.setBounds(100, 120, 100, 20);

		// 添加按钮到JFrame上
		// 容器组件可以通过add方法把其他组件添加到容器中
		jf.add(btn);
		jf.add(btn1);
	}
}
