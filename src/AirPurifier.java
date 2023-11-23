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
/*
1.1what should be instance variables?
        =   boolean power;
        String model;
        String serialNo;
        double price;
        double[] dimension = {0,0,0};
        boolean certified;
        int fanSpeed;
        double PMlevel;
        boolean filterClean;
1.2what should be instance methods?
        =   turnOn();
        turnOff();
        approveCertified();
        setFanSpeed(int fanSP);
        checkFilter();
        cleanFilter();
        printModel();
        printDimension();
        checkAirQuality();
1.3what should be class variables?
        =   static int totalAirpurifierWasMade=1;
1.4what should be class methods?
        =   static void gettotalAirpurifierWasMade();
2.1for each method proposed above, how do you plan to implement it?
   give an overview of the computation
   what's needed as inputs?
   what's to be returned?
        =2.1.1method turnOn();,turnOff(); จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะเซ็ตค่าpowerให้เป็นtrue/falseและจะprintออกมาว่าเครื่องเปิดหรือปิด
        =2.1.2method approveCertified();  จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะsetค่าcertifiedเป็นtrueและจะprintออกมาว่าได้รับการapprovedแล้ว
        =2.1.3method setFanSpeed(int fanSP); จะรับinputค่าintเข้ามาแต่จะไม่มีoutputออกไปโดยเมื่อค่าintอยู่ระหว่าง1-3ก็จะเซ็ตค่าfanSpeedให้มีค่าตามค่าintและprintออกมาว่าตอนนี้ค่าfanSpeedอยู่ที่levelไหนแต่ถ้าค่าintไม่อยู่ระหว่าง1-3ก็จะprintออกมาว่าlevel 1-3 เท่านั้น
        =2.1.4method checkFilter(); จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะเช็คว่าfilterสะอาดไหมโดยจะดูค่าfilterCleanว่าเป็นtrueไหมถ้าเป็นtrueจะprintออกมาว่าfilterนี้สะอาดแต่ถ้าค่าไม่ใช่trueจะprintออกมาว่าfilterนี้ไม่สะอาด
        =2.1.5method cleanFilter(); จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะเซ็ตให้ค่าfilterCleanเป็นtrue
        =2.1.6method printModel(); จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะprintค่าmodel,serialNoและprice
        =2.1.7method printDimension(); จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะprintค่าความกว้าง,ความยาว,ความสูง
        =2.1.8method checkAirQuality(); จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะprintค่าออกมาให้ดูว่าตอนนี้คุณภาพอากาศเป็นอย่างไรโดยเทียบจากค่าPMlevelว่าอยู่ในช่วงไหนก็จะprintออกมาตามช่วงนั้น
        =2.1.9method gettotalAirpurifierWasMade(); จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะprintค่าออกมาให้ดูว่าโรงงานผลิตเครื่องAirpurifierไปกี่ตัวแล้ว/*
