package com.example.workflow.controller;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Controller implements JavaDelegate {


    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String name = (String) execution.getVariable("name");
        System.out.println("process is executed...");
        System.out.println("Name is: "+name);
    }
}
