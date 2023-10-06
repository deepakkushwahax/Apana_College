public class Access_modifies {

    public void main(String[] args) {
        BankAccout MyAcc = new BankAccout();
        MyAcc.UserName = "deepakkushwahax";
        MyAcc.setPassword("codex");
    }

    class BankAccout{
        public  String UserName;
         private String password;

         public void setPassword(String pwd){
             password = pwd;
         }

    }
}
