package cardealer.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppBeanConfig {

    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
