import java.util.*;

public class Solution {

  public static int numberOfRecordBreakingDays(int numberOfDays, int[] visitors) {
    int recordBreakingDays = 0;
    int max = 0;
    for(int i = 0 ; i<numberOfDays;i++){
        if(i==0){
        if(visitors[i]>visitors[i+1]){
            recordBreakingDays++;
        }
        }
        else if(i==(numberOfDays-1)){
            if(visitors[i]>max)
               recordBreakingDays++;
        }
        else{
            if(visitors[i]>max&&visitors[i]>visitors[i+1]){
               recordBreakingDays++; 
            }
        }
        if(max<visitors[i])
            max = visitors[i];
    }

    return recordBreakingDays;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Get number of test cases in input
    int testCaseCount = scanner.nextInt();
    // Iterate through test cases
    for (int tc = 1; tc <= testCaseCount; ++tc) {
      // Get number of days for this test case
      int numberOfDays = scanner.nextInt();
      // Get attendance for each day
      int[] visitorsPerDay = new int[numberOfDays];
      for (int d = 0; d < numberOfDays; ++d) {
        visitorsPerDay[d] = scanner.nextInt();
      }
      // Print results
      int answer = numberOfRecordBreakingDays(numberOfDays, visitorsPerDay);
      System.out.println("Case #" + tc + ": " + answer);
    }
  }
}class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}