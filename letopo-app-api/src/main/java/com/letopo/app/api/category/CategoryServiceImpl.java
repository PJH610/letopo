package com.letopo.app.api.category;

import com.letopo.biz.service.category.CategoryBizService;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rize on 2019/7/2.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryBizService categoryBizService;

    @Override
    public List<CategoryDTO> categoryList() throws ServiceException {
        return categoryBizService.categoryList();
    }

    /**
     * @param categoryId
     * @return
     * @throws ServiceException
     */
    @Override
    public List<Long> getCategoryFamily(Long categoryId) throws ServiceException {
        return categoryBizService.getCategoryFamily(categoryId);
    }
}
