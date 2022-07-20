package day06.apigui05;

import javax.swing.*;

/**
 * 构造方法
 * JFrame() 构造一个不可见的窗体
 * 成员方法
 * void setVisible(boolean b): 显示或隐藏此窗体具体取决于参数b的值
 * void setSize(int width, int height): 调整此组件的大小，是其宽度为width，高度为height，单位是像素
 * void setDefaultCloseOperation(int operation): 设置窗体关闭时默认操作（整数3表示：窗口关闭时退出应用程序）
 * void setAlwaysOnTop(boolean alwaysOnTop): 设置窗体始终位于其他窗口之上
 * void setTitle(String title): 设置窗体标题
 * void setLocationRelativeTo(Component c): 设置位置，值为null，则窗体位于屏幕中央
 *
 * @author qilin
 */

public class JFrameDemo01 {
	public static void main(String[] args) {
		// 构造一个最初不可见的窗体
		JFrame jf = new JFrame();

		// 设置标题
		jf.setTitle("百度一下，你就知道");
		// 设置窗体可见
		jf.setVisible(true);
		// 设置窗体大小
		jf.setSize(800, 600);
		// void setDefaultCloseOperation(int operation): 设置窗体关闭时默认操作（整数3表示：窗口关闭时退出应用程序）
		jf.setDefaultCloseOperation(3);
		jf.setAlwaysOnTop(true);
		jf.setLocationRelativeTo(null);
	}
}
