package p000;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class qn6 extends mh5 implements ap6 {
    public qn6() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", (byte) 5);
    }

    @Override // p000.mh5
    /* JADX INFO: renamed from: H */
    public final boolean mo8063H(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            mo3112a();
            return true;
        }
        vf6 vf6Var = (vf6) ov5.m9313a(parcel, vf6.CREATOR);
        ov5.m9315c(parcel);
        mo3113s(vf6Var);
        return true;
    }
}
