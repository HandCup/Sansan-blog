package com.cfbg.blog.core.Service;

import com.cfbg.blog.core.entity.BlogTagCount;
import com.cfbg.blog.core.util.PageQueryUtil;
import com.cfbg.blog.core.util.PageResult;

import java.util.List;

public interface TagService {
    /**
     * 查询标签的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    int getTotalTags();

    Boolean saveTag(String tagName);

    Boolean deleteBatch(Integer[] ids);

    List<BlogTagCount> getBlogTagCountForIndex();
}
