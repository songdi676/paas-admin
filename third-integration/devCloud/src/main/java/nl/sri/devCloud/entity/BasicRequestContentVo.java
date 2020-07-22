package nl.sri.devCloud.entity;

import javax.validation.Valid;

public class BasicRequestContentVo<T> {

    @Valid
    private T params;

    public T getParams() {
        return params;
    }

    public void setParams(T params) {
        this.params = params;
    }
}

