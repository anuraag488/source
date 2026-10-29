package p000;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class av5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f14906a = 0;

    static {
        av5.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m3324a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m3325b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(c75.m3877i(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
