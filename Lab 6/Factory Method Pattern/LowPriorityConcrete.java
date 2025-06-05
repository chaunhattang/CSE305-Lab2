public class LowPriorityConcrete extends RequestProduct {

    @Override
    public void setPriority() {
        this.priority = "Ignore";
    }

    @Override
    public void setExpireDay() {
        this.expireDay = "Current day";
    }

    @Override
    public void setStatus() {
        this.status = "Done";
    }

    @Override
    public boolean processRequest() {
        System.out.println("Request denied");
        return true;
    }

}
