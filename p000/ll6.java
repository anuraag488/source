package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ll6 extends AbstractC0894m2 {
    public static final Parcelable.Creator<ll6> CREATOR = new qo5((byte) 26);

    /* JADX INFO: renamed from: d */
    public final List f24141d;

    public ll6(ArrayList arrayList) {
        this.f24141d = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static ll6 m8036a(ch6... ch6VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(ch6VarArr[0].f16039a));
        return new ll6(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        List list = this.f24141d;
        if (list != null) {
            int iM9092Q2 = oh6.m9092Q(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            oh6.m9094S(parcel, iM9092Q2);
        }
        oh6.m9094S(parcel, iM9092Q);
    }
}
