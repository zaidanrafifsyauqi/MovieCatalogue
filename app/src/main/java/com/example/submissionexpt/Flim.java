package com.example.submissionexpt;

import android.os.Parcel;
import android.os.Parcelable;

public class Flim implements Parcelable {
    private String name;
    private String detail;

    protected Flim(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Flim> CREATOR = new Creator<Flim>() {
        @Override
        public Flim createFromParcel(Parcel in) {
            return new Flim(in);
        }

       @Override
        public Flim[] newArray(int size){
            return new Flim[size];
       }
    };

    public Flim() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {

        this.photo = photo;
    }

    private int photo;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(detail);
        parcel.writeInt(photo);
    }
}

