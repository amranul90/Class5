package Homework;

public class Class5A {

    public static void main(String[] args) { //Array homework
        String []name={"mike" ,"jose" ,"peter","hendry"};
        System.out.println(name[0]);
        System.out.println(name[3]);

        int money=10;
        if (money==10){ // Cionditional statement
            System.out.println("i can get a burger");
        }
        if (money==20){
            System.out.println("i can get grocery");
        }
        if (money==100){
            System.out.println("i can bay cloth");
        }


        for (int i =0;i<5;i++){ //For loop
            System.out.println(i);
        }


        int [] grades ={98,100,50,60};
        for (int i=0;i<grades.length;i++){
            System.out.println(grades[i]);
        }
          int x=0; //While loop
        while (x< 5){
            System.out.println("hello amran");
            x++;
        }

         int v=0; //do while loop
           do {
               System.out.println("do while loop");
               v++;
           }while (v<7);
    }
}
