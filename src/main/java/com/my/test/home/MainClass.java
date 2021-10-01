package com.my.test.home;

import com.my.test.work.Avengers;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        // 로드할 컨텍스트 파일 위치 값
        String configLoc = "classpath:applicationCTX.xml";
        // 컨텍스트 컨테이너 생성
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
        // 어벤져스 인터페이스를 구현한 avg 빈으로 을 부름
        Avengers avgs = ctx.getBean("avg", Avengers.class);
        // 해당 인터페이스의 acttack() 메소드 호출
        avgs.attack();
        ctx.close();
    }
}
