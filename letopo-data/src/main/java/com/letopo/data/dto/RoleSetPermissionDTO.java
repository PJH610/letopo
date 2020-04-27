package com.letopo.data.dto;

import lombok.Data;

import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class RoleSetPermissionDTO {

    private Long roleId;

    private List<String> permissions;

}
