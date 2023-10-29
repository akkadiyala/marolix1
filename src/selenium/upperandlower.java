package selenium;

public class upperandlower {
public static void main(String[] args) {
	String name = "AnilkumarChowdarY@134";
	String UP ="";
	String LW="";
	for(int i=0;i<name.length();i++)
	{
		char ch = name.charAt(i);
		if(ch>=65 && ch<=90) {
			UP =UP+ch;
}
		else 
		{
			LW=LW+ch;
		}
		System.out.println(UP.length());
		System.out.println(LW.length());
}
}
}