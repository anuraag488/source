package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bq5 extends AbstractC0894m2 {
    public static final Parcelable.Creator<bq5> CREATOR = new qo5((byte) 4);

    /* JADX INFO: renamed from: d */
    public final Bundle f15508d;

    public bq5(Bundle bundle) {
        this.f15508d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9084I(parcel, 1, this.f15508d);
        oh6.m9094S(parcel, iM9092Q);
    }
}
