import java.util.*;
public class BasicJava{
    public Integer printNum(){
        int j;
        for(j = 1; j < 255; j++){
            System.out.println(j);
        }
        return j;
    }
    public Integer printOdd(){
        int x = 1;
        while (x <= 255){
            System.out.println(x);
            x = x + 2;
        }
        return x;
    }
    public Integer printSum(){
        int a;
        int sum = 0;
        for(a = 0; a <= 255; a++){
            sum += a;
            System.out.println("New number:" + a +  "Sum:" + sum);
        }
        return sum;
    }
    public int[] iterateArray(){
        int[] myArray = {1,3,5,7,9,13};
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
        return myArray;
    }
    public ArrayList<Object> arrayMax(int[] myArray){
        ArrayList <Object> list = new ArrayList<Object>();
        int max = myArray[0];
        for(int i = 0; i < myArray.length; i++){
            if (myArray[i] > max){
                max = myArray[i];
                System.out.println(max);
            }
        }
        list.add(max);
        return list;
    }
    public ArrayList<Object> arrayAvg(int[] myArray){
        ArrayList <Object> list = new ArrayList<Object>();
        double sum = 0;
        for(int i = 0; i < myArray.length; i++){
        sum += myArray[i];
        }
        double avg = sum/myArray.length;
        list.add(avg);
        return list;
    }
    public ArrayList<Object> arrayOdd(int[] myArray){
        ArrayList <Object> odd = new ArrayList<Object>();
        for(int i = 1; i < 255; i+=2){
            odd.add(i);
        }
        return odd;
    }
    public Integer greaterY(){
        int[] myArray = {2,6,8,43,11,70,-2,9,13,14,15};
        int y = 11;
        int result = 0;
        for(int i = 0; i< myArray.length; i++){
            if (myArray[i] > y){
                result ++;
            }
        }
        return result;
    }
    public ArrayList<Object> arraySquare(int[] myArray){
        ArrayList <Object> list = new ArrayList<Object>();
        for(int i = 0; i < myArray.length; i++){
            list.add(myArray[i]*myArray[i]);
        }
        return list;
    }
    public ArrayList<Object> noNeg(int[] myArray){
        ArrayList <Object> list = new ArrayList<Object>();
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] < 0){
                myArray[i] = 0;
                list.add(myArray[i]);
            }
            else{
                list.add(myArray[i]);
            }
        }
        return list;
    }
    public ArrayList<Object> maxMinAvg(int[] myArray){
        ArrayList <Object> list = new ArrayList<Object>();
        int max = myArray[0];
        int min = myArray[0];
        double sum = 0;
        for(int i = 0; i < myArray.length; i++){
            sum += myArray[i];
            if(myArray[i] > max){
                max = myArray[i];
            }
            if(myArray[i] < min){
                min = myArray[i];
            }
        }
        double avg = sum/myArray.length;
        list.add(max);
        list.add(min);
        list.add(avg);
        return list;
    }
    public ArrayList<Object> arrayShift(int[] myArray){
        ArrayList <Object> list = new ArrayList<Object>();
        for(int i = 1; i < myArray.length; i++){
            list.add(myArray[i]);
        }
        list.add(myArray[0]);
        return list;
    }
}