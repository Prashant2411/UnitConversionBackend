package com.bridgelabz.quantity.services;

import com.bridgelabz.quantity.dto.ValueAndUnitDTO;

public interface IUnitConversionService {
    double convertValue(ValueAndUnitDTO first, ValueAndUnitDTO second);
    String getUnitType();
    String getUnits(String unitType);
}
