public abstract class RequestCreator {
    protected RequestProduct requestProduct;

    public abstract RequestProduct createRequest();

    public abstract boolean processRequest();
}
