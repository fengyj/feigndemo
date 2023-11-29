package me.fengyj.feigndemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@EnableFeignClients(basePackages = "me.fengyj.feigndemo")
@ActiveProfiles("defaultconfig")
class YahooFinancialServiceDefaultConfigTest {

    @Autowired
    private YahooFinancialService svc;

    @Test
    public void test_getHistoryPrice() {

        var response = svc.getHistoryPrices("600036.SS");

        Assertions.assertNotNull(response);
        Assertions.assertTrue(response.startsWith("Date,Open,High,Low,Close,Adj Close,Volume\n"));
    }
}