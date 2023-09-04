class VOperations
{
    int Arr[];
    void initialize()
    {
        Arr = new int[]{11,6,77,8,5,44,6,9,442,86,73,49,68,82};
    }
    boolean linearSearch(int se)
    {
        for(int x: Arr)
        {
            if(se == x)
            {
                return true;
            }
            
        }
        return false;
    }
    boolean binarySearch(int se)
    {
        int h=0, l=Arr.length-1, m;
        while(l<=h)
        {
            m = (l+h)/2;
            if(Arr[m] == se)
                return true;

            else if(Arr[m]>se)
                h = m -1;

            else
                l = m+1;
        }
        return false;
    }
    void bubbleSort()
    {
        int l = Arr.length, temp=0;
        for(int i=0; i<l; i++)
        {
            for(int j=1; j< (l-i); j++)
            {
                if(Arr[j-1]>Arr[j])
                {
                    temp = Arr[j-1];
                    Arr[j-1] = Arr[j];
                    Arr[j] = temp;
                }
            }
        }
    }
    void show()
    {
        for(int x: Arr)
        {
            System.out.print(x+" ");
        }
        System.out.print("\n");
    }
}
public class prog1 {
    public static void main(String args[])
    {
        VOperations v = new VOperations();
        v.initialize();
        v.show();
        System.out.println("Linear Search-");
        System.out.println("Is 12 present in the array: " + v.linearSearch(12));
        System.out.println("Is 442 present in the array: " + v.linearSearch(442));
        System.out.println("Binary Search-");
        System.out.println("Is 12 present in the array: " + v.binarySearch(12));
        System.out.println("Is 442 present in the array: " + v.binarySearch(442));
        System.out.println("Array after sorting: ");
        v.bubbleSort();
        v.show();

    }
}
