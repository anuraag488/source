package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ol6 extends AbstractC0894m2 {
    public static final Parcelable.Creator<ol6> CREATOR = new qo5(27);

    /* JADX INFO: renamed from: d */
    public final List f26869d;

    public ol6(ArrayList arrayList) {
        this.f26869d = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9090O(parcel, 1, this.f26869d);
        oh6.m9094S(parcel, iM9092Q);
    }
}
