package o2_enums;

public enum Season {
    WINTER {
        public String getHours() {
            return "winter hours";
        }
    },
    SPRING,
    SUMMER {
        public String getHours() {
            return "summer hours";
        }
    }, FALL {
        public String getHours() {
            return "autumn hours";
        }
    };

    public String getHours() {
        return "default";
    }

    ;
}
