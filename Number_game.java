import java.util.Scanner;

class Number_game{

    public static int randrange(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Number Game ! please Check you Gusse ");
       System.out.println("Input Your Chance");
       int chance=sc.nextInt();
        int Score=0;
        boolean gameplay =true;

       
      

        System.out.println( "Your Chance is " + chance + " " + "and Win the game");
        System.out.println("Enter the Guess Number");
        while(gameplay){
            int rand=randrange(1,100);
              boolean Guess=false;
            for(int i=1; i<chance; i++){
                System.out.println( "Please Input the  "+"your chance is " + i);
                int user=sc.nextInt();
                if(user==rand){
                    Guess=true;
                    Score+=1;
                    System.out.println("You Won it...+ "  +"Congratulation");
                    break;
                }
                else if(user>rand){
                    System.out.println("ohh "  + "Too High");
                }else{
                    System.out.println("Too Low");
                }
            }

            if(Guess==false){
                System.out.println("Sorry " + "chances is 0\n" + "Randome Number  is " + rand);
            }

            System.out.println("Do you want play again y/n");
        String palyagain=sc.next();
       gameplay=palyagain.equalsIgnoreCase("y");
        }


        System.out.println("I hope you  wil enjoyed from game");
        System.out.println("Here is Your score" + "   "  +   Score);
       

        
    }
}