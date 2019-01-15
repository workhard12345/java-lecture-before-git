public class Main {

    public static void main(String[] args) {
        int number=0;   //P
        int number1=1;  //q

        boolean p =true;
        boolean q = false;

        boolean isFirstTime= true;
        for(int counter=0;counter<10;counter++){
            if(isFirstTime){
                isFirstTime=false;
                System.out.println("I will only print once.");
            }
        }

     /*   if( (p && q) && (a==1 && b==2)   ){
            System.out.println("will I enter here");
        }*/


        if( number==0 || number1==1){
            System.out.println("True or true information");     //prints out
        }

        if( !(number==0 || number1==1)){
            System.out.println("Not (True or true information)"); //not prints out
        }

        if( number==0 || number1!=1){
            System.out.println("True or false information");    //prints out
        }
        if( number==2 || number1!=1){
            System.out.println("True or false information");   //not prints out
        }


    }
}
