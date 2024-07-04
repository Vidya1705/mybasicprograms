package eclipsepackage;

public class Add_Sub_Mu_Div_Mod 
{

	int a;
    int b;

	static void add()
	{
     	int a=3;
        int b=4;
        int sum=a+b;
        System.out.println(sum);
	}

	static void sub()
	{
    	int a=5;
		int b=3;
		int subtraction=a-b;
		System.out.println(subtraction);
	}

	static void multiplication()
	{
		int a=4;
		int b=3;
		int mul=a*b;
		System.out.println(mul);
    }
       static void division()
    {
    	int a=14;
    	int b=2;
    	int div=a/b;
     	System.out.println(div);
   }
      static void modulou()
   {
     	int a=14;
       	int b=2;
        int mod=a%b;
        System.out.println(mod);
   }

public static void main(String[] args) 
{

		int a=5;
		int b=7;
		int sum=a+b;
		System.out.println(sum);

		int c=6;
        int d=5;
        int sub=c-d;
        System.out.println(sub);

		int e=2;
        int f=4;
        int mul=e*f;
        System.out.println(mul);

		int g=6;
        int h=2;
        int div=g/h;
        System.out.println(div);

		int i=15;
		int j=3;
        int mod=i%j;
        System.out.println(mod);

		add();
        sub();
        multiplication();
        division();
        modulou();

	}

		
    }


