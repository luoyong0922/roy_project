package interfaceFunction;

public class OverridableImpl implements Defaultable{
    @Override
    public String notRequired() {
        return "Overridden implementation";
    }
}
