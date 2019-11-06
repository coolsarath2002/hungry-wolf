package com.hungrywolf.base.db.config;

public class MongoDBConfiguration {
	
}
	/*extends AbstractMongoConfiguration {
}

	private final List<Converter<?, ?>> converters = new ArrayList<Converter<?, ?>>();
	
	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "hunter-db";
	}

	
	@Override
	public MongoClient mongoClient() {
		// TODO Auto-generated method stub
		MongoClientOptions.Builder clientOptions = new MongoClientOptions.Builder();
	    clientOptions.minConnectionsPerHost(3);
	    clientOptions.connectionsPerHost(3);
		return new MongoClient("localhost");
	}

	@Override
    public String getMappingBasePackage() {
        return "com.hungrywolf";
    }
	
	@Override
    public MongoCustomConversions customConversions() {
        converters.add(new ZonedDateTimeReadConverter());
        converters.add(new ZonedDateTimeWriteConverter());
        return new MongoCustomConversions(converters);
    }
}
*/