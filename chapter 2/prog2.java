class Matrix
{
    int [][]Mat = {{1,2,3,4,5},{4,6,1,2,5},{1,1,1,1,1},{3,1,2,5,6}};
    void sumDiagonal()
    {
        int lSum=0, rSum=0;
        int row = Mat.length, col = Mat[0].length;
        int i = 0;
        while(i<row)
        {
            lSum += Mat[i][i];
            rSum += Mat[i][col-i-1];
            i++;
        }
        System.out.println("Sum of left Diagonal = "+ lSum);
        System.out.println("Sum of right Diagonal = "+ rSum);
    }
}
public class prog2 {
    public static void main(String args[])
    {
        Matrix M = new Matrix();
        M.sumDiagonal();
    }
    
}
