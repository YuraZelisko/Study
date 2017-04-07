package core2046;

import javax.print.attribute.standard.MediaSize.Other;

import core2046.OutherClass.MemberClass;

public class Main {

	public static void main(String[] args) {
		Judge.Punishment punishment = new Judge.Punishment();
		punishment.staticClassMethod();
		Judge.Punishment.Prison prison = new Judge.Punishment.Prison();
		OutherClass outherClass = new OutherClass();
		MemberClass memberClass = outherClass.createMemberClass();
		memberClass.memberClasssMethod();
		
		Object object = new Object();
		Object local = outherClass.createAnnonymousClass();
		
		
		
	}

}
