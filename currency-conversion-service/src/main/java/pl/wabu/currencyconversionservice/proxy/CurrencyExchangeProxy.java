package pl.wabu.currencyconversionservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.wabu.currencyconversionservice.model.CurrencyConversion;

//@FeignClient(name = "currency-exchange", url = "localhost:8000")
// remove the URL to let Feign get available instances of the Currency-Exchange from Eureka
@FeignClient(name = "currency-exchange")

public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyConversion retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to
    );
}
