package fn3s.java.spring.netflixzuulapigatewayserver.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("netflix-zuul-api-gateway-server")
public class Configuration {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
