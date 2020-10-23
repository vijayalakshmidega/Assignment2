package labassignment2;
import java.util.Scanner;
public class Application {
	

		public static void main(String[] args) {
			
	Scanner sc=new Scanner(System.in);
	System.out.println("1. create a Vehicle object. ");
	System.out.println("2. create a Car object. ");
	System.out.println("3. create a Convertible object. ");
	System.out.println("4. create a Sport object. ");
	System.out.println("Enter the choice");
	int num=sc.nextInt();


	switch(num) {
	case 1:
		Vehicle v=new Vehicle(4, 2, 2016, "Tata");
		v.display();
		break;
	case 2:
		Car c=new Car(4, 3, 2020, "Indica",4);
		c.display();
		break;
	case 3:
		Convertible con=new Convertible(4, 2015, 4, "Etios",2 );
		con.display();
		break;
	case 4:
		SportCar sportc=new SportCar(4, 2018, 2, "Swift", 4, 2);
	    sportc.display();
	    break;
	 default:
		 break;
	}
		}

	}


