package com.example.maintenance_monitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MaintenanceMonitorMessageEdits {
    private String m = "Everything operates as expected";
    @RequestMapping("/api/message/set")
    public String setmessage(@RequestParam String m){
        if (m==null) {
            m="Everything operates as expected";
        }
            this.m=m;

        return "ok";
    }
    @RequestMapping("/api/message/reset")
    public  String reset(){
        setmessage(null);
    return "ok";
    }
    @RequestMapping("/api/message")
    public String getmessage(){
        return m;
    }
}
