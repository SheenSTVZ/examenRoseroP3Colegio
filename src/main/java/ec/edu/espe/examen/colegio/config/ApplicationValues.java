package ec.edu.espe.examen.colegio.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ApplicationValues {
  private final String mongoHost;
  private final String mongoDB;
  private final String mongoAut;

  public ApplicationValues(
      @Value("${banquito.cmpaymentscollections.mongo.host}") String mongoHost,
      @Value("${banquito.cmpaymentscollections.mongo.db}") String mongoDB,
      @Value("${banquito.cmpaymentscollections.mongo.aut}") String mongoAut) {

    this.mongoHost = mongoHost;
    this.mongoDB = mongoDB;
    this.mongoAut = mongoAut;
  }
}
