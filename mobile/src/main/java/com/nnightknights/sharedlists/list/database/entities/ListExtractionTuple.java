package com.nnightknights.sharedlists.list.database.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;

import com.nnightknights.sharedlists.list.database.ListI;

import java.util.Date;

public class ListExtractionTuple implements ListI {
    @PrimaryKey
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "title", index = true)
    private String title;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "icon")
    private String iconPath;

    @ColumnInfo(name = "cover")
    private String coverPath;

    @ColumnInfo(name = "tags")
    private String tags;

    @ColumnInfo(name = "date_created", index = true)
    private Date dateCreated;

    @ColumnInfo(name = "date_updated", index = true)
    private Date dateUpdated;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public boolean equals(Object object){
        if (object instanceof ListTuple){
            ListTuple listTuple = (ListTuple) object;

            return listTuple.getId() == getId()
                    && listTuple.getTitle().equals(getTitle())
                    && listTuple.getDescription().equals(getDescription())
                    && listTuple.getIconPath().equals(getIconPath())
                    && listTuple.getCoverPath().equals(getCoverPath())
                    && listTuple.getTags().equals(getTags())
                    && listTuple.getDateCreated().equals(getDateCreated())
                    && listTuple.getDateUpdated().equals(getDateUpdated());
        }
        return false;
    }
}
