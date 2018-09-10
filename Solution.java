import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		for(int i=Math.min(x,z);i<=Math.max(x,z);i++)
		    System.out.print(i+" ");
		
		for(int i=y;i>=Math.max(x,z);i--)
		    System.out.print(i+" ");

	}
}
