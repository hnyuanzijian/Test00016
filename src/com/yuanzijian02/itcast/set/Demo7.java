package com.yuanzijian02.itcast.set;

import java.util.TreeSet;
/*
TreeSet是可以对字符串进行排序 的， 因为字符串已经实现了Comparable接口。

字符串的比较规则：
	
	情况一： 对应位置有不同的字符出现， 就比较的就是对应位置不同的字符。

	情况 二：对应位置上 的字符都一样，比较的就是字符串的长度。
	


 */


public class Demo7 {
	
	public static void main(String[] args) {
		/*TreeSet tree = new TreeSet();
		tree.add("abcccccccccccccccccc");
		tree.add("abc");
		System.out.println(tree);*/
		
		System.out.println("abw".compareTo("abcccccccccccc"));
		
	}

}
