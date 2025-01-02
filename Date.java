public class Date{

        private int day;
        private int month;
        private int year;
        
        static int count;
        
        Date()
        {
            count++;
        }

        public void setDate(int day,int month,int year){

            
                this.day=day;
                this.month=month;
                this.year=year;
        }
            public void getDate(){
                System.out.println(day+"/"+month+"/"+year);
            }

            public static void main(String[]args)
            {
                Date d1= new Date();
                d1.getDate();

                Date d2 = new Date();
                d2.setDate(10,20,2001);

                d2.getDate();

                System.out.println("The constructor calls are :- " +count);
            }

        }