package org.example;

import org.example.config.AppConfig;
import org.example.sub1.Greeting;
import org.example.sub1.Hello;
import org.example.sub1.Welcome;
import org.example.sub2.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 날짜 : 2025/03/10
 * 이름 : 김성민
 * 내용 : Spring IoC/DI 실습
 * 
 * @Configuration 
 *  - 애플리케이션을 구성하는 빈(객체)을 스프링 컨테이너에 등록하기 위한 설정 클래스 어노테이션
 *  
 * @Bean 
 *  - 컨테이너에 등록하기 위한 빈 설정 어노테이션
 *  - 사용자 정의 클래스 등록 어노테이션
 *  
 * @ComponentScan
 *  - basePackage로 시작하는 패키지내의 빈을 스캔해서 컨테이너에 등록시키는 어노테이션
 *  - 스캔 대상 컴포넌트는 @Component(@Service, @Repository) 어노테이션 선언해야 됨
 *  
 * @AutoWired
 *  - 컨테이너에 등록되어 있는 빈을 주입하는 어노테이션
 *  - 이름 또는 클래스 타입으로 매칭된 빈을 주입
 *  
 */
public class App 
{
    public static void main( String[] args )
    {
        // 기존 객체 생성 방식
        Hello hello = new Hello();
        Welcome welcome = new Welcome();
        Greeting greeting = new Greeting();

        hello.show();
        welcome.show();
        greeting.show();

        /////////////////////////////////////////////////

        // 스프링 컨테이너 객체 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 객체 주입 방식
        Hello helloBean = context.getBean(Hello.class);
        helloBean.show();

        Welcome welcomeBean = (Welcome) context.getBean("welcome");
        welcomeBean.show();

        Greeting greetingBean = (Greeting) context.getBean("ggg");
        greetingBean.show();

        /////////////////////////////////////////////////
        // IoC/DI 기법을 이용한 실습
        Computer computer = (Computer) context.getBean("com");
        computer.show();
        
    }
}
