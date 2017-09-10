package star.share.util;

import java.util.List;

public class ResultInfo {
    public static final int SUCCESS = 1;
    public static final int FAIL = 2;
    public static final String EXISTED = "EXISTED";
    public static final String NOT_FOUND = "NOT_FOUND";
    public static final String BAD_INPUT = "BAD_INPUT";

    private int key;
    private String message;
    private List<Object> data;

    public ResultInfo() {

    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }


}
