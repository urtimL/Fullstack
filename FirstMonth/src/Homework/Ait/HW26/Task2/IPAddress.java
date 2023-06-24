package Homework.Ait.HW26.Task2;

public class IPAddress {
    private int ip1;
    private int ip2;
    private int ip3;
    private int ip4;

    public IPAddress(String IP) {
        if(IP.length() != 12){
            System.out.println("не верное количество символов!");
            return;
        }

        String[] arrIPString = IP.split("-");

        int[] arrIPInt = new int[arrIPString.length];
        int k = 0;

        for (int i = 0; i < arrIPString.length; i++) {
            k = Integer.valueOf(arrIPString[i]);
            if(!(k >=0 && k <= 255)) {
                System.out.println("значения IP адресса должно быть в диапазоне от 0 до 255!");
                return;
            }

            arrIPInt[i] = k;
        }

        this.ip1 = arrIPInt[0];
        this.ip2 = arrIPInt[1];
        this.ip3 = arrIPInt[2];
        this.ip4 = arrIPInt[3];
    }

    public int getIp1() {
        return ip1;
    }

    public int getIp2() {
        return ip2;
    }

    public int getIp3() {
        return ip3;
    }

    public int getIp4() {
        return ip4;
    }

    @Override
    public String toString() {
        return "IPAddress{" +
                "ip1 = " + ip1 +
                ", ip2 = " + ip2 +
                ", ip3 = " + ip3 +
                ", ip4 = " + ip4 +
                '}';
    }
}
