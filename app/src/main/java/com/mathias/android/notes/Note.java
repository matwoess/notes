package com.mathias.android.notes;

/**
 * Created by Mathias.
 */
public class Note {
    private String _title;
    private String _text;
    private String _timestamp;

    public Note(String title, String text, String timestamp) {
        _title = title;
        _text = text;
        _timestamp = timestamp;
    }

    public String getTitle() {
        return _title;
    }

    public String getText() {
        return _text;
    }

    public String getTimestamp() {
        return _timestamp;
    }
}