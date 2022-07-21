package day07.GuiCase02;

import javax.swing.*;
import java.text.*;
import java.util.Date;

/**
 * ShowDateTime04
 * 
 * @author qilin
 */
public class ShowDateTime04 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setLayout(null);
		frame.setSize(400, 300);
		frame.setTitle("手机日期和时间");
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(3);

		JLabel label1 = new JLabel();
		label1.setText("日期");
		label1.setBounds(50, 50, 100, 20);

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		String dataString = sdf.format(d);

		JLabel label2 = new JLabel();
		label2.setText(dataString);
		label2.setBounds(50, 80, 200, 20);

		JLabel label3 = new JLabel();
		label3.setText("时间");
		label3.setBounds(50, 150, 100, 20);

		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
		String timeString = sdf1.format(d);

		JLabel label4 = new JLabel();
		label4.setText(timeString);
		label4.setBounds(50, 180, 200, 20);

		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);

		frame.setVisible(true);
	}
}
