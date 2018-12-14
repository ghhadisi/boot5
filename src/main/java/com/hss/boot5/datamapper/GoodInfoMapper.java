package com.hss.boot5.datamapper;

import com.hss.boot5.bean.GoodInfoBean;
import com.hss.boot5.bean.GoodTypeBean;
import com.hss.boot5.dto.GoodInfoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface GoodInfoMapper {

    @Mappings({
            @Mapping(source = "type.name", target = "typeName"),
            @Mapping(source = "good.id",target = "goodId"),
            @Mapping(source = "good.title",target = "goodName"),
            @Mapping(source = "good.price",target = "goodPrice")
    })
    public GoodInfoDTO from(GoodInfoBean good, GoodTypeBean type);
}
