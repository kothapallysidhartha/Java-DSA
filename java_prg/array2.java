Class array2
{

    public static void main(String argv[])
    {
        int a[][]=new int [2][2];
        a[0][0]=9;
        a[0][1]=1;
        a[1][0]=5;
        a[1][1]=6;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(a[i][j]);
            }
        }
    }
}