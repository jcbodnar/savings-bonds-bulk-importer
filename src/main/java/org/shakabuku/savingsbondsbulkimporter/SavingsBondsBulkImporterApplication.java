package org.shakabuku.savingsbondsbulkimporter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;

@SpringBootApplication
public class SavingsBondsBulkImporterApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SavingsBondsBulkImporterApplication.class, args);
	}

	@Override
	public void run(org.springframework.boot.ApplicationArguments args) {
	}
}
