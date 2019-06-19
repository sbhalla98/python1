import java.util.Scanner;
import java.lang.*;
class cable{
enum channel{
	ZEE(63),
	SONY(81),
	STAR_PLUS(20),
	NICK(30),
	NO_OTHER(0);

	int rupees;
	channel(int rupees){
		this.rupees=rupees;
	}

	}

	public static void main(String[] args){
	
	int bill=0; 
	
	int[] customer_id=new int[]{1,2,3,4,5,6,7,8,9,10};
	//String[][] view=new String[customer_id][];
	
	System.out.println("ENTER YOUR ID");
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	int a=0;
	for(int c:customer_id){
		if(id!=c){ 
			a++;
			}
		}

	if(a==10){
					
	System.out.println("-----ERROR !!NOT A VALID ID!!----");
			}	

	for(int check:customer_id){



		if(id==check){
	

	System.out.println("!!!!!!MENU!!!!!!!!");
	for(channel m:channel.values()){
	System.out.println(m+" "+m.rupees);
	}
	System.out.println("which channel you want to subscribe???");
	channel m;
	do{
	Scanner s=new Scanner(System.in);
	m=channel.valueOf(s.nextLine());

		if(m==channel.ZEE){
			bill=bill+channel.ZEE.rupees;
			System.out.println("ANY OTHER???");
			}//break;
		else if(m==channel.SONY){
			bill=bill+(channel.SONY.rupees);
			System.out.println("ANY OTHER???");
			}//break;

		else if(m==channel.STAR_PLUS){
			bill=bill+(channel.STAR_PLUS.rupees);
			System.out.println("ANY OTHER???");
			}//break;
	
		else if(m==channel.NICK){
			bill=bill+(channel.NICK.rupees);
			System.out.println("ANY OTHER???");
			}

		else if(m==channel.NO_OTHER){
			System.out.println("YOUR BILL IS: "+bill);
			break;
			}

		else{
			System.out.println("!!!ENTER VALID OPTION!!!");
		}
		}while(m!=channel.NO_OTHER);
	}
		
		/*for(int check:customer_id){
		int a=0;
		if(id!=check){ a++;continue;}
		if(a==10)
		System.out.println("-----ERROR !!NOT A VALID ID!!----");}*/
	}
	


}
}