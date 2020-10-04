package javayichang.Zidingyiyichang;

public class RegisterException extends Exception{

        //添加一个空参数的构造方法
        public RegisterException(){
        }

        //添加一个带异常信息的构造方法
        public RegisterException (String messsge){
            super(messsge);
        }

}
