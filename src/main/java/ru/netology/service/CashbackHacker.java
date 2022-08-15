package ru.netology.service;

public class CashbackHacker {
    private final int boundary = 1000;

    public int remain(int amount) {
        int x = amount % boundary;
        return boundary - x;
    }
}
