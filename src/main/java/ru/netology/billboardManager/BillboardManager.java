package ru.netology.billboardManager;

import ru.netology.domein.BillboardItem;

public class BillboardManager {
    private int billboardFilms;
    private BillboardItem[] items = new BillboardItem[0];


    public int getBillboardFilms() {
        return billboardFilms;
    }

    public BillboardManager(int billboardFilms) {
        this.billboardFilms = billboardFilms;
    }

    public BillboardManager() {
        billboardFilms = 10;
    }

    public void setBillboardFilms(int newBillboardFilm) {
        if (newBillboardFilm > billboardFilms) {
            return;
        }
        if (newBillboardFilm <= 0) {
            return;
        }
        billboardFilms = newBillboardFilm;
    }


    public void setSaveFilm(BillboardItem item) {
        BillboardItem[] tmp = new BillboardItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public BillboardItem[] getFindAll() {
        return items;
    }


    public BillboardItem[] getFindLast() {
        int resultLength;
        if (items.length < billboardFilms) {
            resultLength = items.length;
        } else {
            resultLength = billboardFilms;
        }
        BillboardItem[] tmp = new BillboardItem[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            ;
            tmp[i] = items[items.length - 1 - i];
        }
        return tmp;
    }
}
