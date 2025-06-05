public class HighPriorityConcrete extends RequestProduct {

    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setExpireDay() {
        this.expireDay = "Current day";
    }

    @Override
    public void setStatus() {
        this.status = "Accept";
    }

    @Override
    public boolean processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
        return true;
    }

}
