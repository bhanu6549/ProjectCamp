import java.util.Scanner;
public class Ecercise2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strig");
		String str=sc.nextLine();
		System.out.println("choose the option");
		System.out.println("1.Alternate of upper/lower");
		System.out.println("2.remove o if its oocur twice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			String str1=alternate(str);
			System.out.println(str1);
			break;
		case 2:
			String str2=remove(str);
			break;

		}



	}

	private static String remove(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String alternate(String str) {
		String str3=" ";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int k=0;
			

			if(ch>='A'&&ch<='Z')
			{
				for(int j=0;j<str.length();j=j++)
				{
					char ch1=str.charAt(j);
					if(ch1>='A'&&ch1<='Z') {
					ch=str.charAt(j);
					ch=(char) (ch+32);
					str3=str3+ch;
					k++;
					}

				}
			}
			if(ch>='a'&&ch<='z')
			{
				for(int j=k;j<str.length();j=j++)
				{
					char ch2=str.charAt(j);
					if(ch2>='a'&&ch2<='z') {
					ch=str.charAt(j);
					ch=(char) (ch-32);
					str3=str3+ch;
					}
				}

			}
		}

		return str3;
	}

}
