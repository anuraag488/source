package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mu1 extends uq4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25218a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ uq4 f25219b;

    public /* synthetic */ mu1(byte b) {
        this.f25218a = b;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        switch (this.f25218a) {
            case 0:
                return new AtomicLong(((Number) this.f25219b.mo166b(kb2Var)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                kb2Var.mo7490a();
                while (kb2Var.mo7501v()) {
                    arrayList.add(Long.valueOf(((Number) this.f25219b.mo166b(kb2Var)).longValue()));
                }
                kb2Var.mo7495j();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        switch (this.f25218a) {
            case 0:
                this.f25219b.mo167c(yb2Var, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                yb2Var.mo12206b();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.f25219b.mo167c(yb2Var, Long.valueOf(atomicLongArray.get(i)));
                }
                yb2Var.mo12208j();
                break;
        }
    }
}
