package org.example.test;

import com.microsoft.playwright.Page;
import org.example.utils.BaseTest;
import org.junit.jupiter.api.Test;

public class EjemploTest extends BaseTest {
    @Test
    public void ejemploTest(Page page){
        //navegando a la página
        page.navigate("/");
    }

    @Test
    public void name() {
    }
}
