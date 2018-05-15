import java.awt.event.*;

import javax.swing.*;
//java.awt.event는 패키지 이름, ActionEvent와 ActionListener는 클래스 이름
//첫 번째 이벤트 리스너 구현 방법

public class MyListener implements ActionListener 
{
	//이 인터페이스는 아래의 메소드 하나만 정의되어 있음.
	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton button = (JButton) e.getSource();
		//액션 이벤트 객체에서 눌러진 버튼 객체를 (버튼 객체의 레퍼런스 값) 가져온다.
		button.setText("버튼이 눌러졌어요.");
		System.out.println("OMG 버튼이 눌러졌어요!!!");
	}

}
