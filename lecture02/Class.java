package lecture02;

public class Class {
	
	public static void main(String[] args) {
		String name1 = new String("Tony");
		String name2 = new String("Tony");
		String name3 = "java,programming,python,cpp";
		
		
		System.out.println(name1 == name2);
		
		//길이 
		int len = name1.length();
		//대체 
		String replaced = name1.replace("Tony", "python");
		//입력한 인덱스부터 텍스트 출력 
		String substring = name2.substring(2);
		//단어의 시작점 인덱스를 알려줌.
		int index = name2.indexOf("o");
		
		
		System.out.println(len);
		System.out.println(replaced);
		System.out.println(substring);
		System.out.println(index);
		
	boolean result = name1.contains("java");
	if (result) {
		System.out.println("Index is " + index);
	}
	else {
		System.out.println("there is no that string");
	}
	
	String[] arr = name3.split(",");
	for( int i = 0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	}
	
}