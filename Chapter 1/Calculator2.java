import java.util.Scanner;
class Tools
{
    int num1, num2;
    public Tools(int m, int n)
    {
        num1 =m;
        num2 = n;
    }
    public int add(int num1, int num2)
    {
        return num1+num2;
    }
    public int sub(int num1, int num2)
    {
        return num1-num2;
    }
    public int multi(int num1, int num2)
    {
        return num1*num2;
    }
    public int divi(int num1, int num2)
    {
        return num1/num2;
    }
    public void show()
    {
        System.out.println("Sum of "+ this.num1 + " and " + this.num2 + " is " + this.add(num1, num2));
        System.out.println("Sub of "+ this.num1 + " and " + this.num2 + " is " + this.sub(num1, num2));
        System.out.println("Multi of "+ this.num1 + " and " + this.num2 + " is " + this.multi(num1,num2));
        System.out.println("Divi of "+ this.num1 + " and " + this.num2 + " is " + this.divi(num1, num2));
        
    }
}
public class Calculator2 {
    
    public static void main(String args[])
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        Tools t = new Tools(num1, num2);
        t.show();
        sc.close();
    }
    

}
