package com.example.order_service;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "orderdb";
    }

    @Override
    @Bean
    public MongoClient mongoClient() {
        // HARDCODED: We point directly to the Docker Service name "mongodb"
        // This overrides all application.properties and defaults.
        ConnectionString connectionString = new ConnectionString("mongodb://mongodb:27017/orderdb");

        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        return MongoClients.create(mongoClientSettings);
    }
}