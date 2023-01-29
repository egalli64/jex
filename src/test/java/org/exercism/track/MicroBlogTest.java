/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Micro Blog: exercism.org/tracks/java/exercises/micro-blog
 */
class MicroBlogTest {
    private final MicroBlog microBlog = new MicroBlog();

    @ParameterizedTest
    @CsvSource(textBlock = """
                    Hi, Hi
                    Hello there, Hello
            """)
    public void plain(String input, String expected) {
        String actual = microBlog.truncate(input);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
                    brühe, brühe
                    Bärteppich, Bärte
                    Добър, Добър
                    υγειά, υγειά
            """)
    public void nonEnglish(String input, String expected) {
        String actual = microBlog.truncate(input);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
                    a=πr², a=πr²
                    Bärteppich, Bärte
                    ∅⊊ℕ⊊ℤ⊊ℚ⊊ℝ⊊ℂ, ∅⊊ℕ⊊ℤ
                    Fly 🛫, Fly 🛫
                    💇, 💇
                    ❄🌡🤧🤒🏥🕰😀, ❄🌡🤧🤒🏥
                    🃎🂸🃅🃋🃍🃁🃊, 🃎🂸🃅🃋🃍
            """)
    public void more(String input, String expected) {
        String actual = microBlog.truncate(input);
        assertThat(actual).isEqualTo(expected);
    }
}