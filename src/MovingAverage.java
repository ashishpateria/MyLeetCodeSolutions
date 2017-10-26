import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

	int windowsize;
	Queue<Integer> queue;
	int sum;
	
	public MovingAverage(int windowsize) {
		this.windowsize = windowsize;
		this.queue = new LinkedList<Integer>();
		this.sum = 0;
	}

	private double findMovingAverage(int n) {
		queue.offer(n);
		sum = sum + n;
		
		if (queue.size() > windowsize) {
			sum = sum - queue.poll();
		}
		
		return (double) sum / queue.size();
	}
	
	public static void main(String[] args) {
		int windowsize = 3;;
		
		MovingAverage m=new MovingAverage(windowsize);
		
		for(int i=1;i<20;i++){
			System.out.println("After adding "+i+" to the queue: {}; Average is : "+ m.findMovingAverage(i)+" "+m.queue.toString());
			
		}
	}

}
