public class WeekdaysPrinter{
    public static void main(String[] args)  
    {
        String [] weekday = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for(int i=0 ; i<weekday.length; i++ ){
            if(i>=5) break;
            System.out.println(weekday[i]);
        }

        
        }
    }

