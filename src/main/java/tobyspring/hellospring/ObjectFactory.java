package tobyspring.hellospring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan // 해당 패키지 동/하위 클래스 스캔
public class ObjectFactory {
/*    @Bean
    public PaymentService paymentService() {
        return new PaymentService(exRateProvider());
    }

    @Bean
    public ExRateProvider exRateProvider() {
        return new SimpleExRateProvider();
    }*/
}
