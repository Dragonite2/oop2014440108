
public class DeskLamp
{
	//필드 정의(UML 도표에 -라고 표시되어 있으니 private 형으로 변수 선언.)
	private boolean isOn;
	//보통 boolean 형태의 변수명은 is로 시작하여 뒷글자가 대문자로 시작함.
	
	//UML 도표에 나온 대로 메소드를 구현한다.
	//설정자를 통한 On 설정.
	public void turnOn()
	{
		this.isOn = true;
	}
	
	//설정자를 통한 Off 설정
	public void turnOff()
	{
		this.isOn = false;
	}
	
	//현재 상태 출력
	public String toString()
	{	
		if(isOn)
			return ("현재 상태는 켜져 있음.");
		else
			return ("현재 상태는 꺼져 있음.");
	}
	//객체를 출력하도록 (System.out.println(Obj)) 지시할 경우
	//위의 toString 메소드가 호출됨.
}
