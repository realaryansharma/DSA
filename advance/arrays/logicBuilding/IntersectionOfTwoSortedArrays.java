package advance.arrays.logicBuilding;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        
        int i = 0, j = 0;

        ArrayList<Integer> ansList = new ArrayList<>();

        while(i != nums1.length && j != nums2.length) {

            if(nums1[i] != nums2[j]) {

                if(nums1[i] < nums2[j]) {
                    i++;
                } else {
                    j++;
                }

            } else {
                ansList.add(nums1[i]);
                i++;
                j++;
            }            

        }

        //Copy the array list elements to an array

        int[] ans = new int[ansList.size()];

        for(int k = 0; k < ans.length; k++) {
            ans[k] = ansList.get(k);
        }

        return ans;

    }    
}
