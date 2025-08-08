package com.extractor.unraveldocs.user.mapper;

import com.extractor.unraveldocs.user.dto.request.ChangePasswordDto;
import com.extractor.unraveldocs.user.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(ChangePasswordDto request);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "oldPassword", target = "oldPassword")
    @Mapping(source = "newPassword", target = "newPassword")
    @Mapping(source = "confirmNewPassword", target = "confirmNewPassword")

    ChangePasswordDto toDto(User user);
}
