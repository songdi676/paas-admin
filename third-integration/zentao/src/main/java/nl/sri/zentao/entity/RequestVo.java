package nl.sri.zentao.entity;

public class RequestVo<T> {

    private T params;

    private PageInfo pageInfo;

    public T getParams() {
        return params;
    }

    public void setParams(T params) {
        this.params = params;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
