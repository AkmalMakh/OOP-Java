package com.company.interfaces;

public class Main  {
    public static void main(String[] args) {
            ITelephone Akisphone;

            Akisphone = new DeskPhone(01027020026);
            Akisphone.powerOn();
            Akisphone.callPhone(01027020026);
            Akisphone.answer();

            Akisphone = new MobilePhone(2323);
            Akisphone.powerOn();
            Akisphone.callPhone(2323);
            Akisphone.answer();
    }
}
