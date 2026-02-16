package com.practice16feb;

public class TechLead implements Trainer, Developer {

	@Override
	public void developProject() {
		System.out.println("Developer develop...!");
	}

	@Override
	public void teach() {
		System.out.println("Trainer teach to fresher..!");

	}

	public static void main(String[] args) {
		TechLead t = new TechLead();
		t.developProject();
		t.teach();
	}

}
