class Sparse
{
    int row = 4, col = 5;
    int [][]s = {
        {0 , 0 , 3 , 0 , 4 },
        {0 , 0 , 5 , 7 , 0 },
        {0 , 0 , 0 , 0 , 0 },
        {0 , 2 , 6 , 0 , 0 }
    };
    void tripletForm()
    {
        int size=0;
        for(int r=0; r<row; r++)
        {
            for(int c=0; c<col; c++)
            {
                if(s[r][c] != 0)
                size++;
            }
        }
        int M[][] = new int[size][3];
        int k=0;
        for(int r=0; r<row;r++)
        {
            for(int c=0; c<col; c++)
            {
                if(s[r][c] != 0)
                {
                    M[k][0] = r;
                    M[k][1] = c;
                    M[k][2] = s[r][c];
                    k++;

                }
            }
        }

        System.out.println("Sparse Matrix in Triplet Format-");
        for(int x[]: M)
        {
            System.out.print(x[0] + " ");
            System.out.print(x[1] + " ");
            System.out.print(x[2] + " ");
            System.out.println();
        }
    }
}
public class prog3 {
    public static void main(String args[])
    {
        Sparse s = new Sparse();
        s.tripletForm();
    }
    
}
