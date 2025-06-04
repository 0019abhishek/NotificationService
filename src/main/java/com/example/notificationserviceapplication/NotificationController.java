package com.example.notificationserviceapplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/add")
    public ResponseEntity<Notification> send(@RequestBody Notification notification) {
        return ResponseEntity.ok(notificationService.send(notification));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Notification>> list() {
        return ResponseEntity.ok(notificationService.getAll());
    }
}
