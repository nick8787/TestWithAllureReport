import org.testng.annotations.Test;
import selenide.pages.StylusHomePage;

import static utils.Constants.*;

public class CreateOrderTest extends BaseTest {

    @Test
    public void testCreateOrder() {
        StylusHomePage stylusHomePage = new StylusHomePage();
        stylusHomePage.open()
                .authorizeUser(USER_EMAIL, USER_PASSWORD)
                .openCatalog()
                .openAllLaptops();
    }
}