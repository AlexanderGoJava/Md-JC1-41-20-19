package lesson_6;

public class Computer {

    private String typeOfPC;
    private String operationSystem;
    private String onAndOffStatus;
    private String onlineStatus;
    private String programRun;

    public Computer() {
    }

    public Computer(String typeOfPC, String operationSystem, String onAndOffStatus, String onlineStatus, String programRun) {
        this.typeOfPC = typeOfPC;
        this.operationSystem = operationSystem;
        this.onAndOffStatus = onAndOffStatus;
        this.onlineStatus = onlineStatus;
        this.programRun = programRun;
    }

    public String getTypeOfPC() {
        return typeOfPC;
    }

    public void setTypeOfPC(String typeOfPC) {

        //2. Create local class (pos. 2 of homework)
        class TypeOfPC {
            private final String smartPhone;

            public TypeOfPC(String smartPhone) {
                this.smartPhone = smartPhone;
            }

            public String getSmartPhone() {
                return smartPhone;
            }

        }
        this.typeOfPC = new TypeOfPC(typeOfPC).getSmartPhone();
        //end of local class
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getOnAndOffStatus() {
        return onAndOffStatus;
    }

    public void setOnAndOffStatus(String onAndOffStatus) {
        this.onAndOffStatus = onAndOffStatus;
    }

    public String getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public String getProgramRun() {
        return programRun;
    }

    public void setProgramRun(String programRun) {
        this.programRun = programRun;
    }

    static class PowerSupply {
        private static final String MANUFACTURED_COUNTRY = "USA";

        private String powerStatus;
        private String CPU;
        private String videoCard;
        private String RAM;
        private String SSD;

        public PowerSupply() {
        }

        PowerSupply(String powerStatus, String CPU, String videoCard, String RAM, String SSD) {
            this.powerStatus = powerStatus;
            this.CPU = CPU;
            this.videoCard = videoCard;
            this.RAM = RAM;
            this.SSD = SSD;
        }

        public static String getManufacturedCountry() {
            return MANUFACTURED_COUNTRY;
        }

        public String getPowerStatus() {
            return powerStatus;
        }

        public void setPowerStatus(String powerStatus) {
            this.powerStatus = powerStatus;
        }

        public String getCPU() {
            return CPU;
        }

        public void setCPU(String CPU) {
            this.CPU = CPU;
        }

        public String getVideoCard() {
            return videoCard;
        }

        public void setVideoCard(String videoCard) {
            this.videoCard = videoCard;
        }

        public String getRAM() {
            return RAM;
        }

        public void setRAM(String RAM) {
            this.RAM = RAM;
        }

        public String getSSD() {
            return SSD;
        }

        public void setSSD(String SSD) {
            this.SSD = SSD;
        }

        @Override
        public String toString() {
            return "PowerSupply{" +
                    "powerStatus='" + powerStatus + '\'' +
                    ", CPU='" + CPU + '\'' +
                    ", videoCard='" + videoCard + '\'' +
                    ", RAM='" + RAM + '\'' +
                    ", SSD='" + SSD + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "typeOfPC='" + typeOfPC + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                ", onAndOffStatus='" + onAndOffStatus + '\'' +
                ", onlineStatus='" + onlineStatus + '\'' +
                ", programRun='" + programRun + '\'' +
                '}';
    }

}
