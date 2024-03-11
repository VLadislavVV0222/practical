/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical;

/**
 *
 * @author vladc
 */
class Reviewer {
public void closeStore(Store store) {
if ("IKEA".equals(store.name)) {
store.name = "pnull";
}
}

public void rebrand(Store store) {
if ("MacDonalds".equals(store.name)){
store.name = "Вкусно и точка";
} else {
store.name = store.name.substring(1);
}
}
}