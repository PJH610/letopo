package com.letopo.data.mapper;

import com.letopo.data.domain.GeneratorTableColumnDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public interface GeneratorMapper {

    public List<GeneratorTableColumnDO> listColumns(@Param("tableName") String tableName);

    public List<String> listTables();
}
