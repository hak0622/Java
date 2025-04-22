package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();
        class OkListener implements Button.ClickListener{
            public void onClick(){
                System.out.println("ok 버튼을 클릭하였습니다.");
            }
        }
        btnOk.setClickListener(new OkListener());
        btnOk.click();
    }
}
