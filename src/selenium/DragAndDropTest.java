package selenium;

import org.openqa.selenium.WebDriver;

public class DragAndDropTest {
public static void main(String[] args) throws Exception {
	WebDriver driver=Commonmethods.launchbrowser("Chrome");
    Commonmethods.openurl("https://jqueryui.com/droppable/");
    DragAndDrop obj = new DragAndDrop(driver);
    obj.verifyDragAndDrop();

}
}