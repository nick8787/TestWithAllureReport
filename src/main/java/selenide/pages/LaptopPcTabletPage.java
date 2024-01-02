package selenide.pages;

import selenide.locators.LaptopPcTabletLocators;

import static com.codeborne.selenide.Selenide.$x;

public class LaptopPcTabletPage {
    public void openAllLaptops() {
        $x(LaptopPcTabletLocators.ALL_LAPTOPS_BTN_XPATH).click();
    }
}
