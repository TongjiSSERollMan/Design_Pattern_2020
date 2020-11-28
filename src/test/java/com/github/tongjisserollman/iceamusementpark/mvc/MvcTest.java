package com.github.tongjisserollman.iceamusementpark.mvc;

import com.github.tongjisserollman.iceamusementpark.entertainment.carousel.mvc.Carousel;
import com.github.tongjisserollman.iceamusementpark.entertainment.carousel.mvc.CarouselController;
import com.github.tongjisserollman.iceamusementpark.entertainment.carousel.mvc.CarouselView;
import org.junit.jupiter.api.Test;

public class MvcTest {

    @Test
    void testMvc(){
        System.out.println("MVC模式测试：");
        Carousel model = new Carousel("冰天雪地飞马号",5);
        CarouselView view = new CarouselView();
        CarouselController controller = new CarouselController(model,view);
        controller.updateView();
        controller.setCarouselSpeed(500);
        controller.updateView();
    }
}
