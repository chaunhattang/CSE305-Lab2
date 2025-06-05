public class HighPriorityConcreteCreator extends RequestCreator {

    @Override
    public RequestProduct createRequest() {
        this.requestProduct = new HighPriorityConcrete();
        this.requestProduct.setExpireDay();
        this.requestProduct.setPriority();
        this.requestProduct.setStatus();
        return this.requestProduct;
    }

    @Override
    public boolean processRequest() {
        this.requestProduct.processRequest();
        return true;
    }

}
