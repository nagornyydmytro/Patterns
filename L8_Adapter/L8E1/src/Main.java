package L8_Adapter.L8E1.src;

import com.mobile.Legacy.Charger;
import com.mobile.Legacy.MobilePhone;

public class Main {

    public static void main(String[] args) {
        Charger charger = new Charger(5.0f, 1.0f);

        System.out.println("\n============= MicroUsb ==============\n");
        MobilePhone phone = new MobilePhone();
        phone.charge(20);
        phone.pluginCharger(charger);
        phone.charge(20);
        phone.unplugCharger();
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());

        System.out.println("\n============= Type-C ==============\n");
        FastCharge fastCharge = new FastCharge(18);

        SamsungS samsung = new SamsungS();
        samsung.makeCall();
        samsung.pluginCharger(fastCharge);
        samsung.charge(30);
        samsung.unplugCharger();
        printBatteryStatus(samsung);
        samsung.makeCall();
        printBatteryStatus(samsung);
        samsung.charge(10);
        samsung.unplugCharger();
        printBatteryStatus(samsung);

        System.out.println("\n============= Adapter: composition ==============\n");
        SamsungS samsungWithCompositionAdapter = new SamsungS();
        samsungWithCompositionAdapter.makeCall();
        TypeCCharger adapterMicroUsbToTypeC = new AdapterMicroUsbToTypeC(charger);
        samsungWithCompositionAdapter.pluginCharger(adapterMicroUsbToTypeC);
        samsungWithCompositionAdapter.charge(30);
        samsungWithCompositionAdapter.unplugCharger();
        printBatteryStatus(samsungWithCompositionAdapter);

        System.out.println("\n============= Adapter: inheritance ==============\n");
        SamsungS samsungWithInheritanceAdapter = new SamsungS();
        samsungWithInheritanceAdapter.makeCall();
        TypeCCharger adapterMicroUsbToTypeCInheritance =
                new AdapterMicroUsbToTypeCInheritance(5.0f, 1.0f);
        samsungWithInheritanceAdapter.pluginCharger(adapterMicroUsbToTypeCInheritance);
        samsungWithInheritanceAdapter.charge(30);
        samsungWithInheritanceAdapter.unplugCharger();
        printBatteryStatus(samsungWithInheritanceAdapter);
    }

    private static void printBatteryStatus(SamsungS phone){
        System.out.printf("Current battery status = %s%n", phone.getChargingPercent());
    }

}