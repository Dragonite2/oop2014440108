
public class Box {
	private Object data;
	
	public void setObject(Object data) //mutator
	{
		this.data = data;
	}
	
	public Object getObject() //accessor(getter)
	{
		return data;
	}
	//Java의 모든 Class를 반환하고 받을 수 있다는 뜻이지만...반환 시 신경써줘야 할 부분이 있다.
}
