package J120_lab1_1;

import java.util.Objects;

public class TelephoneNumber {

    private String regionCode;
    private String localNumber;

    public void setRegionCode(String regionCode) {
        if (regionCode.matches("-?\\d{3,4}")){
            this.regionCode = regionCode;
        } else {
            throw new IllegalArgumentException ("Неверный формат кода региона");
        }
    }

    public void setLocalNumber(String localNumber) {
        if (localNumber.matches("-?\\d{6,7}")) {
            this.localNumber = localNumber;
        }else {
            throw new IllegalArgumentException ("Неверный формат номера");
        }
    }

    public TelephoneNumber(String regionCode, String localNumber) {
        setRegionCode(regionCode);
        setLocalNumber(localNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int numberLength = localNumber.length();
        sb.append("(").append(regionCode).append(")");
        sb.append(localNumber.substring(0, (numberLength - 4))).append("-")
                .append(localNumber.substring((numberLength - 4), (numberLength - 2))).append("-")
                .append(localNumber.substring((numberLength - 2), numberLength));
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneNumber that = (TelephoneNumber) o;
        return regionCode.equals(that.regionCode) && localNumber.equals(that.localNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionCode, localNumber);
    }
}