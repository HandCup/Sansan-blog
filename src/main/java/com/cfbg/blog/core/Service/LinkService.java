package com.cfbg.blog.core.Service;

import com.cfbg.blog.core.entity.BlogLink;
import com.cfbg.blog.core.util.PageQueryUtil;
import com.cfbg.blog.core.util.PageResult;

import java.util.List;
import java.util.Map;

public interface LinkService {
    /**
     * 查询友链的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogLinkPage(PageQueryUtil pageUtil);

    int getTotalLinks();

    Boolean saveLink(BlogLink link);

    BlogLink selectById(Integer id);

    Boolean updateLink(BlogLink tempLink);

    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回友链页面所需的所有数据
     *
     * @return
     */
    Map<Byte, List<BlogLink>> getLinksForLinkPage();
}
