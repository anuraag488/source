package p000;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k06 extends pt5 implements dy5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oz5 f22804a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k06(sz5 sz5Var, oz5 oz5Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f22804a = oz5Var;
    }

    @Override // p000.pt5
    /* JADX INFO: renamed from: E */
    public final boolean mo2994E(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo4801a();
        return true;
    }

    @Override // p000.dy5
    /* JADX INFO: renamed from: a */
    public final void mo4801a() {
        this.f22804a.run();
    }
}
