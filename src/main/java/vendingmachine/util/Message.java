package vendingmachine.util;

public enum Message {
    CHANGE_MESSAGE("잔돈\n"),
    CHANGE_AMOUNT_PREFIX("원 - "),
    CHANGE_AMOUNT_SUFFIX("개\n"),
    MACHINE_PREFIX("투입 금액: "),
    MACHINE_SUFFIX("구매할 상품을 입력해 주세요.");

    private final String message;

    Message(String message) {
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
