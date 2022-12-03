package com.loki.lokiv2.util;

import org.springframework.stereotype.Component;

import com.loki.lokiv2.model.dto.PropertyDto;

@Component
public class PropertyUtil {
  
  public PropertyDto copyPropertyDto(PropertyDto propertyDto) {
    var propertyDtoCopy = new PropertyDto();
    propertyDtoCopy.setId(propertyDto.getId());
    propertyDtoCopy.setName(propertyDto.getName());
    propertyDtoCopy.setPropertyType(propertyDto.getPropertyType());
    propertyDtoCopy.setDescription(propertyDto.getDescription());
    propertyDtoCopy.setAddress(propertyDto.getAddress());
    propertyDtoCopy.setCity(propertyDto.getCity());
    propertyDtoCopy.setState(propertyDto.getState());
    propertyDtoCopy.setZip(propertyDto.getZip());
    propertyDtoCopy.setPhone(propertyDto.getPhone());
    propertyDtoCopy.setOwnerId(propertyDto.getOwnerId());
    return propertyDtoCopy;
  }
}
