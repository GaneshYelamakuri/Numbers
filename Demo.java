class DecTOBin{
	
	public void decTOBin(int n) {
		int res=0;
		int binary=0;
		int i=1;
		int num=n;
		while(num>0) {
			
			res=num%2;
	//		System.out.println(res+" res");
			binary+=i*res;
			num=num/2;
	//		System.out.println(num +" n");
			i=i*10;
			System.out.println(i);
						
		}
		System.out.println( n+ " binary " + binary);
		
	}
	
	
	public void binToDec(int n) {
		int res=0;
		int dec=0;
		int i=0;
		int num=n;
		while(num>0) 
		{
			
			
			
			if(num==0) break;
			else {
				res=num%10;
			dec+=res* (int)Math.pow(2, i);
			num=num/10;
			i=i+1;
			}	
		}
		System.out.println( n+ " decimal " + dec);
		
	}
	
}
class PerfectNum{
	
	public void perfectNum(int n) {
		int num=n;
		int sum=0;
//		int fact;
		for(int i=1;i<=n/2;i++) {
			
			if(n%i==0)//    
				sum=sum+i;
		}
		if(sum==num) System.out.println(num+" is perfect num");
		else System.out.println(num+" is not a perfect num");
		
	}
	
}
class Strongnum1{
	
	public int length(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
			
		}
		return count;
	}
	

	public void  Strong(int n) {
		
	int	num=n;
	int sum=0;
	int rem=0;
	int fact;
		
//		Strongnum1 s=new Strongnum1();
		
		while(n>0) {
			rem=n%10;
			System.out.println(rem);
			fact=1;
			for(int j=1;j<=rem;j++) {
				fact=fact*j;
				
			}
			sum=sum+fact;
			n=n/10;
				
		}
		if(sum==num) System.out.println(num +" is a strong num");
		else System.out.println(n+" is not a strong num");
		
		
		
		
	}
}
class ArmstrongNum1{
	
	public int length(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
			
		}
		return count;
	}
	
	
	public void Armstrong(int n) {
		
		ArmstrongNum1 a=new ArmstrongNum1();
	
		
		int sum=0 , rem=0,res=0;
		int num=n;
		int l=a.length(n);
		
		
		for(int i=1;i<=n;i++) {
			rem=num%10;
			res=res+(int)Math.pow(rem,3 );
			num/=10;
			
		}
		if(res==n)System.out.println(n+" is a Armstrong");
		else System.out.println(n+" not a armstrong");
		
		
	}
}
class HappyNum{
	
	public  void  happyNum(int n) {
		
		int r=0;
		int sum=0;
		
		while(n>9) {
		
		while(n>0 ) {     //13// 1 3
			r=n%10;      //3
			sum=sum+(r*r); //9  //
			n=n/10; //10
		}
		n=sum;
		sum=0;
		
		}
		
		
		if(n==1)System.out.println(n + "is a HappyNumber");
		else System.out.println(n + "not a happynum");
		
		
		
	}
		
	
}
class NeonNum{
	
	public void neonNum(int n){
		
		
		int pro=n*n;
		int sum=0;
		int rem=0;
		while(pro!=0) {
			
		rem=pro%10;
		sum=sum+rem;
		pro=pro/10;	
				
		}
		System.out.println(sum);
		if(sum==n)
		System.out.println(n + " is a Neon number");
		else System.out.println(n + " not a neon number");
	}
}



class PrimeNum{
	
	public void primeRange(int a,int b) {
		int n;
		boolean f=false;
		
		for(int j=a;j<=b;j++) {
			n=j;
			for(int i=2;i<=n/2;i++) {
				
				if(n%i==0) {
					f=true;
					}
			}
			if(f==false) {
				System.out.println(n);
			}else {
				f=false;
			}
		}
	}
	public void primeCheck(int n) {
		
		
		boolean f=false;
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				f=true;
				}
		}
		if(f==false) {
			System.out.println(n + " is a prime number");
			
		}else {
			System.out.println(n + " is not a prime Number");
		}
	}
}

public class Demo {

	public static void main(String[] args) {
		
		int n=1110;
		
		PrimeNum p=new PrimeNum();
		
	//	p.primeCheck(n);
		
	HappyNum h= new HappyNum();
	
//	h.happyNum(n);
	
	
		NeonNum neon=new NeonNum();
//		neon.neonNum(n);

		ArmstrongNum1 a=new ArmstrongNum1();
//		a.Armstrong(n);
		
		Strongnum1 s=new Strongnum1();
//		s.Strong(n);
		
		PerfectNum pf=new PerfectNum();
//		pf.perfectNum(n);
		
		DecTOBin db=new DecTOBin();
//		db.decTOBin(n);
		db.binToDec(n);
		
	}
}


