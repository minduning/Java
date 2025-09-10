package Java_0908;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFirstFrame extends JFrame {
	/// 필드값
	String[] btnText = {"손흥민", "이강인", "배준호"};
	JButton[] btnArray = new JButton[btnText.length];		
	
	/// 생성자
	///
	public MyFirstFrame() {
		this.setSize(500, 300);
		this. setTitle("MyFirstFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 각각의 컴포넌트에 대한 배치 관리자가 없기 때문이다.
		this.setLayout(new FlowLayout());
		
		// 버튼 1개 생성. 붙이기
		JButton btn = new JButton();
		btn.setText("홍길동");
		btn.setToolTipText("조선시대 소설 주인공"); // 안내 말풍선 몇 초 떴다가 사라짐
		this.add(btn);
		
		JButton btn1 = new JButton();
		btn1.setText("이순신");
		this.add(btn1);
		
		for(int i = 0; i<btnArray.length; i++) {
			btnArray[i] = new JButton();
			btnArray[i].setText(btnText[i]);
			this.add(btnArray[i]);
		}
		
		this.setVisible(true);	
		// 그러면 고객에게 안보여주고 싶은 내용은 visible 뒤에 쓰면 될까? 
	}
			
			
	/// 멤버 함수
	/// 
			
	public static void main(String[] args) {
		
		MyFirstFrame mff = new MyFirstFrame(); // 생성자 호출
		
		
	}
}
