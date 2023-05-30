package com.ArifFirdaus_10120074_IF2;

import android.database.Cursor;

import com.ArifFirdaus_10120074_IF2.model.Note;

/**
 * NAMA    : Arif Firdaus
 * NIM     : 10120074
 * Kelas   : IF-2
 * MatKul  : Aplikasi Komputasi Bergerak
 * Pengganti UTS AKB
 */
public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

