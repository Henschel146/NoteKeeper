package com.lunguhenschel.notekeeper;

import android.provider.BaseColumns;

public final class NoteKeeperDatabaseContract implements BaseColumns {

    private NoteKeeperDatabaseContract(){}

    public static final class CourseInfoEntry{
        public static final String TABLE_NAME = "course_info";
        public static final String COLUMN_COURSE_ID = "course_id";
        public static final String COLUMN_COURSE_TITLE = "course_title";

        // CREATE TABLE course_info( course_id, course_title);

        public static final String SQL_CREATE_TABLE = String.format("CREATE TABLE %s(%d INTEGER PRIMARY KEY, %s TEXT UNIQUE NOT NULL,%s TEXT NOT NULL)",_ID,TABLE_NAME,COLUMN_COURSE_ID,COLUMN_COURSE_TITLE);

    }

    public static final class NoteInfoEntry{
        public static final String TABLE_NAME = "note_info";
        public static final String COLUMN_NOTE_TITLE = "note_title";
        public static final String COLUMN_NOTE_TEXT = "note_text";
        public static final String COLUMN_COURSE_ID = "course_id";

        // CREATE TABLE note_info( note_title, note_text,course_id);

        public static final String SQL_CREATE_TABLE = String.format("CREATE TABLE %s(%d INTEGER PRIMARY KEY, %s TEXT NOT NULL,%s,%s TEXT NOT NULL)",_ID,TABLE_NAME,COLUMN_NOTE_TITLE,COLUMN_NOTE_TEXT,COLUMN_COURSE_ID);

    }


}
