/**
 * 
 */
package com.zhsh.thread;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author coffee
 *
 */
public class SimpleBlockQueue {
	
	private Object notEmpty = new Object();
	private Object notFull = new Object();
	private int maxLen = 10;
	private Queue<Object> linkedList = new LinkedList<Object>();
	
	public Object get() throws InterruptedException {
		synchronized (notEmpty) {
			if(linkedList.size() == 0) {
				notEmpty.wait();
			}
			synchronized (notFull) {
				if(linkedList.size() == maxLen) {
					notFull.notifyAll();
				}
				return linkedList.poll();
			}
		}
	}
	
	public void put(Object obj) throws InterruptedException {
		System.out.println("fjsa;dlfjasdf");
		synchronized (notEmpty) {
			if(linkedList.size() == 0) {
				notEmpty.notifyAll();
			}
			if(linkedList.size() == maxLen) {
				notFull.wait();
			}
			linkedList.add(obj);
		}
	}
}
