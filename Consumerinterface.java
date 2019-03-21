package Consumer_Lambda.Consumer;

import java.util.List;

public class Consumerinterface {

	static void printList(List<Student> list) {
		list.stream().forEach(a->System.out.println(a.getName())); 
	//return list.toString();
		
	}
}
