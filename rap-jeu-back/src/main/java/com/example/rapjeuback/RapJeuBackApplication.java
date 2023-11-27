package com.example.rapjeuback;

import com.example.rapjeuback.services.GameService;
import com.example.rapjeuback.services.RapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.rapjeuback.models")
public class RapJeuBackApplication {
    @Autowired
    public RapJeuBackApplication(GameService service) {
        System.out.println("coucou"+service.findBestGames());

    }
    public static void main(String[] args) {
        SpringApplication.run(RapJeuBackApplication.class, args);
    }

}
