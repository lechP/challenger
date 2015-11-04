package codility.training;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NestingTest {

    private Nesting sut = new Nesting();

    @Test
    public void shouldReturnOneOnEmptyString() throws Exception {
        //given
        String S = "";
        //when
        int result = sut.solution(S);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturnOneOnBasicProperlyNestedString() throws Exception {
        //given
        String S = "()";
        //when
        int result = sut.solution(S);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturnOneOnComplicatedProperlyNestedString() throws Exception {
        //given
        String S = "((()()()(()()))()()(()()()))";
        //when
        int result = sut.solution(S);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroOnSingleOpeningString() throws Exception {
        //given
        String S = "(";
        //when
        int result = sut.solution(S);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroOnSingleClosingString() throws Exception {
        //given
        String S = ")";
        //when
        int result = sut.solution(S);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroOnComplicatedNotFinishedString() throws Exception {
        //given
        String S = "((()()()(()()))()()(()()())"; //one ')' is missing
        //when
        int result = sut.solution(S);
        //then
        assertThat(result).isEqualTo(0);
    }
}