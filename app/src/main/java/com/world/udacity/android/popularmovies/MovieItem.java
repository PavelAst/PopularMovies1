package com.world.udacity.android.popularmovies;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieItem implements Parcelable {

    private int mId;
    private String mTitle;
    private double mVoteAverage;
    private String mPosterPath;
    private String mBackdropPath;
    private String mOverview;
    private String mReleaseDate;
    private int mRuntime;

    public MovieItem() {
        mId = 0;
        mTitle = "No title";
        mVoteAverage = 0;
        mPosterPath = "";
        mBackdropPath = "";
        mOverview = "No overview";
        mReleaseDate = "1900";
        mRuntime = 0;
    }

    public MovieItem(int id, String title, String posterPath, double voteAverage,
                     String backdropPath, int runtime, String overview, String releaseDate) {
        mId = id;
        mTitle = title;
        mVoteAverage = voteAverage;
        mPosterPath = posterPath;
        mBackdropPath = backdropPath;
        mOverview = overview;
        mReleaseDate = releaseDate;
        mRuntime = runtime;
    }

    protected MovieItem(Parcel in) {
        mId = in.readInt();
        mTitle = in.readString();
        mVoteAverage = in.readDouble();
        mPosterPath = in.readString();
        mBackdropPath = in.readString();
        mOverview = in.readString();
        mReleaseDate = in.readString();
        mRuntime = in.readInt();
    }

    public static final Creator<MovieItem> CREATOR = new Creator<MovieItem>() {
        @Override
        public MovieItem createFromParcel(Parcel in) {
            return new MovieItem(in);
        }

        @Override
        public MovieItem[] newArray(int size) {
            return new MovieItem[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(mId);
        out.writeString(mTitle);
        out.writeDouble(mVoteAverage);
        out.writeString(mPosterPath);
        out.writeString(mBackdropPath);
        out.writeString(mOverview);
        out.writeString(mReleaseDate);
        out.writeInt(mRuntime);
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public double getVoteAverage() {
        return mVoteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        mVoteAverage = voteAverage;
    }

    public String getPosterPath() {
        return mPosterPath;
    }

    public void setPosterPath(String posterPath) {
        mPosterPath = posterPath;
    }

    public String getBackdropPath() {
        return mBackdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        mBackdropPath = backdropPath;
    }

    public String getOverview() {
        return mOverview;
    }

    public void setOverview(String overview) {
        mOverview = overview;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        mReleaseDate = releaseDate;
    }

    public int getRuntime() {
        return mRuntime;
    }

    public void setRuntime(int runtime) {
        mRuntime = runtime;
    }

    public String getReleaseYear() {
        return mReleaseDate.substring(0, 4);
    }

    @Override
    public String toString() {
        return "Movie: " + mTitle;
    }

}
