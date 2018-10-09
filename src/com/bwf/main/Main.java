package com.bwf.main;

import com.bwf.utils.MD5Encoding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "admin";
		String ans = MD5Encoding.encodingMd5(str);
		
		System.out.println(ans);
	}

}
