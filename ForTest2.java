class ForTest2
{
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i=1;i<=10;i++)
        {
            sum = sum+i;
        }
        System.out.println("sum="+sum);
        
        sum = 0; 
        for(int i=1;i<=100;i++)
        {
            if(i%7==0)
            {
                System.out.println(i);
                sum++;
            }
        }
        System.out.println(sum);
        
    }
}