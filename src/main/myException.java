package main;

public class myException extends Exception{
    private String returnCode;
    private String returnMsg;
    public myException(){
        super();
    }
    public myException(String returnMsg){
        super(returnMsg);
        this.returnMsg = returnMsg;
    }
    public myException(String returnCode,String returnMsg){
        super();
        this.returnMsg = returnMsg;
        this.returnCode = returnCode;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }
}
