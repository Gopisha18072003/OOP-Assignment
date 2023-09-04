class Tools
{
    int num1 = 20, num2 = 5;
    public int add()
    {
        return num1+num2;
    }
    public int sub()
    {
        return num1-num2;
    }
    public int multi()
    {
        return num1*num2;
    }
    public int divi()
    {
        return num1/num2;
    }
    public void show()
    {
        System.out.println("Sum of "+ this.num1 + " and " + this.num2 + " is " + this.add());
        System.out.println("Sub of "+ this.num1 + " and " + this.num2 + " is " + this.sub());
        System.out.println("Multi of "+ this.num1 + " and " + this.num2 + " is " + this.multi());
        System.out.println("Divi of "+ this.num1 + " and " + this.num2 + " is " + this.divi());
        
    }
}
public class Claculator {
    
    public static void main(String args[])
    {
        Tools t = new Tools();
        t.show();
    }
    

}
