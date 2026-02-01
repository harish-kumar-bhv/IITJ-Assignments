package com.harishdemo.usage;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="usage_logs")
public class UsageLog {

 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;

 private String serviceName;
 private String eventType;
 private String details;
 private LocalDateTime eventTime = LocalDateTime.now();

 public Long getId(){return id;}
 public String getServiceName(){return serviceName;}
 public void setServiceName(String s){serviceName=s;}
 public String getEventType(){return eventType;}
 public void setEventType(String e){eventType=e;}
 public String getDetails(){return details;}
 public void setDetails(String d){details=d;}
 public LocalDateTime getEventTime(){return eventTime;}
 public void setEventTime(LocalDateTime t){eventTime=t;}
}
