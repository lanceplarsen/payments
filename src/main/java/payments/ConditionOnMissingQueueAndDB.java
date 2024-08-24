package payments;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

import payments.controller.DBPaymentController;
import payments.controller.RedisPaymentController;

public class ConditionOnMissingQueueAndDB extends AllNestedConditions {

	ConditionOnMissingQueueAndDB() {

		super(ConfigurationPhase.REGISTER_BEAN);
	}

	@ConditionalOnMissingBean(DBPaymentController.class)
	static class OnMissingQueue {
	}

	@ConditionalOnMissingBean(RedisPaymentController.class)
	static class OnMissingDB {
	}
}
