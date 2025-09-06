public class practice {
    public String yo(String date){
        String month = date.substring(0,2);
        String date1 = date.substring(3,5);
        String year = date.substring(6,10);
        String monthname;
        switch (month){
            case "01":monthname="January";break;
            case "02":monthname="Feb";break;
            default:monthname="Unknown";break;

        }
        return monthname+" " + date1 +" " + year;








    }


    public static void main(String[] args) {
        practice p = new practice();
        System.out.println(p.yo("01/22/2019"));





    }
 




    
}