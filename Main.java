import java.util.Scanner;
public class Main
{
    public static void main(String args[])
        {
        Scanner s = new Scanner(System.in);
        int base_year = 1900;
        int day =0, year=0, count = 0, date_in=0, month_in=0;
        int startDayofYear = 0;
        System.out.println("Enter date (in dd) : ");
        date_in = s.nextInt();
        System.out.println("Enter month (in mm) : ");
        month_in = s.nextInt();
        System.out.println("Enter year (in yyyy) : ");
        year = s.nextInt();
        
        while(base_year < year)
        {
            if(base_year%4==0) {
                count += 2;
            }
            else{
                count++;
            }
            base_year++;
        }
        day = count % 7;
            switch(day){
                case 0:
                    //sunday
                    startDayofYear = 0;
                    break;
                case 1:
                    //monday
                    startDayofYear = 1;
                    break;
                case 2:
                    //tuesdday
                    startDayofYear = 2;
                    break;
                case 3:
                    //wednesday
                    startDayofYear = 3;
                    break;
                case 4:
                    //thursday
                    startDayofYear = 4;
                    break;
                case 5:
                    //friday
                    startDayofYear = 5;
                    break;
                case 6:
                    //saterday
                    startDayofYear = 6;
                    break;
            }
        //   System.out.printf("enter Start day of year");
        //   startDayofYear = s.nextInt();         
          int dayCounter = startDayofYear;
          int nbrOfDays = 0;
          String monthName = "";

          for (int month = 1; month <= 12; month++) {
              // Switch to chose the month
              switch (month) {
              case 1:
                  monthName = "January";
                  nbrOfDays = 31;
                  break;
              case 2:
                  monthName = "February";
                  if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                      nbrOfDays = 29;
                      break;
                  } else {
                      nbrOfDays = 28;
                      break;
                  }
              case 3:
                  monthName = "March";
                  nbrOfDays = 31;
                  break;
              case 4:
                  monthName = "April";
                  nbrOfDays = 30;
                  break;
              case 5:
                  monthName = "May";
                  nbrOfDays = 31;
                  break;

              case 6:
                  monthName = "June";
                  nbrOfDays = 30;
                  break;
              case 7:
                  monthName = "July";
                  nbrOfDays = 31;
                  break;
              case 8:
                  monthName = "August";
                  nbrOfDays = 31;
                  break;
              case 9:
                  monthName = "September";
                  nbrOfDays = 30;
                  break;
              case 10:
                  monthName = "October";
                  nbrOfDays = 31;
                  break;
              case 11:
                  monthName = "November";
                  nbrOfDays = 30;
                  break;
              case 12:
                  monthName = "December";
                  nbrOfDays = 31;
                  break;
              }

              System.out.printf("%s \n", monthName, year);
              System.out.println("----------------------------");
              System.out.printf("%s %s %s %s %s %s %s\n ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

              for (int space = 1; space <= startDayofYear; space++) {
                  System.out.printf("%4s", "    ");
              }
              for (int i = 1; i <= nbrOfDays; i++) {
                  dayCounter++;
                  if (dayCounter % 7 == 0)
                      System.out.printf("%- 4d\n", i);
                  else
                      System.out.printf("%-4d", i);

              }
              startDayofYear = (startDayofYear + nbrOfDays) % 7;
              System.out.println();

              //end of forloop after printing all 12 months
          }
          s.close();
        }
}
