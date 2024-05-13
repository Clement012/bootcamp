public class BusinessException extends Exception { // Exception is a object -> have constructor

  private int code;

  private BusinessException(Syscode syscode){    // Encapsulation
    super(syscode.getDesc()); 
    this.code = syscode.getCode();
  }

  public static BusinessException of(Syscode syscode){   // Encapsulation
    if (syscode == null)
        throw new IllegalArgumentException();
      return new BusinessException(syscode);
  }
  public static void main(String[] args) throws BusinessException{
    Exception e = new Exception("login Fail");

    // Objective: 1000 -> Login Fail
    // 1001 -> Password Wrong 
    // 1002 -> user id not found
    BusinessException be = BusinessException.of(Syscode.LOGIN_FAIL);

    // be is a throwable
    throw be;
  }
}
