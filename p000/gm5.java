package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gm5 extends AbstractC0894m2 {
    public static final Parcelable.Creator<gm5> CREATOR = new C1280w4((byte) 22);

    /* JADX INFO: renamed from: d */
    public final int f19886d;

    /* JADX INFO: renamed from: e */
    public final lk0 f19887e;

    /* JADX INFO: renamed from: f */
    public final lm5 f19888f;

    public gm5(int i, lk0 lk0Var, lm5 lm5Var) {
        this.f19886d = i;
        this.f19887e = lk0Var;
        this.f19888f = lm5Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(this.f19886d);
        oh6.m9087L(parcel, 2, this.f19887e, i);
        oh6.m9087L(parcel, 3, this.f19888f, i);
        oh6.m9094S(parcel, iM9092Q);
    }
}
