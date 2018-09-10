package com.example.marmm.reminderdemo;

public class Reminder {

    private String mReminderText;

    @Override
    public String toString() {
        return mReminderText;
    }

    public String getmReminderText() {
        return mReminderText;
    }

    public void setmReminderText(String mReminderText) {
        this.mReminderText = mReminderText;
    }

    public Reminder(String mReminderText) {

        this.mReminderText = mReminderText;
    }
}
