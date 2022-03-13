package police_Department_transport_of_chanh.utils;

public class NotFoundVehicelException extends Exception{
    @Override
    public String getMessage() {
        return "biển kiểm soát không tìm thấy";
    }
}
