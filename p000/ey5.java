package p000;

import android.os.BadParcelableException;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ey5 extends mh5 {

    /* JADX INFO: renamed from: j */
    public dm6 f18585j;

    @Override // p000.mh5
    /* JADX INFO: renamed from: E */
    public final boolean mo5422E(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        int i3 = dr5.f17310a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(c75.m3877i(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        this.f18585j.m4562a(Integer.valueOf(i2));
        return true;
    }
}
