package advance.arrays.hard;

public class MergeTwoSortedArraysWithoutExtraSpace {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1=m-1, p2=n-1, end=nums1.length-1;

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("end: " + end);

        while(p1>=0 && p2>=0) {
            System.out.println("Iteration values : " + nums1[p1] + nums2[p2]);
            if(nums1[p1] >= nums2[p2]) {
                nums1[end] = nums1[p1];
                end--;
                p1--;
            } else {
                nums1[end] = nums2[p2];
                end--;
                p2--;
            }
                

        }

        while(p2>=0) {
            nums1[end--] = nums2[p2--];
        }


    }    
}
