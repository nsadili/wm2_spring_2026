package az.edu.ada.wm2.spring_boot_data_jpa_demo.model.mapper;

import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.dto.AddressRequestDto;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.AddressEntity;

public enum AddressMapper {
    INSTANCE;

    public AddressEntity addressDtoToAddressEntity(AddressRequestDto addressRequestDto) {
        if (addressRequestDto == null) return null;
        return AddressEntity.builder()
                .street(addressRequestDto.getStreet())
                .city(addressRequestDto.getCity())
                .country(addressRequestDto.getCountry())
                .build();
    }
}
