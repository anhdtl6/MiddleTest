import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.assertThat;

class Bai1Test {
    @Test
     void testString() {
        String str = "You Only Live Once. But if You do it right. once is Enough";
        assertThat(str).isNotEmpty()
                .hasSize(58);
    }

}