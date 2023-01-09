package DongboLuong;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataShared data = new DataShared();
		ThreadOne t1 = new ThreadOne(data);
		ThreadTwo t2 = new ThreadTwo(data);
		t1.start();
		t2.start();

	}

}
