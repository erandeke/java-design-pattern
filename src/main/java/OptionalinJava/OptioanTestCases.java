package OptionalinJava;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class OptioanTestCases {

    @Test
    public void createOptional()
    {
        String name = "baeldung";

        Optional<String> opt = Optional.ofNullable(null);
        assertEquals("Optional.empty", opt.toString());

    }

}
