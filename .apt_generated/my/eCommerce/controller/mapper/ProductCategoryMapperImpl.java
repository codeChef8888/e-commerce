package my.eCommerce.controller.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import my.eCommerce.dto.ProductCategoryDto;
import my.eCommerce.model.ProductCategory;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-06T00:43:47+0545",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.1 (Eclipse Adoptium)"
)
@Component
public class ProductCategoryMapperImpl implements ProductCategoryMapper {

    @Override
    public List<ProductCategoryDto> productCategoryListToDto(List<ProductCategory> category) {
        if ( category == null ) {
            return null;
        }

        List<ProductCategoryDto> list = new ArrayList<ProductCategoryDto>( category.size() );
        for ( ProductCategory productCategory : category ) {
            list.add( productCategoryToDto( productCategory ) );
        }

        return list;
    }

    @Override
    public ProductCategoryDto productCategoryToDto(ProductCategory category) {
        if ( category == null ) {
            return null;
        }

        ProductCategoryDto productCategoryDto = new ProductCategoryDto();

        productCategoryDto.setId( category.getId() );
        productCategoryDto.setCategoryName( category.getCategoryName() );

        return productCategoryDto;
    }

    @Override
    public ProductCategory DtoToProductCategory(ProductCategoryDto productCategoryDto) {
        if ( productCategoryDto == null ) {
            return null;
        }

        ProductCategory productCategory = new ProductCategory();

        productCategory.setId( productCategoryDto.getId() );
        productCategory.setCategoryName( productCategoryDto.getCategoryName() );

        return productCategory;
    }
}
