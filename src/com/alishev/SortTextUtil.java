package com.alishev;

import java.util.List;

public class SortTextUtil {

    public static void sortData(List<Equipment> equipmentDetails) {
        equipmentDetails.sort(new EquipmentModelComparator());
    }
}
