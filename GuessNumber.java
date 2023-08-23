import java.util.*;
class GuessNumber
{

    public static void main(String args[])
    {
        System.out.println("Task-2 :Number Guessing Game");
        Scanner sc=new Scanner(System.in);
        System.out.println("Lets begin the game : Yes/No");
        String s=sc.nextLine();
        while(s.equalsIgnoreCase("Yes")||s.equalsIgnoreCase("y"))
        {
            function.numgame();
            System.out.println("Do you want to continue the game Yes/No or Y/N?");
            s=sc.nextLine();
        }
        sc.close();
    }
}
class function
{
    public static void numgame()
    {
        Random rndm=new Random();
        Scanner scc=new Scanner(System.in);
        int num=rndm.nextInt(50);
        System.out.println("******Random Number is being generated please wait******");
        System.out.println("The guessing number should be in between 1-50 only");
        System.out.println("No. of chances you want to make a guess (1-10)");
        int cnt=scc.nextInt();
        while(cnt>10)
        {
            System.out.println("No of guesses you want exceeds the limit. Please re-enter the number. ");
            cnt=scc.nextInt();
        }
        System.out.println("You have "+cnt+" chances");
        int marks=1000;
        int i=0;
        for(i=0;i<cnt;i++)
        {
            System.out.println("Chance number :"+(i+1)+". Enter your number ");
            int number=scc.nextInt();

            if(number>num)
            {
                System.out.println("Number you guessed is  'GREATER THAN' original number");
            }
            else if (number<num)
            {
                System.out.println("Number you guessed is  'LESS THAN' original number");
            }
            else
            {
                System.out.println("Congratulations!!! You won the Game");
                System.out.println("your score is "+marks);
                break;
            }
            marks= marks-100;
        }
        if(i>=cnt)
        {
            System.out.println("SORRY!!! You Lost the game,please try again");
            System.out.println("SCORE : 0 and the number is : "+ num);
        } 
    }
    
}
