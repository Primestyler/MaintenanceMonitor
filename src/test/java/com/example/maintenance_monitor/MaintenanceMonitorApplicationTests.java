package com.example.maintenance_monitor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MaintenanceMonitorApplicationTests {
	private MaintenanceMonitorMessageEdits maintenanceMonitor=new MaintenanceMonitorMessageEdits();
	@Test
	void contextLoads() {
	}
	@Test
	public void testSetMessage() {

		String message = "New message";
		maintenanceMonitor.setMessage(message);
		assertEquals(maintenanceMonitor.getMessage(),message);
	}
	@Test
	public void testReset() {
		String defaultMessage="Everything operates as expected";
		String randomMessage="Some message";
		maintenanceMonitor.setMessage(randomMessage);
		maintenanceMonitor.reset();
		assertEquals(defaultMessage, maintenanceMonitor.getMessage());
	}

}
