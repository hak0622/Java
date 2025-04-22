package ch09.sec07.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(new Button.ClickListener(){
            public void onClick(){
                System.out.println("ok버튼을 클릭했습니다.");
            }
        });
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(new Button.ClickListener(){
            public void onClick(){
                System.out.println("cancel버튼을 클릭했습니다.");
            }
        });
        btnCancel.click();
    }
}
