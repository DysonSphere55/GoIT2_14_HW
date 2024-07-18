package com.goit.GoIT2_HW_14.note;

public class NoteNotFoundException extends Exception {
    public NoteNotFoundException() {
        super("Note not found");
    }
}
