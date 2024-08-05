package collections.PriorityQueue;

import java.util.PriorityQueue;

public class TaskManager {

    public static void main(String[] arg){
        PriorityQueue<Task> taskPriorityQueue = new PriorityQueue<>((t1,t2)-> t2.priority - t1.priority);

        taskPriorityQueue.offer(new Task("Finish Report",1));
        taskPriorityQueue.offer(new Task("Submit expenses", 2));
        taskPriorityQueue.offer(new Task("Prepare presentations",3));
        taskPriorityQueue.offer(new Task("Reply to urgent emails",1));

        while(!taskPriorityQueue.isEmpty()){
            System.out.println("Processing"+ taskPriorityQueue.poll().description);
        }
    }

}
