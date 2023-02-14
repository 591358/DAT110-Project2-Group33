package no.hvl.dat110.messages;

import java.util.HashSet;
import java.util.Set;

public class mainTest {
	public static void main(String[] args) {
		CreateTopicMsg message = new CreateTopicMsg("knut","lesson");
		System.out.println(message.getType());
		
		DeleteTopicMsg messaged = new DeleteTopicMsg("knut","lesson");
	}
	
}
