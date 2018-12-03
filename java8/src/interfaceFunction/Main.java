package interfaceFunction;

public class Main {
    public static void main(String[] parms){
//        Defaultable defaultable = DefaultableFactory.create( DefaultableImpl::new );
        Defaultable defaultable = new DefaultableImpl();
        System.out.println( defaultable.notRequired() );

        defaultable = DefaultableFactory.create( OverridableImpl::new );
        System.out.println( defaultable.notRequired() );
    }
}
