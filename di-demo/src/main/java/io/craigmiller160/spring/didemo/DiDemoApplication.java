package io.craigmiller160.spring.didemo;

import io.craigmiller160.spring.didemo.controllers.ConstructorInjectedController;
import io.craigmiller160.spring.didemo.controllers.MyController;
import io.craigmiller160.spring.didemo.controllers.PropertyInjectedController;
import io.craigmiller160.spring.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
