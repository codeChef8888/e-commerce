package my.eCommerce.controller.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import my.eCommerce.dto.CartItemDto;
import my.eCommerce.model.CartItem;

@Component

@Mapper(uses = ProductMapper.class, componentModel = "spring")
public interface CartItemMapper {
	
	List<CartItemDto> cartItemListToDto(List<CartItem> item);


	CartItemDto cartItemToDto(CartItem item);
	
	CartItem dtoToCartItem(CartItemDto itemDto);
	


}
