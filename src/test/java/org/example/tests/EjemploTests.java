package org.example.tests;

import com.microsoft.playwright.Page;
import org.example.utils.BaseTest;
import org.junit.jupiter.api.Test;

public class EjemploTests extends BaseTest {
    @Test
    public void ejemploTest(Page page){
        //navegando a la página
        page.navigate("/");
    }
}
