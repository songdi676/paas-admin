package nl.sri.devCloud.entity;

public class BasicPageRequestContentVo<T> extends BasicRequestContentVo<T> {

    private static PageInfo PAGE_INFO = new PageInfo();

    private PageInfo pageInfo;

    public PageInfo getPageInfo() {
        if (pageInfo == null) {
            pageInfo = PAGE_INFO;
        }
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}