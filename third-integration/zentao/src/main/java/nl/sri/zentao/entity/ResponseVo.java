package nl.sri.zentao.entity;

import nl.sri.zentao.entity.PageInfo;

public class ResponseVo<T> {

    private T content;

    private PageInfo pageInfo;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
