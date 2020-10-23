package labassignment2;

class Student {
	

	
		String name;
		String id;
		double grade;

		
		public Student(String name, String id, double grade) {
			this.name = name;
			this.id = id;
			this.grade = grade;
		}
		public Student(String name,String id) {
			this.name=name;
			this.id=id;
			
		}
		public Student(String name) {
			this.name=name;
		}
		public void display() {
			System.out.println("Name is "+name+"Id is "+id+"Grade is "+grade);
		}
		public void display(int year) {
			System.out.println("Name is "+name+"Id is "+id+"Grade is "+grade);
		}

	}


