package com.devblogs.execute;
    
import com.devblogs.component.Print;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
    
public class App {
    public static void main(String [] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Print print = (Print) context.getBean("print");
        print.showSquare();
    }
}