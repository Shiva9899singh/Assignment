import java.util.*;
public class passfail
{
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		int s1 ,s2, s3;
		s1=in.nextInt();
		s2=in.nextInt();
		s3=in.nextInt();
		if(s1>60 && s2>60 && s3>60 )
		{
			System.out.println("Pass");
		}
		else if(s1>60 && s2>60 || s1>60 && s3>60 || s2>60 && s3>60)
		{
			System.out.println("Promoted");
			
		}
		else
		{
			System.out.println("Fail");
		}
				
	}
	
}