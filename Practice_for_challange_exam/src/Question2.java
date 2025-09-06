import java.util.Arrays;
 import java.util.Random;

public class Question2 {
    public static void main(String[] args) {
        Random random = new Random();
        int first[] = new int[3];
        for (int i = 0;i<= 2;i++){
            switch (i){
                case 0:first[0]=random.nextInt(100);break;
                case 1:first[1]=random.nextInt(100,200);break;
                case 2:first[2]=random.nextInt(200,300);break;
                default:System.err.println("Fuckyou");break;


            }




        }
        System.err.println(Arrays.toString(first));
    }
}