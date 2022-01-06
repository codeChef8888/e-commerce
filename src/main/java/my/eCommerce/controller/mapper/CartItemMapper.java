//package my.eCommerce.controller.mapper;
//
//import java.util.List;
//
//import org.mapstruct.InheritInverseConfiguration;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.springframework.stereotype.Component;
//
//import my.eCommerce.dto.CartItemDto;
//import my.eCommerce.model.CartItem;
//
//@Component
//@Mapper(uses = ProductMapper.class, componentModel = "spring" )
//public interface CartItemMapper {
//	
//	List<CartItemDto> cartItemListToDto(List<CartItem> item);
//
//	@Mapping(target = "customerDto", ignore = true)
//	@Mapping(target = "productDto", ignore = true)
//	CartItemDto cartItemToDto(CartItem item);
//	 @InheritInverseConfiguration
//	CartItem dtoToCartItem(CartItemDto itemDto);
//
//}
