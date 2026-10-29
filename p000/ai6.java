package p000;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ai6 extends pt5 implements b66 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f14530a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oj6 f14531b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai6(oj6 oj6Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f14530a = atomicReference;
        this.f14531b = oj6Var;
    }

    @Override // p000.pt5
    /* JADX INFO: renamed from: E */
    public final boolean mo2994E(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ol6 ol6Var = (ol6) st5.m10912a(parcel, ol6.CREATOR);
        st5.m10915d(parcel);
        mo2995o(ol6Var);
        return true;
    }

    @Override // p000.b66
    /* JADX INFO: renamed from: o */
    public final void mo2995o(ol6 ol6Var) {
        AtomicReference atomicReference = this.f14530a;
        synchronized (atomicReference) {
            d76 d76Var = ((oa6) this.f14531b.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12505b(Integer.valueOf(ol6Var.f26869d.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(ol6Var);
            atomicReference.notifyAll();
        }
    }
}
