package com.letopo.admin.api.tools;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.annotation.param.NotNull;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.CodeReverseGenerateDTO;
import com.letopo.data.dto.CodeReverseGenerateTableDTO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: 代码生成器、现在主要是逆向生成 Admin 的常用CRUD。
 * Attention: 要使用此功能，请保证letopo的项目结构不要变。否则文件将保存进错误的地址！
 * User: jh
 * Date: 2020/04/26
 * Time: 10:40
 */
@HttpOpenApi(group = "admin.generator", description = "生成器服务")
public interface GeneratorService {

    @HttpMethod(description = "列出表")
    public List<CodeReverseGenerateTableDTO> listTable(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员Id") Long adminId) throws ServiceException;

    @HttpMethod(description = "加载列")
    public List<CodeReverseGenerateDTO.ColumnDefinition> loadColumns(
            @NotNull @HttpParam(name = "tableName", type = HttpParamType.COMMON, description = "加载DB列") String tableName,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员Id") Long adminId) throws ServiceException;

    @HttpMethod(description = "生成")
    public String generate(
            @NotNull @HttpParam(name = "generateDTO", type = HttpParamType.COMMON, description = "生成器模型") CodeReverseGenerateDTO generateDTO,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员Id") Long adminId) throws ServiceException;

}
