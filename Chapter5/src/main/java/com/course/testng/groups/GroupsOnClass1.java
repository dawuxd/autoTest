package com.course.testng.groups;

import org.testng.annotations.Test;

import java.security.acl.Group;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("GroupsOnClass1中stu1运行");
    }
}
