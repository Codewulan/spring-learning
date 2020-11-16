package com.paige.api.bean;

/**
 * REST接口返回类型
 *
 * @author paige
 * @create 2020-09-20 19:48
 */
public class Response {

    private static final String MSG_OK = "ok";
    private static final String MSG_ERROR = "error";

    private Meta meta;
    private Object data;

    public Response success() {
        this.meta = new Meta(true, MSG_OK);
        return this;
    }

    public Response success(Object data) {
        this.meta = new Meta(true, MSG_OK);
        this.data = data;
        return this;
    }

    public Response failure() {
        this.meta = new Meta(false, MSG_ERROR);
        return this;
    }

    public Response failure(String message) {
        this.meta = new Meta(false, message);
        return this;
    }

    public Meta getMeta() {
        return this.meta;
    }

    public Object getData() {
        return data;
    }


    public class Meta {

        private boolean success;
        private String message;

        public Meta(boolean success) {
            this.success = success;
        }

        public Meta(boolean success, String message) {
            this.success = success;
            this.message = message;
        }

        public boolean isSuccess() {
            return this.success;
        }

        public String getMessage() {
            return this.message;
        }
    }
}