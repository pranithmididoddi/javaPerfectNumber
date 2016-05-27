

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();

        int number=1236;
        int remainder=0;
        int result=0;
        int count=0;
        int lastnumber=0;
        int sum=0;

        while(number!=0)
        {
            count++;
            remainder=number%10;

            if(count==1){lastnumber=remainder;}

            else{list.add(remainder);}
            result=result+remainder;
            number=number/10;
        }


        for(int i : list)
        {
            sum=sum+i;
        }
        if(sum==lastnumber)
        {
            System.out.println("Perfect number");

        }
        else
        {
            System.out.println("Not a perfect number");
        }

    }
}
