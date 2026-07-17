package com.example.demo.utils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {

    private final PrototypeBean bean1;
    private final PrototypeBean bean2;

    public DemoRunner(PrototypeBean bean1,
                      PrototypeBean bean2) {
        this.bean1 = bean1;
        this.bean2 = bean2;
    }

    @Override
    public void run(String... args) {

        System.out.println(bean1.hashCode());
        System.out.println(bean2.hashCode());

        System.out.println(bean1 == bean2);
    }
}
