package com.example.maintenance_monitor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MaintenanceMonitorApplicationTests {
	private MaintenanceMonitorMessageEdits maintenanceMonitor;
	@Test
	void contextLoads() {
	}
	@Test
	public void testSetMessage() {
		String message = "New message";
		maintenanceMonitor.setMessage(message);
		assertEquals(message, maintenanceMonitor.getMessage());
	}
	@Test
	public void testReset() {
		maintenanceMonitor.setMessage("Some message");
		maintenanceMonitor.reset();
		assertEquals("Everything operates as expected", maintenanceMonitor.getMessage());
	}

}
