package com.cfbg.blog.core.Service;

import com.cfbg.blog.core.controller.vo.BlogDetailVO;
import com.cfbg.blog.core.controller.vo.SimpleBlogListVO;
import com.cfbg.blog.core.entity.Blog;
import com.cfbg.blog.core.util.PageQueryUtil;
import com.cfbg.blog.core.util.PageResult;

import java.util.List;

/**
 *
 */
public interface BlogService {
    String saveBlog(Blog blog);
    PageResult getBlogsPage(PageQueryUtil pageQueryUtil);
    Boolean deleteBatch(Integer[] ids);
    int getTotalBlogs();
    /**
     * 根据id获取详情
     */
    Blog getBlogById(Long blogId);
    /**
     * 后台修改
     */
    String updateBlog(Blog blog);
    /**
     * 获取首页文章列表
     */
    PageResult getBlogsForIndexPage(int page);
    /**
     * 首页侧边栏数据列表
     * 0-点击最多
     * 1-最新发布
     */
    List<SimpleBlogListVO> getBlogListForIndexPage(int type);
    /**
     * 文章详情
     */
    BlogDetailVO getBlogDetail(Long blogId);
    /**
     * 根据标签获取文章列表
     */
    PageResult getBlogsPageByTag(String tagName,int page);
    /**
     * 根据分类获取文章列表
     */
    PageResult getBlogsPageByCategory(String category,int page);
    /**
     * 根据搜索获取文章列表
     */
    PageResult getBlogsPageBySearch(String keyword,int page);
    BlogDetailVO getBlogDetailBySubUrl(String subUrl);
}
