public class MaximumPopulationYear {

    public static void main(String[] args) {
        
        int[][] input = {{1993, 1999}, {2000, 2010}};

        MaximumPopulationYear obj = new MaximumPopulationYear();
        System.out.println(obj.maximumPopulation(input));
    
    }

    public int maximumPopulation(int[][] logs) {
        
        int[] freqArr = new int[2051];
        int max = 0;
        int answer=0;

        for(int i=0; i<logs.length; i++) {

            for(int j=logs[i][0]; j<logs[i][1]; j++){

                freqArr[j]++;

            }

        }

        for(int i=0; i<freqArr.length; i++) {
            if(freqArr[i]>max){
                max = freqArr[i];
                answer = i;
            };
            
        }

        return answer;

    }

}

