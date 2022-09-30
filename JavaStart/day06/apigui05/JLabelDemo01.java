package day06.apigui05;

import javax.swing.*;

/**
 * JLabelDemo01
 * 构造方法
 * JLabel(String text): 使用指定的文本创建 JLabel 实例
 * JLabel(Icon image): 使用指定的图像创建 JLabel 实例
 * ImageIcon(String filename): 从指定的文件创建 ImageIcon
 *
 * 成员方法
 * void setBounds(int x, int y, int width, int height): 设置位置和大小
 * 
 * @author qilin
 */
public class JLabelDemo01 {
	public static void main(String[] args) {
		// 创建窗体对象
		JFrame frame = new JFrame();

		frame.setTitle("显示文本和图像");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		frame.setLayout(null);

		// JLabel(String text): 使用指定文本创建对象
		JLabel jlabel = new JLabel("你好再见");
		jlabel.setBounds(0, 0, 100, 20);

		// ImageIcon(String filename): 从指定的图像创建 JLabel 实例
		JLabel jlabel2 = new JLabel(new ImageIcon("/Users/qilin/Github/Java-Study-Note/day06/images/mn.png"));
		jlabel2.setBounds(50, 50, 100, 143);

		frame.add(jlabel);
		frame.add(jlabel2);

		frame.setVisible(true);
	}
}
