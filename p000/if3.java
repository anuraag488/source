package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class if3 implements Parcelable {
    public static final Parcelable.Creator<if3> CREATOR = new qo5((byte) 22);

    /* JADX INFO: renamed from: a */
    public String f21339a;

    /* JADX INFO: renamed from: b */
    public String f21340b;

    /* JADX INFO: renamed from: c */
    public IBinder f21341c;

    /* JADX INFO: renamed from: d */
    public Bundle f21342d;

    public if3(String str, String str2, IBinder iBinder) {
        this.f21339a = str;
        Objects.requireNonNull(str2, "url cannot be null");
        this.f21340b = str2;
        this.f21341c = iBinder;
        this.f21342d = Bundle.EMPTY;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21339a);
        parcel.writeString(this.f21340b);
        IBinder iBinder = this.f21341c;
        if (iBinder != null) {
            parcel.writeByte((byte) 1);
            parcel.writeStrongBinder(iBinder);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeBundle(this.f21342d);
    }
}
