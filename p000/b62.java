package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b62 implements Parcelable {
    public static final Parcelable.Creator<b62> CREATOR = new C1280w4(7);

    /* JADX INFO: renamed from: a */
    public final IntentSender f15105a;

    /* JADX INFO: renamed from: b */
    public final Intent f15106b;

    /* JADX INFO: renamed from: c */
    public final int f15107c;

    /* JADX INFO: renamed from: d */
    public final int f15108d;

    public b62(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f15105a = intentSender;
        this.f15106b = intent;
        this.f15107c = i;
        this.f15108d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f15105a, i);
        parcel.writeParcelable(this.f15106b, i);
        parcel.writeInt(this.f15107c);
        parcel.writeInt(this.f15108d);
    }
}
