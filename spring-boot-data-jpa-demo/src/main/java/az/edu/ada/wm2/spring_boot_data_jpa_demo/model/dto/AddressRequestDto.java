package az.edu.ada.wm2.spring_boot_data_jpa_demo.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressRequestDto {
    private String street;
    private String city;
    private String country;
}
