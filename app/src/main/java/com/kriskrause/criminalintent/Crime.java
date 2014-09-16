package com.kriskrause.criminalintent;

import java.util.UUID;

public class Crime {
    public UUID get_id() {
        return _id;
    }

    private UUID _id;

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    private String _title;

    public Crime() {
        _id = UUID.randomUUID();
    }
}
