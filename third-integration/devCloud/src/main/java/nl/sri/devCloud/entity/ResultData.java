package nl.sri.devCloud.entity;

public class ResultData<T> {

    private T data;

    private PageInfo pageInfo;

    public ResultData(){
    }

    public ResultData(T data,PageInfo pageInfo){
        this.data = data;
        this.pageInfo = pageInfo;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
