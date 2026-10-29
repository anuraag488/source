package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cm5 extends AbstractC0894m2 {
    public static final Parcelable.Creator<cm5> CREATOR = new C1280w4((byte) 21);

    /* JADX INFO: renamed from: d */
    public ArrayList f16129d;

    /* JADX INFO: renamed from: e */
    public String f16130e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.f16129d;
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        if (arrayList != null) {
            int iM9092Q2 = oh6.m9092Q(parcel, 1);
            parcel.writeStringList(arrayList);
            oh6.m9094S(parcel, iM9092Q2);
        }
        oh6.m9088M(parcel, 2, this.f16130e);
        oh6.m9094S(parcel, iM9092Q);
    }
}
