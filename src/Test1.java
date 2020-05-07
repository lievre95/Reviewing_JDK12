
public class Test1 {
    public static void main(String[] args) {

        int[] nums1 = new int[] { 0, 1, 2, 3, 4, 5 };

        int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };
        nums2[1][0]=44;
        System.out.println(nums2[1][0]);
        int last = nums1[nums1.length-1];
        for (int i = 0; i < nums2.length; i++){
            System.out.println(i);
        }

    }
    }
