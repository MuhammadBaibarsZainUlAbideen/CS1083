import java.util.Random;
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner gg = new Scanner(System.in);
        System.out.print("Enter your number :");
        String hh = gg.next().toLowerCase();


        String[] choice= {"R","P"};
        while (!hh.equals("exit")){

            int another = random.nextInt(0,2);
            String cschocie = choice[another];
            System.err.println(cschocie);
            switch(cschocie){
                case "R":
                   if (hh.equals("r")){
                    System.out.println("Nobady won");
                    break;
                   }
                   else if(hh.equals("p")){
                    System.out.println("You won");
                    break;

                   }
                   else{
                    System.out.print("You lost");
                    break;
                   }
                case "P":
                   if (hh.equals("r")){
                    System.out.println("You lost" );
                    break;

                   }
                   else if (hh.equals("p")){
                    System.out.println("Draw");
                    break;
                   }
                   else{
                    System.out.println("You won ");
                    break;
                   }
                default:System.out.print("Fuck uou ");


            } 
            System.out.print("Enter your number :");
            hh = gg.next();






        }
    gg.close();

    }
}
