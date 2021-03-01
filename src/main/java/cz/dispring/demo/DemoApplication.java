package cz.dispring.demo;

import cz.dispring.demo.service.ArticleService;
import cz.dispring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoApplication {

    @Autowired
    UserService userService;

    @Autowired
    ArticleService articleService;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "cz.dispring.demo"
        );

        context.getBean(DemoApplication.class).process();
    }

    private void process() {
        userService.createAccount();
        articleService.publishArticle();
    }

}
