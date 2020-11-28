package com.github.tongjisserollman.iceamusementpark.template;

import com.github.tongjisserollman.iceamusementpark.facilities.movie.template.MovieTemplate;
import com.github.tongjisserollman.iceamusementpark.facilities.movie.template.movies.CrystalMovie;
import com.github.tongjisserollman.iceamusementpark.facilities.movie.template.movies.DragonMovie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateTest{

    @Test
    void testTemplate() {
        MovieTemplate dragonMovie = new DragonMovie();
        MovieTemplate crystalMovie = new CrystalMovie();
        dragonMovie.playMovie();
        crystalMovie.playMovie();
    }
}
