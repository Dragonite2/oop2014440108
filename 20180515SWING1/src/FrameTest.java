import javax.swing.JFrame;
//javax.swing이라는 패키지에서 JFrame이라는 클래스를 포함시켰다.

public class FrameTest 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("LYJ frame");
		frame.setSize(900,500); //가로 길이, 세로 길이(픽셀 단위)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기 버튼을 누르면 창이 종료되게 유도함.
		//JFrame은 클래스 이름이고, EXIT_ON_CLOSE는 정적(static) 필드.
		//정적 메소드는 이름 뒤에 () 괄호가 붙어야 함...
		//EXIT_ON_CLOSE : 상수라는 뜻(constant)
		frame.setVisible(true); //창을 보이게 함.
	}
}
