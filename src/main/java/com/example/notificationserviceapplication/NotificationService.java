package com.example.notificationserviceapplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository repository;

    public Notification send(Notification notification) {
        notification.setSentAt(java.time.LocalDateTime.now());
        return repository.save(notification);
    }

    public List<Notification> getAll() {
        return repository.findAll();
    }
}
