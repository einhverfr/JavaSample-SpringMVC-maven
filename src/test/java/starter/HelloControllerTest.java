package starter;

import org.junit.Test;
import org.springframework.ui.Model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by Christopher Travers on 07/04/2017.
 */
public class HelloControllerTest {
    @Test
    public void helloworld() throws Exception {
        HelloController sut = new HelloController();
        Model model = mock(Model.class);
        assertEquals(sut.helloworld(model), "greeting");
    }

    @Test
    public void hello() throws Exception {

        HelloController sut = new HelloController();
        Model model = mock(Model.class);
        assertEquals(sut.hello("Chris", model), "greeting");

    }

}