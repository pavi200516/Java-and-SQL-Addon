import java.util.Scanner;
class main {
    	public static void main(String[] args) {
    	    Scanner s=new Scanner(System.in);
    	    System.out.print("Enter the sentence:");Add commentMore actions
			String a=s.nextLine();
			String[] b=a.split(" ");
			for(int i=0;i<b.length;i++){
			    System.out.println(b[i]);
			}
		}
	
