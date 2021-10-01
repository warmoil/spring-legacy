package com.my.test.home;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        String configLoc1 = "classpath:applicationCTX01.xml";
        String configLoc2 = "classpath:applicationCTX02.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc1, configLoc2);

        Student st1 = ctx.getBean("stu1", Student.class);
        System.out.println(st1.getName());
        System.out.println(st1.getHobbys());

        StudentInfo stIn = ctx.getBean("stuInfo1", StudentInfo.class);
        Student st2 = stIn.getStu();
        System.out.println(st1.getName());
        System.out.println(st1.getHobbys());

        if(st1.equals(st2)) System.out.println("st1과 st2는 같은 사람~!");
        else System.out.println("st1과 st2는 다른 사람~!");

        Student st3 = ctx.getBean("stu2", Student.class);
        System.out.println(st3.getName());


        if(st1.equals(st3)) System.out.println("st1과 st3는 같은 사람~!");
        else System.out.println("st1과 st3는 다른 사람~!");

        Family fm = ctx.getBean("fam", Family.class);
        System.out.println(fm.getPapa());
        System.out.println(fm.getMama());
        System.out.println(fm.getBro());
        System.out.println(fm.getSis());

        ctx.close();
    }
}
