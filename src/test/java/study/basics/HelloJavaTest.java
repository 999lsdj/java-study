package study.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * 第 0 单元的测试。
 *
 * <p>注意命名和注解的写法，这是后面每个单元都会复用的模板：
 * 测试方法名说明"测的是什么"，{@code @DisplayName} 用中文写清"期望的结果是什么"，
 * 断言里第一个参数永远是期望值、第二个参数才是实际值（写反了报错信息会很别扭）。
 */
class HelloJavaTest {

    @Test
    @DisplayName("1 到 100 的和是 5050")
    void sumFromOneToHundred() {
        assertEquals(5050L, HelloJava.sum(1, 100));
    }

    @Test
    @DisplayName("起点大于终点时返回 0，而不是抛异常")
    void sumWithReversedRangeReturnsZero() {
        assertEquals(0L, HelloJava.sum(10, 1));
    }

    @Test
    @DisplayName("只有一个元素时返回该元素本身")
    void sumWithSingleElement() {
        assertEquals(7L, HelloJava.sum(7, 7));
    }

    @ParameterizedTest(name = "sum({0}, {1}) = {2}")
    @CsvSource({
        "1, 10, 55",
        "-5, 5, 0",
        "0, 0, 0",
        "1, 100000, 5000050000"
    })
    @DisplayName("多组输入的结果都正确（含负数与超过 int 上限的和大）")
    void sumWithSeveralInputs(int from, int to, long expected) {
        assertEquals(expected, HelloJava.sum(from, to));
    }
}
