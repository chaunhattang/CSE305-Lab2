public class MediumPriorityConcrete extends RequestProduct {

    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setExpireDay() {
        this.expireDay = "One month";
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public boolean processRequest() {
        System.out.println("Request accept, estimated completion date is " + this.expireDay);
        return true;
    }

}
