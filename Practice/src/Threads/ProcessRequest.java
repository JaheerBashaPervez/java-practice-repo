package Threads;

import java.util.Objects;

public class ProcessRequest {

    private int requestID;
    private String requestStatus;

    public ProcessRequest(int requestID, String requestStatus) {
        this.requestID = requestID;
        this.requestStatus = requestStatus;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessRequest that = (ProcessRequest) o;
        return requestID == that.requestID && Objects.equals(requestStatus, that.requestStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestID, requestStatus);
    }
}
