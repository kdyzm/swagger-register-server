package com.kdyzm.swagger.register.server.controller.models;

import com.kdyzm.swagger.register.server.entity.GroupInfo;
import com.kdyzm.swagger.register.server.entity.SwaggerJson;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kdyzm
 * @date 2021/7/5
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterInfo {
    private SwaggerJson swaggerJson;
    private GroupInfo groupInfo;
}
