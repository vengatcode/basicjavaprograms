
/**
 * 
 */
package com.vengat.java.others;

/**
 * @author vrathinavel
 *
 */
public class My01_DelayLoop {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int countDown = 1;
		while(countDown <= 10){
			System.out.println("Here the delayed countDown : " +countDown);
			countDown++;
			Thread.sleep(2000);
		}

	}

}
