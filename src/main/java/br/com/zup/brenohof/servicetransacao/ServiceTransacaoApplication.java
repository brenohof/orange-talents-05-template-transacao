package br.com.zup.brenohof.servicetransacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.converter.JsonMessageConverter;

@SpringBootApplication
public class ServiceTransacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTransacaoApplication.class, args);
	}

	@Bean
	JsonMessageConverter jsonMessageConverter() {
		return new JsonMessageConverter();
	}

}
