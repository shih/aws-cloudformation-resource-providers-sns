package software.amazon.sns.topic;

public enum TopicAttributeName {
	DISPLAY_NAME("DisplayName"),
	TOPIC_ARN("TopicArn"),
	KMS_MASTER_KEY_ID("KmsMasterKeyId");

	private final String value;

	TopicAttributeName(String value) {
		this.value = value;
	}

	@Override
    public String toString() {
		return String.valueOf(this.value);
	}
}
