package guru.springfamework.api.v1.model;

import guru.springframework.model.CustomerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class CustomerListDTO1 {
    List<CustomerDTO> customers;
}
