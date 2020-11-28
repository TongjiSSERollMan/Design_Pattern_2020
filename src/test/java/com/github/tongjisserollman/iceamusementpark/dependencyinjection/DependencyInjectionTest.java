package com.github.tongjisserollman.iceamusementpark.dependencyinjection;
import com.github.tongjisserollman.iceamusementpark.base.news.dependencyinjection.News;
import com.github.tongjisserollman.iceamusementpark.base.news.dependencyinjection.NewsPublisher;
import com.github.tongjisserollman.iceamusementpark.base.news.dependencyinjection.NewspaperChannel;
import com.github.tongjisserollman.iceamusementpark.base.news.dependencyinjection.OnlineNewsChannel;

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
