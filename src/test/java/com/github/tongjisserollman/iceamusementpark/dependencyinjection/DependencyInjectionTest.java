package com.github.tongjisserollman.iceamusementpark.dependencyinjection;
import static org.junit.jupiter.api.Assertions.*;
public class DependencyInjectionTest {
    @org.junit.jupiter.api.Test
    void testDependencyInjection(){
        NewsPublisher publisher = new NewsPublisher();
        OnlineNewsChannel online = new OnlineNewsChannel();
        NewspaperChannel newspaper = new NewspaperChannel();

        News news = new News("There will be a discount this Friday", "Park Officer");

        publisher.publish(news, online);
        publisher.publish(news, newspaper);
    }
}
