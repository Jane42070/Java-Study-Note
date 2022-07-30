package day06.apigui05;

import java.sql.Date;

import javax.swing.*;

/**
 * AttendanceQuery04
 * 需求：做出考勤界面
 * 分析：
 * 1. 3 个 Label
 * 2. 2 个 TextField
 * 3. 1 个 JButton
 *
 * @author qilin
 */
public class AttendanceQuery04 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setTitle("考勤查询");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		frame.setLayout(null);

		JLabel Date = new JLabel("考勤日期");
		Date.setBounds(50, 20, 100, 20);

		JLabel StartTime = new JLabel("开始日期");
		StartTime.setBounds(50, 70, 100, 20);

		JLabel EndTime = new JLabel("结束时间");
		EndTime.setBounds(250, 70, 100, 20);

		JButton btn = new JButton("确定");
		btn.setBounds(250, 180, 60, 20);

		JTextField StartTimeField = new JTextField();
		StartTimeField.setBounds(50, 100, 100, 20);

		JTextField EndTimeField = new JTextField();
		EndTimeField.setBounds(250, 100, 100, 20);

		frame.add(Date);
		frame.add(StartTime);
		frame.add(EndTime);
		frame.add(btn);
		frame.add(StartTimeField);
		frame.add(EndTimeField);
		frame.setVisible(true);
	}
}
