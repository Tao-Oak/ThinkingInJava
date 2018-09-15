//
// Created by Joshua.Cao, 2018/09/14
//

package com.thinkinginjava.chapter13.holding.exercises;

import net.mindview.util.Stack;

public class Exercise15_EvaluateExpression {
	public static void main(String[] args) {
		String expression = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if (c == '+') {
				stack.push(expression.charAt(++i));
			} else if (c == '-'){
				System.out.println(stack.pop());
			}
		}
	}
}
