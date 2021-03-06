package com.ringcentral.definitions;


public class GlipNoteInfo {
    /**
     * Internal identifier of a note
     */
    public String id;
    /**
     * Title of a note
     */
    public String title;
    /**
     * Internal identifiers of the chat(s) where the note is posted or shared.
     */
    public String[] chatIds;
    /**
     * Preview of a note (first 150 characters of a body)
     */
    public String preview;
    /**
     * Note creator information
     */
    public NoteCreatorInfo creator;
    /**
     * Note last modification information
     */
    public LastModifiedByInfo lastModifiedBy;
    /**
     * Returned for the note being edited (locked) at the current moment. Information on the user editing the note
     */
    public LockedByInfo lockedBy;
    /**
     * Note publishing status. Any note is created in 'Draft' status. After it is posted it becomes 'Active'
     * Enum: Active, Draft
     */
    public String status;
    /**
     * Creation time
     */
    public String creationTime;
    /**
     * Datetime of the note last update
     */
    public String lastModifiedTime;
    /**
     * Enum: Note
     */
    public String type;

    public GlipNoteInfo id(String id) {
        this.id = id;
        return this;
    }

    public GlipNoteInfo title(String title) {
        this.title = title;
        return this;
    }

    public GlipNoteInfo chatIds(String[] chatIds) {
        this.chatIds = chatIds;
        return this;
    }

    public GlipNoteInfo preview(String preview) {
        this.preview = preview;
        return this;
    }

    public GlipNoteInfo creator(NoteCreatorInfo creator) {
        this.creator = creator;
        return this;
    }

    public GlipNoteInfo lastModifiedBy(LastModifiedByInfo lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public GlipNoteInfo lockedBy(LockedByInfo lockedBy) {
        this.lockedBy = lockedBy;
        return this;
    }

    public GlipNoteInfo status(String status) {
        this.status = status;
        return this;
    }

    public GlipNoteInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipNoteInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public GlipNoteInfo type(String type) {
        this.type = type;
        return this;
    }

}
