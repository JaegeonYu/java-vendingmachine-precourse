package vendingmachine.view;

public class OutputView {
    public void askPricePrint(){
       printMessage("자판기가 보유하고 있는 금액을 입력해 주세요.");
    }
    public void askProductPrint(){
        printMessage("상품가격과 가격, 수량을 입력해 주세요.");
    }
    public void askInputPricePrint(){
        printMessage("투입 금액을 입력해 주세요.");
    }
    public void askBuyProductPrint(int hasPrice){
        StringBuilder print = new StringBuilder("투입 금액: "+hasPrice+"원\n");
        print.append("구매할 상품명을 입력해 주세요.\n");
        printMessage(print.toString());
    }
    public void printMessage(String input){
        System.out.println(input);
    }
}
