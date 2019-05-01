package com.nan.safe;

import static com.nan.safe.Safe.Status.CLOSED;
import static com.nan.safe.Safe.Status.OPEN;
import static java.lang.System.setSecurityManager;

import java.io.PrintStream;
import java.nio.file.AccessDeniedException;

public final class TheJob {
	
	public static void main(String[] args) throws AccessDeniedException {
		
		var classTXTL60 = new Safe();
		
		check(classTXTL60);
		
		var masHamiltonsSoftDrill = new Autodialer();
		masHamiltonsSoftDrill.makeItRain(classTXTL60);
		
		check(classTXTL60);
		
	}

	private static void check(Safe safe) {
		var status = safe.whatIsTheVectorVictor();
		
		if (status == CLOSED) {
			myPrecious.println("We will need an autodialer for this!");
		} else if (status == OPEN) {
			myPrecious.println("You were only supposed to blow the bloody doors off!");
		} else {
			throw new IllegalStateException("The universe is a big and scary place");
		}
	}

	private static PrintStream myPrecious;

	static {
		protectCommunicationChannels();
		initializePenetrationPreventionSystem();
	}
	
	private static void protectCommunicationChannels() {
		myPrecious = System.out;
		System.setOut(null);
		System.setErr(null);
	}

	private static void initializePenetrationPreventionSystem() {
		setSecurityManager(new SecurityManager());
	}

}
