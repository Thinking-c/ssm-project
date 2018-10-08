package com.thinking.single;
/**
 *@Author:caoj
 *@Date:2018/06/12
 *@version:v1.0
 *@Description:
 */
public class SingleDoubleLockLanHan {
	
	private static SingleDoubleLockLanHan doubleLockLanHan = null;

	private SingleDoubleLockLanHan() {
	}
	
	public static SingleDoubleLockLanHan getInstance() {
		if(doubleLockLanHan == null) {
			synchronized(SingleDoubleLockLanHan.class) {
				if(doubleLockLanHan == null) {
					doubleLockLanHan = new SingleDoubleLockLanHan();
				}
			}
		}
		return doubleLockLanHan;
	}

}
