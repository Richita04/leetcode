class Solution {
    public double averageWaitingTime(int[][] customers) {

        int currentTime = 0;
        double totalWaitingTime = 0;

        for (int i = 0; i < customers.length; i++) {
            int arrivalTime = customers[i][0];
            int orderTime = customers[i][1];

            currentTime = Math.max(currentTime, arrivalTime);
            currentTime += orderTime;

            int waitingTime = currentTime - arrivalTime;
            totalWaitingTime += waitingTime;
        }

        return (double) totalWaitingTime / customers.length;
        
    }
}