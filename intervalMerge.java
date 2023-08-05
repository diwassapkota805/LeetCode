class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length <= 1)
        {
            return intervals;
        }
        // create a list to add all the merged intervals
        ArrayList<int[]> result = new ArrayList<int[]>();

        // sort the array so that the start of the Interval are in order
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        // array to store currrent interval
        int[] currentInterval = intervals[0];

        result.add(currentInterval); 

        // loop thorugh all the intervals
        for(int a = 1; a < intervals.length; a++)
        {
            // put start and end of current and next interval on variables
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];

            int nextStart = intervals[a][0];
            int nextEnd = intervals[a][1];

            // check if the intervals overlap if they do change the end of CurrentInterval
            if(currentEnd >= nextStart)
            {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            }
            else
            {
                result.add(intervals[a]);
                currentInterval = intervals[a];
            }
        }

        return result.toArray(new int[result.size()][]);

    }
    
}

// arrays 
// 56
