package com.onushi.springtestrecorder.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class DemoRunner implements CommandLineRunner {
    private final DemoPersonService demoPersonService;

    public DemoRunner(DemoPersonService demoPersonService) {
        this.demoPersonService = demoPersonService;
    }

    @Override
    public void run(String... args) throws Exception {
        this.demo1();
    }

    public void demo1() throws Exception {
        List<Integer> personIds = new ArrayList<>();
        personIds.add(1);
        personIds.add(2);

        Map<Integer, DemoPerson> personMap = this.demoPersonService.loadPersons(personIds);
    }
}