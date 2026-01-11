public class GatewayFactory {
    private static final GatewayFactory instance = new GatewayFactory();

    private GatewayFactory() {}

    public static GatewayFactory getInstance() {
        return instance;
    }

    public PaymentGateway getGateway(Gateway type) {
        if (type == Gateway.PAYTM) {
            PaymentGateway paymentGateway = new PaytmGateway();
            return new PaymentGatewayProxy(paymentGateway, 3);
        } else {
            PaymentGateway paymentGateway = new RazorPayGateway();
            return new PaymentGatewayProxy(paymentGateway, 1);
        }
    }
}
