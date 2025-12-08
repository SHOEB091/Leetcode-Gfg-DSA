package GreedyAlgo;

import java.util.*;

public class JobSequencing {
    //Given an array of jobs where every job has a deadline and associated profit if the job is finished before the deadline.
    // It is also given that every job takes single unit of time, so the minimum possible deadline for any job is 1.
    // How to maximize total profit if only one job can be scheduled at a time.
    /*
    JobId  Deadline  Profit
      1       4       20
      2       1       10
      3       1       40
      4       1       30
    */

    // Algorithm
    // sort jobs in descending order of profit
    // track time 
    // arralylist in which we will store result
    // iterate over jobs
    /*
        for(int i=0;i<jobs;i++){
        if(job(deadline)<time){
            add jobs to result
            time++;
        }
        }
    */
   static class Job {  // ← Added 'static' keyword here
    int id;
    int deadline;
    int profit;

        Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
        }
    }

   

    public static void main(String[] args) {
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        //This is for adding jobs to the list
        for(int i=0;i< jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }

        //Step 1: Sort jobs in descending order of profit
        Collections.sort(jobs,(a,b) -> b.profit - a.profit); // descending order of profit

        //Step 2: Iterate over jobs and add to result if deadline > time
        ArrayList<Integer>sequence = new ArrayList<>();
        int time =0;
        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline>time){
                sequence.add(curr.id);
                time++;
            }
        }

        // Print the job sequence
        System.out.println("Job sequence to maximize profit: " + sequence);
        for(int i=0;i<sequence.size();i++){
            System.out.print("Job"+sequence.get(i)+" ");
        }
        System.out.println();
    }
}