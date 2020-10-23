package labassignment2;
import java.util.Scanner;
public class Applications {
	//import java.util.Scanner;

	//public class Application {
		public static void main(String []args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=scanner.nextInt();
			
			switch(num) {
			case 1:
				Student s=new Student("vijji","208",8.3);
				Student s1=new Student("Pavan","217",8);
				s.display();
				s1.display(2020);
				break;
			case 2:
				Student student=new Student("Ammu","220");
				Student student1=new Student("kumari","209");
				student.display();
				student1.display(2020);
				break;	
			case 3:
				Student stu=new Student("Bhargavi");
				Student stu1=new Student("Prasanna");
				stu.display();
				stu1.display(2020);
				break;
			default:
				break;
			}
			
		}

	}


