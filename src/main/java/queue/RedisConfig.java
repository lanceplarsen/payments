package queue;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.convert.RedisCustomConversions;

@Configuration
public class RedisConfig {

	@Autowired
	CreditCardToMapConverter creditCardToMapConverter;

	@Bean
	@ConditionalOnProperty(value = "app.encryption.enabled", havingValue = "true", matchIfMissing = false)
	public RedisCustomConversions redisCustomConversions() {
		return new RedisCustomConversions(Arrays.asList(creditCardToMapConverter));
	}

}
