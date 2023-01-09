package Lab5_1;

public class Test {
	public static void main(String[] args) {
		
		Person per = new Person("Nguyễn Văn A","Bắc Ninh");
		System.out.println(per.toString());
		
		Student stu = new Student("Nguyễn Văn B", "Hà Nội", "JAVA", 1, 100);
		System.out.println(stu.toString());
		Staff sta = new Staff("Nguyễn Văn C", "Thái Bình", "Python", 100);
		System.out.println(sta.toString());
		
		
	}

}
