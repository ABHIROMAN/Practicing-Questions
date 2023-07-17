package BasicProgrammingProblems.Strings2;


import java.util.*;

class Job {
    char id;
    int deadline;
    int profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of jobs: ");
        int n = scanner.nextInt();

        List<Job> jobs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the job ID, deadline, and profit for job " + (i + 1) + ": ");
            char id = scanner.next().charAt(0);
            int deadline = scanner.nextInt();
            int profit = scanner.nextInt();
            jobs.add(new Job(id, deadline, profit));
        }

        List<Character> scheduledJobs = scheduleJobs(jobs);

        System.out.println("Scheduled jobs for maximum profit: " + scheduledJobs);

        scanner.close();
    }

    private static List<Character> scheduleJobs(List<Job> jobs) {
        // Sort the jobs in descending order of profit
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = Integer.MIN_VALUE;
        for (Job job : jobs) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }

        boolean[] slots = new boolean[maxDeadline];

        List<Character> scheduledJobs = new ArrayList<>();

        for (Job job : jobs) {
            for (int i = job.deadline - 1; i >= 0; i--) {
                if (!slots[i]) {
                    slots[i] = true;
                    scheduledJobs.add(job.id);
                    break;
                }
            }
        }

        return scheduledJobs;
    }
}
