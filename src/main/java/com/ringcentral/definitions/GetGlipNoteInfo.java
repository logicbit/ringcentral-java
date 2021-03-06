package com.ringcentral.definitions;


public class GetGlipNoteInfo {
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
     * Text of a note
     */
    public String body;
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

    public GetGlipNoteInfo id(String id) {
        this.id = id;
        return this;
    }

    public GetGlipNoteInfo title(String title) {
        this.title = title;
        return this;
    }

    public GetGlipNoteInfo chatIds(String[] chatIds) {
        this.chatIds = chatIds;
        return this;
    }

    public GetGlipNoteInfo preview(String preview) {
        this.preview = preview;
        return this;
    }

    public GetGlipNoteInfo body(String body) {
        this.body = body;
        return this;
    }

    public GetGlipNoteInfo creator(NoteCreatorInfo creator) {
        this.creator = creator;
        return this;
    }

    public GetGlipNoteInfo lastModifiedBy(LastModifiedByInfo lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public GetGlipNoteInfo lockedBy(LockedByInfo lockedBy) {
        this.lockedBy = lockedBy;
        return this;
    }

    public GetGlipNoteInfo status(String status) {
        this.status = status;
        return this;
    }

    public GetGlipNoteInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GetGlipNoteInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public GetGlipNoteInfo type(String type) {
        this.type = type;
        return this;
    }

}
