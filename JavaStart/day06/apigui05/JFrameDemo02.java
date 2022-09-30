package day06.apigui05;

import javax.swing.*;

/**
 * JFrameDemo02
 */
public class JFrameDemo02 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("显示文本和图像");
		jf.setSize(400, 300);
		jf.setDefaultCloseOperation(3);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);

		jf.setVisible(true);

		JLabel jlabel = new JLabel("这是文本");
		jlabel.setBounds(0, 0, 100, 20);
		jf.add(jlabel);

		ImageIcon image = new ImageIcon("mn.png");
		JLabel jlabel2 = new JLabel(image);
		jlabel2.setBounds(50, 50, 100, 143);
		jf.add(jlabel2);
	}
}
