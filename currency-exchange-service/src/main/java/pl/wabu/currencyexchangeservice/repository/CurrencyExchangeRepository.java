package pl.wabu.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wabu.currencyexchangeservice.model.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByFromAndTo(String from, String to);
}
