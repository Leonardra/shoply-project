package com.ecommerce.shoply.service.mapper;

import com.ecommerce.shoply.data.dto.ProductUpdateForm;
import com.ecommerce.shoply.data.model.Product;
import org.mapstruct.*;

@Mapper(componentModel="spring")
public interface ProductMapper {

    @BeanMapping(nullValuePropertyMappingStrategy =  NullValuePropertyMappingStrategy.IGNORE)
    void mapDtoTOProduct(ProductUpdateForm productDto,
                         @MappingTarget Product product);
}
