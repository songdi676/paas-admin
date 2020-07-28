package nl.sri.zentao.entity;

public class PageInfo {

    private Integer pageNum = 1;

    private Integer pageSize = 10;

    private Integer total;

    public PageInfo(){}

    public PageInfo(Integer pageNum, Integer pageSize, Integer total){
        this.pageNum = pageNum;
        this.pageNum = pageSize;
        this.total = total;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        pageSize = pageSize;
    }
}
