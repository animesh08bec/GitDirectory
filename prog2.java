import java.util.*;

class Dog{
    String colour="White";
    int speed=60;
    String name="";
    public void bark(){
        System.out.println("Dog "+name+" is barking, woof woof !");
    }
}


public class prog2{
    public static void main(String[] args){
        System.out.println("Visuiting Java after Long Time !");
        int a=10;
        int b=20;
        System.out.println("a is= " + a);
        System.out.println("b is= " + b);
        a=b;
        System.out.println("a is now = " + a);
        System.out.println("b is now = " + b);
        a=a+100;
        System.out.println("a is = " + a);
        System.out.println("b is = " + b);
        Dog d1=new Dog();
        d1.name="Tommy";
        Dog d2=new Dog();
        d2.name="Hilfiger";
        d2.bark();
        d1.bark();
        d1=d2;
        System.out.println("+++=======+++");
        d1.bark();
        d2.bark();
        System.out.println("+++=======+++");
        int[] nums;
        nums= new int[2];
        System.out.println(nums[1]);
        System.out.println("+++=======+++");
        Dog[] dogs=new Dog[2];
        
        d1.name="Tommy";
        d2= new Dog();
        d2.name="Hilfiger";

        dogs[0]=d1;
        dogs[1]=d2;
        d2=d1;
        System.out.println(dogs[0].name + " and " + dogs[1].name + " are " + dogs.length + " dogs ! ");
        System.out.println(d1==d2);
        for(int i=0, j=11;;i++){
            System.out.println("i is = "+ i);
            System.out.println("j is = "+ j);
            i=i+2;
            if(i>20){
                break;
            }
            j--;
        }
        System.out.println(dogs[0].name + " and " + dogs[1].name + " are " + dogs.length + " dogs ! ");
        
        System.out.println(d1.name + " and " + d2.name + " are " + dogs.length + " dogs ! ");

        System.out.println("Added a new line for Git");
    }
}