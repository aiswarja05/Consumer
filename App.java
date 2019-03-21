package Consumer_Lambda.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;



public class App 
{
    public static void main( String[] args )
    {
    	Student s1=new Student("Aiswarja",2,"CSE");
    	Student s2=new Student("Joye",5,"ECE");
    	Student s3=new Student("Ana",4,"CS");
    	Student s4=new Student("Saha",3,"EEE");
    	Student s5=new Student("Rini",8,"ECO");
    	Student s6=new Student("Anika",10,"BBA");
    	
    	
    	List<Student> L=Arrays.asList(s1,s2,s3,s4,s5,s6);
    	
    	Consumer<List<Student> > cm =Consumerinterface::printList; 
    	
    	cm.accept(L);
    	//System.out.println(cm);
    }
}
