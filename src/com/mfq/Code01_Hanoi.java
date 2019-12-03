package com.mfq;

import java.util.ArrayList;
import java.util.List;

public class Code01_Hanoi {

	List list = new ArrayList();
	public static void func(int rest, int down, String from, String help, String to) {
		if (rest == 1) {
			System.out.println("move " + down + " from " + from + " to " + to);
		} else {
			func(rest - 1, down - 1, from, to, help);
			func(1, down, from, help, to);
			func(rest - 1, down - 1, help, from, to);
		}
	}

	public static void hanoi(int n) {
		if (n > 0) {
			func(n, n, "left", "mid", "right");
		}
	}

	public static void main(String[] args) {
		int n = 3;
		hanoi(n);
	}

}
