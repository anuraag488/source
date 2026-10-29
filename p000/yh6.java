package p000;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yh6 extends pt5 implements x56 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f35231a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh6(oj6 oj6Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f35231a = atomicReference;
    }

    @Override // p000.pt5
    /* JADX INFO: renamed from: E */
    public final boolean mo2994E(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(cl6.CREATOR);
        st5.m10915d(parcel);
        mo10982t(arrayListCreateTypedArrayList);
        return true;
    }

    @Override // p000.x56
    /* JADX INFO: renamed from: t */
    public final void mo10982t(List list) {
        AtomicReference atomicReference = this.f35231a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
