import java.util.Scanner;
class alphabet{
public static void main(String[]args){
Scanner tt=new Scanner(System.in);
char c;
System.out.println("enter value:");
c=tt.next().charAt(0);
if(c>='a'&&c<='z'||c>='A'&&c<='Z')
{
System.out.println("Alphabet");
}
else{
System.out.println("no");
}
}
}
