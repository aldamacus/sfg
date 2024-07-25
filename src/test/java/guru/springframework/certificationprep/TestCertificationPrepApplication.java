package guru.springframework.certificationprep;

import org.springframework.boot.SpringApplication;

public class TestCertificationPrepApplication {

    public static void main(String[] args) {
        SpringApplication.from(CertificationPrepApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
