package io.jintongyao.main.chapter1;

import edu.princeton.cs.algs4.StdIn;

import java.util.Stack;

/**
 * Copyright (c) 2015-2016 http://www.bcvet.com
 * P80 - Dijkstra的双栈算数表达式求值算法
 * @author JinTongyao
 * @version alpha
 */
public class ArithmeticExpressionEvaluator {
	public static void main(String[] args) {
		Stack<Double> numbers = new Stack<>();// 操作数栈
		Stack<String> operators = new Stack<>();// 操作符栈

		while (!StdIn.isEmpty()) {
			String inputString = StdIn.readString();
			System.out.println(inputString);
		}
	}
}
