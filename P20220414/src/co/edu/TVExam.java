package co.edu;

public class TVExam {
    public static void main(String[] args) {
		int num = 10;
		String str = "Hello";
		
		Television tv = new Television(); //
		tv.company = "삼성";
		tv.color = "검은색";
		tv.price = 300000;
		tv.model = "30Inch";
		tv.turnOn();
		tv.changeChanel(10);
		tv.turnOff();
		
		
		Television tv1 = new Television(); //
		tv1.company = "삼성";
		tv1.color = "검은색";
		tv1.price = 300000;
		tv1.model = "30Inch";								
		
		System.out.println(tv == tv1);
		System.out.println(tv);
		System.out.println(tv1);
		
		Student stud1 = new Student();
		stud1.name = "홍길동";
		stud1.studentNo = "22-1234567";
		stud1.age = 20;
		stud1.height = 174.5;
		
		Student stud2 = new Student();
		stud2.name = "송도언";
		stud2.studentNo = "22-987654";
		stud2.age = 28;
		stud2.height = 170.2;
		
		Student stud3 = new Student("박길동","22-741852");
		stud3.age = 26;
		stud3.height = 163.5;
		
		Student stud4 = new Student();	
		stud4.height = 174.5;
		
		
		stud1.study();
		stud2.study();
		
		stud4.showInfo();
						
	}
}
