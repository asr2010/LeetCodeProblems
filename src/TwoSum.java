import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    public static void main(String[] args)
    {
        int[] set = {1,2,4,5,6,7};
        int target =7;
        TwoSum ts = new TwoSum();
        int[] result= ts.checkTwoSum(set, target);
        System.out.println(Arrays.toString(result));
    }
    public int[] checkTwoSum(int[] num, int target)
    {
        HashMap<Integer, Integer> complementSet= new HashMap<>();
        for(int i=0; i<num.length;i++)
        {
            if(complementSet.containsKey(num[i]))
            {
                return new int[] {complementSet.get(num[i]), i};
            }
            else
            {
                complementSet.put(target-num[i], i);
            }
        }
        return new int[] {-1,-1};
    }
}