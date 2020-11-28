package com.github.tongjisserollman.iceamusementpark.mvc;

import com.github.tongjisserollman.iceamusementpark.facilities.carousel.mvc.Carousel;
import com.github.tongjisserollman.iceamusementpark.facilities.carousel.mvc.CarouselController;
import com.github.tongjisserollman.iceamusementpark.facilities.carousel.mvc.CarouselView;

public class MvcTest {
    @org.junit.jupiter.api.Test
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
