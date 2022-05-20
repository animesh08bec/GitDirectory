import java.util.*;

class Dog{
 private String name;
 int height;
 void bark(){
  System.out.println("Woof Woof");
 }
 void setName(String newName){
  name=newName;
 }
 String getName(){
  return name;
 }
}

class DogSeller{
 String name;
 int numOfDogs;
 void changeName(Dog dog, String dogname){
  dog.setName(dogname);
 }
}

public class Prog1{
 public static void main(String[] args){
  int a;
  a=108;

  boolean b;
  b=true;
  int[] nums=new int[7];
  Dog[] dogs=new Dog[7];
  dogs[0]=new Dog();
  //int i=0;
  for (int i=0; i<8; System.out.println("Hi")){
   //System.out.println("Hello !");
   i++;
  }
  //System.out.println("i is = "+ i);
  String[] nameArray={"Animesh", "Tathagata", "Gobinda"};
  for(String name:nameArray){
   System.out.println(name);
  }
  dogs[0].setName("Harry");
  dogs[0].height=5;
  DogSeller John=new DogSeller();
  System.out.println("Dogs name "+dogs[0].getName());
  John.changeName(dogs[0], "Furry");
  System.out.println("Dogs name "+dogs[0].getName());
  System.out.print("\t\t\tHey You!\n");
  System.out.println("Integer is "+ a);
  System.out.println("Boolean is "+b);
  System.out.println("Array is "+nums[0]);

  dogs[0].bark();
  ArrayList<String> myList= new ArrayList<String>();
  String aa=new String("Hello");
  myList.add(aa);
  myList.add(nameArray[1]);
  myList.add("Hari");
  String bv= "Rakhi";
  myList.add(bv);
  System.out.println(myList.get(3));
  bv="Ruma";

  System.out.println(myList.get(3));
  System.out.println(bv);

 int size=myList.size();
 System.out.println(size);
 System.out.println(myList.get(1));
 nameArray[1]="Tarun";
 System.out.println(myList.get(1));
for(String name:nameArray){
   System.out.println(name);
  }
String nameArraya[]=new String[3];
for(int i=0;i<3;i++){
   nameArraya[i]=nameArray[i];
  }
nameArray[0]="Ram";
for(String name:nameArray){
   System.out.println(name);
  }
for(String name:nameArraya){
   System.out.println(name);
  }


 }

}
