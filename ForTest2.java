<<<<<<< HEAD
class ForTest2
{
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i=1;i<=100;i++)
        {
            sum = sum+i;
        }
        System.out.println("sum="+sum);
        
        sum = 0; 
        for(int i=1;i<=1000;i++)
        {
            if(i%7==0)
            {
                System.out.println(i);
                sum++;
            }
        }
        System.out.println(sum);
        
    }
=======
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
>>>>>>> f5c28ed7034f5087025822f55291d1b122ba03a7
}