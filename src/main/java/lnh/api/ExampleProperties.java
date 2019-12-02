package lnh.api;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "lnh.example")
@Getter
@Setter
public class ExampleProperties{
  private String a = "java hard code";
  private String b = "java hard code";
  private String c = "java hard code";
  private String d = "java hard code";
}
