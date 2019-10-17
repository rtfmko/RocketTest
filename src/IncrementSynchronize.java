import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class IncrementSynchronize {

	/**
	 * Given the following class:
	 * public class IncrementSynchronize { private int value = 0; //getNextValue() }
	 * Write three different method options for getNextValue() that will return 'value++', each
	 * method needs to be synchronized in a different way.
	 */

	private Semaphore semaphore = new Semaphore(1);
	private ReentrantLock lock = new ReentrantLock(true);

	private int value = 0; //Or we can use "AtomicInteger" to synchronize value, or "volatile"


	public int getNextValue(){  //Use "Semaphore" to synchronize incremented value
		boolean permit = false;
		try {
			permit = semaphore.tryAcquire();
			if (permit){
				return value++;
			}
		} finally {
			if (permit){
				semaphore.release();
			}
		}
		return 0;
	}

	public synchronized int getNextValueSynch(){ //Use "Synchronized" to synchronize incremented value
		return value++;
	}

	public int getNextValueLock(){ //Use "ReentrantLock" to synchronize incremented value
		lock.lock();

		try {
			return value++;
		} finally {
			lock.unlock();
		}
	}

}
