package com.sonar.api;

 import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sonar.api.controller.MainController;
import com.sonar.api.service.MessageService;
 
 @SpringBootTest
 @ExtendWith(MockitoExtension.class)
public class MessageTest {

	 @Autowired
	 @Mock
	 MessageService messageService; 
	 
	 
	 @Test
	 public void ssample() {
		 assertEquals(true, 2<3?true:false);
	 }
	 
	 @Test
	 public void messageTest() {
		 when(messageService.getMessage("john")).thenReturn("Hey John, Custom message");
		 
		 assertEquals("Hey John, Custom message", messageService.getMessage("john"));
	 }
	 
	
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
