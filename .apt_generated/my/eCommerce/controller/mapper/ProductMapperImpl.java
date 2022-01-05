package my.eCommerce.controller.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import my.eCommerce.dto.ProductDto;
import my.eCommerce.model.Product;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-06T00:43:47+0545",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.1 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public List<ProductDto> productListToDto(List<Product> product) {
        if ( product == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( product.size() );
        for ( Product product1 : product ) {
            list.add( productToDto( product1 ) );
        }

        return list;
    }

    @Override
    public ProductDto productToDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        if ( product.getId() != null ) {
            productDto.setId( product.getId() );
        }
        productDto.setProductName( product.getProductName() );
        productDto.setPrice( product.getPrice() );
        productDto.setDescription( product.getDescription() );
        productDto.setAvailability( product.getAvailability() );
        productDto.setPictureUrl( product.getPictureUrl() );

        return productDto;
    }

    @Override
    public Product DtoToProduct(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productDto.getId() );
        product.setProductName( productDto.getProductName() );
        product.setPrice( productDto.getPrice() );
        product.setDescription( productDto.getDescription() );
        product.setAvailability( productDto.getAvailability() );
        product.setPictureUrl( productDto.getPictureUrl() );

        return product;
    }
}
