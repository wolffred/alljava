public class Main{
    public static void main (String [] args){
        
        int daynum = 3;
        String dayName = null;
        
        switch (daynum){
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
                
        }
        
        System.out.println(dayName);
        

        


    }
}