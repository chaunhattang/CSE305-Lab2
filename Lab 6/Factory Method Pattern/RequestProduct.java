public abstract class RequestProduct {
    protected String priority;
    protected String expireDay;
    protected String status;

    public abstract void setPriority();

    public abstract void setExpireDay();

    public abstract void setStatus();

    public abstract boolean processRequest();
}