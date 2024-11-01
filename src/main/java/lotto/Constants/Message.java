package lotto.Constants;

public enum Message {
    PURCHASE_AMOUNT("구입금액을 입력해 주세요."),
    LOTTO_NUMBERS("당첨 번호를 입력해 주세요."),
    BONUS_NUMBER("보너스 번호를 입력해 주세요."),;

    private final String text;

    Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}