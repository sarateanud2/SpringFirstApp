package com.spring.study.robotconst;

import com.spring.study.interfaces.Hand;
import com.spring.study.interfaces.Head;
import com.spring.study.interfaces.Leg;
import com.spring.study.interfaces.Robot;

public class T1000 implements Robot {
	
	private Head head;
	private Hand hand;
	private Leg leg;
	
	public T1000() {
		super();
	}

	public T1000(Head head, Hand hand, Leg leg) {
		super();
		this.head = head;
		this.hand = hand;
		this.leg = leg;
	}

	@Override
	public void robotInfo() {
		head.headInfo();
		hand.handInfo();
		leg.legInfo();
	}

}
