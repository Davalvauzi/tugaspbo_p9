package pertemuan9;

public class ReturnIntExample {

	public int CompareNum()
	{
		int x = 3;
		int y = 6;
		System.out.println("x = " + x + "\ny = " + y);
		if(x>y)
			return x;
		else 
			return y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnIntExample obj = new ReturnIntExample();
		int result = obj.CompareNum();
		System.out.println("The greate number among x and y is: " + result);
	}

}
