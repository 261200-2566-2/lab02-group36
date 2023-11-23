public class AirPurifier {
    boolean power;
    String model;
    String serialNo;
    double price;
    double[] dimension = {0,0,0};
    boolean certified;
    int fanSpeed;
    double PMlevel;
    boolean filterClean;
    void turnOn() {
        power = true;
        System.out.println("The fan is on");
    }
    void turnOff() {
        power = false;
        System.out.println("The fan is off");
    }
    void approveCertified(){
        certified = true;
        System.out.println("This AirPurifier is approved");
    }
    void setFanSpeed(int fanSP){
        if(fanSP<1 || fanSP>3){
            System.out.println("There are only levels 1 to 3");
        }else {
            fanSpeed = fanSP;
            System.out.println("The fan speed is now level " + fanSP);
        }
    }
    void checkFilter(){
        if(filterClean == true){
            System.out.println("Filter is clean");
        }else{
            System.out.println("Filter is not clean");
        }
    }
    void cleanFilter(){
        filterClean = true;
    }
    void printModel(){
        System.out.println("Model: "+ model);
        System.out.println("SerialNumber: "+ serialNo);
        System.out.println("Price: "+price);
    }
    void printDimension(){
        System.out.println("Width: "+dimension[0]+", "+"Length: "+dimension[1]+", "+"Height: "+dimension[2]);
    }
    void checkAirQuality(){
        if(PMlevel<=50 && PMlevel>=0){
            System.out.println("Air quality is Good");
        }else if(PMlevel<=100 && PMlevel>=51){
            System.out.println("Air quality is Moderate");
        }else if(PMlevel<=150 && PMlevel>=101){
            System.out.println("Air quality is Unhealthy for Sensitive Group");
        }else if(PMlevel<=200 && PMlevel>=151){
            System.out.println("Air quality is Unhealthy");
        }else if(PMlevel<=300 && PMlevel>=201){
            System.out.println("Air quality is very Unhealthy");
        }else if(PMlevel>=301) {
            System.out.println("Air quality is Hazardous");
        }else{
            System.out.println("There is no quality for negative PMlevels");
        }
    }
    AirPurifier(String model,String serialNo,double price, double width,double length,double height){
        this.power = false;
        this.model = model;
        this.serialNo = serialNo;
        this.price = price;
        this.dimension[0] = width;
        this.dimension[1] = length;
        this.dimension[2] = height;
        this.certified = false;
        this.fanSpeed = 0;
        this.PMlevel = 0;
        this.filterClean = false;
    }

    static int totalAirpurifierWasMade=1;
    static void gettotalAirpurifierWasMade(){
        System.out.println(totalAirpurifierWasMade);
    };

    public static void main(String[] args){
        AirPurifier f = new AirPurifier("XiaoMiPro","PRC101",8999,10,10,10);
        f.turnOn();
        f.turnOff();
        f.approveCertified();
        f.setFanSpeed(3);
        f.checkFilter();
        f.cleanFilter();
        f.checkFilter();
        f.printModel();
        f.printDimension();
        f.setFanSpeed(0);
        f.checkAirQuality();
        f.PMlevel = -100;
        f.checkAirQuality();
        f.PMlevel = 1000;
        f.checkAirQuality();
        AirPurifier.gettotalAirpurifierWasMade();
    }

}
