import java.util.*;

public class TestMap 
{

	public static void main(String[] args) 
	{
		Map<String, String> map = new LinkedHashMap<String, String>();
		//HashMap : �ؽ� �Լ� ����
		//TreeMap : Ű�� ���ĺ� ����
		//LinkedHashMap : ������� ����
		//�߰� : .put(key, value)
		//�� Ž�� : .get(key)
		
		map.put("���̸�", "��"); //��� �߰�
		map.put("���α�", "��");
		map.put("��ī��", "����");
		map.put("�ƺ�ũ", "��");
		
		System.out.println(map.get("���̸�")); //key���� value�� ����.
		System.out.println(map.get("���α�"));
		System.out.println(map.get("��ī��"));
		System.out.println(map.get("�ƺ�ũ"));
		
		//Sweep
		//1. Iterator�� �̿��� Sweep
		Set<String> set = map.keySet(); //map.set() �޼ҵ� : map�� ����Ǿ� �ִ� entry(Ű, ��) �� key�� ���� ����. 
		//�캯�� ���� "keySet()"���� ���������� ���� key�� ���� ������ ���� �� �� �ִ�.
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println(String.format("Ű : %s, �� : %s", key,map.get(key)));
		}
		
		//2.for��
		for(String key2 : map.keySet())
			System.out.println(String.format("Ű : %s, �� : %s", key2, map.get(key2)));
		
		//3. Entry Set �����
		for(Map.Entry<String,String> elem : map.entrySet())
			System.out.println(String.format("Ű : %s, �� : %s", elem.getKey(), elem.getValue()));
		

		
	}

}
