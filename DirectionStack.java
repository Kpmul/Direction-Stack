/*
You are given a set of instructions to get from a home location to
a destination location. You have to give the instructions which
begin at the destination location and return to the home location.
In other words, you need to reverse the directions. The possible
set of directions is "Go North", "Go South", "Go East" and "Go
West". Another possible instruction is "Go Back" which means to
undo the latest step. The instruction "Arrived" means the
sequence of directions is complete.
 */
import java.util.*;

public class Autumn2019Stack {

    private int maxSize;
    private String[] stackArray;
    private int top;
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Autumn2019Stack s1 = new Autumn2019Stack(101);
        String s = new String("");

        while(s!="arrived"){

            s = sc.nextLine().toLowerCase();

            if(s.equals("go north")){
                s1.push("Go South");
            }
            else if(s.equals("go south")){
                s1.push("Go North");
            }
            else if(s.equals("go east")){
                s1.push("Go West");
            }
            else if(s.equals("go west")){
                s1.push("Go East");
            }
            else if(s.equals("go back")){
                s1.pop();
            }
            else{
                break;
            }    
        }
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
    
    public Autumn2019Stack(int s){
        
        maxSize = s;
        stackArray = new String[maxSize];
        top = -1;
    }
    public void push(String j){
        top++;
        stackArray[top] = j;
    }
    public String pop(){
        return stackArray[top--];
    }
    public String peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize-1);
    }
    public void makeEmpty(){
        top = -1;
    }
}
