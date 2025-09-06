public class question3 {
    public double solving(int a,int b ,int c,boolean ff){
        double calculation;
        if (ff == true){
            calculation = (-b+Math.sqrt((b*b)-4*a*c)) /(2.0 * a);

        }
        else{
            calculation = 0.0;
        }
        return calculation;

    }




    
    public static void main(String[] args) {
        question3 qq = new question3();
        System.out.println(qq.solving(2,3,1,true));

    }
}
