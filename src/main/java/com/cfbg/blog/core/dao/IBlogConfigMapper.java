package com.cfbg.blog.core.dao;

import com.cfbg.blog.core.entity.BlogConfig;

import java.util.List;

public interface IBlogConfigMapper {
    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig record);
}
