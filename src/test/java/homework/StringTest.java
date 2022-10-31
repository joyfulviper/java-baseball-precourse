package homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringTest {

    @Test
    @DisplayName("\"1,2\"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트 구현")
    void test1() {
        String[] strings = "1,2".split(",");
        assertThat(strings).contains("1", "2");
    }

    @Test
    @DisplayName("\"1\"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트 구현")
    void test2() {
        String[] strings = "1".split(",");
        assertThat(strings).containsExactly("1");
    }

    @Test
    @DisplayName("\"(1,2)\" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 \"1,2\"를 반환하도록 구현\n")
    void test3() {
        String str = "(1,2)";
        String subString = str.substring(1, str.length() - 1);
        System.out.println(subString);
    }

    @Test
    @DisplayName("\"abc\" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트 구현")
    void test4() {
        String str = "abc";
        char test = str.charAt(1);
        char expect = 'b';
        assertThat(test).isEqualTo(expect);
    }

    @Test
    @DisplayName("String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsExcepion이 발생하는 부분에 대한 학습 테스트 구현\n")
    void test5() {
        String str = "abc";
        StringIndexOutOfBoundsException e = assertThrows(StringIndexOutOfBoundsException.class, () -> str.charAt(3));
    }
}