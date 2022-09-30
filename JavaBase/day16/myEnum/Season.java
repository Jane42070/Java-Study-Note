package JavaBase.day16.myEnum;

/**
 * @author qilin
 */

public enum Season {
    // 春夏秋冬
    SPRING("春") {
        @Override
        public String getName() {
            return this.name;
        }
    },
    SUMMER("夏") {
        @Override
        public String getName() {
            return null;
        }
    },
    AUTUMN("秋") {
        @Override
        public String getName() {
            return null;
        }
    },
    WINTER("冬") {
        @Override
        public String getName() {
            return null;
        }
    };

    public String name;

    Season() {

    }

    Season(String name) {
        this.name = name;
    }

    public abstract String getName();
}
