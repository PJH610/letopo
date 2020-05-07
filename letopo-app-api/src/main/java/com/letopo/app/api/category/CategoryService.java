package com.letopo.app.api.category;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.annotation.param.NotNull;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.CategoryDTO;

import java.util.List;

/**
 * Created by rize on 2019/7/2.
 */
@HttpOpenApi(group = "category", description = "类目服务")
public interface CategoryService {

    @HttpMethod(description = "获取类目列表")
    public List<CategoryDTO> categoryList() throws ServiceException;

    @HttpMethod(description = "获取分类父节点")
    public List<Long> getCategoryFamily(
            @NotNull @HttpParam(name = "categoryId", type = HttpParamType.COMMON, description = "类目Id") Long categoryId) throws ServiceException;

}
