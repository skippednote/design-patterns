public class GrabStocks {
    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver stockObserver1 = new StockObserver(stockGrabber);
        StockObserver stockObserver2 = new StockObserver(stockGrabber);
        stockGrabber.unregister(stockObserver2);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(667.60);
        stockGrabber.setGOOGPrice(676.40);
    }
}