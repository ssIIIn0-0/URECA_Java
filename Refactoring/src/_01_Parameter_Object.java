import java.util.Date;

public class _01_Parameter_Object {
    // Old
    static class CustomerOld{
        public int getOrderAmount(Date from, Date to) { return 0; }
        
        public int getCancelAmount(Date from, Date to) { return 0; }
        
        public int getCartAmount(Date from, Date to) {
            return 0;
        }
    }
    
    // New, 가독성, 유지보수, 기능 개선
    static class CustomerNew{
        public int getOrderAmount(FromTo fromto) { return 0; }
        
        public int getCancelAmount(FromTo fromto) { return 0; }
        
        public int getCartAmount(FromTo fromto) {
            return 0;
        }
    }
    
    static class FromTo{
    	Date from;
    	Date to;
    }
}
