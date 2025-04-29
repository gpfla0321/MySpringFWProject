package mylab.notification.di.annot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import mylab.notification.di.annot.EmailNotificationService;
import mylab.notification.di.annot.NotificationManager;
import mylab.notification.di.annot.SmsNotificationService;

@Configuration
public class NotificationConfig {
	
	@Autowired
	EmailNotificationService emailSerivce;
	
	@Autowired
	SmsNotificationService smsService;
	
	@Autowired
	NotificationManager mapper;
	
	
}
