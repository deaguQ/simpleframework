package demo.pattern.proxy.impl;

import demo.pattern.proxy.ToCPayment;

public class AlipayToC implements ToCPayment {
    ToCPayment toCPayment;
    public AlipayToC(ToCPayment toCPayment){
        this.toCPayment = toCPayment;
    }
    @Override
    public void pay() {
        beforePay();
        toCPayment.pay();
        afterPay();
    }

    private void beforePay() {
        System.out.println("从招行取款");
    }
    private void afterPay() {
        System.out.println("支付给慕课网");
    }
}
