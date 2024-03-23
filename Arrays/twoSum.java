import java.util.Scanner;
class twoSum{
    public static int[] TwoSum(int nums[],int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
   public static void main(String []args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the size of the Array");
       int n=s.nextInt();
       int nums[]=new int[n];
       System.out.println("Enter the  Array elements");
       for(int i=0;i<n;i++) nums[i]=s.nextInt();
       System.out.println("Enter the target element");
       int target=s.nextInt();
       int result[]=TwoSum(nums,target);
       System.out.println("the indices of the elements are "+result[0]+" and "+result[1]);
       }
   }
