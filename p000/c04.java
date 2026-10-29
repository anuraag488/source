package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class c04 {

    /* JADX INFO: renamed from: a */
    public static final zz3 f15738a = new zz3(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b */
    public static final int f15739b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference[] f15740c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f15739b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f15740c = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m3786a(zz3 zz3Var) {
        if (zz3Var.f36509f != null || zz3Var.f36510g != null) {
            C1077qn.m9987m("Failed requirement.");
            return;
        }
        if (zz3Var.f36507d) {
            return;
        }
        AtomicReference atomicReference = f15740c[(int) (Thread.currentThread().getId() & (((long) f15739b) - 1))];
        zz3 zz3Var2 = f15738a;
        zz3 zz3Var3 = (zz3) atomicReference.getAndSet(zz3Var2);
        if (zz3Var3 == zz3Var2) {
            return;
        }
        int i = zz3Var3 != null ? zz3Var3.f36506c : 0;
        if (i >= 65536) {
            atomicReference.set(zz3Var3);
            return;
        }
        zz3Var.f36509f = zz3Var3;
        zz3Var.f36505b = 0;
        zz3Var.f36506c = i + 8192;
        atomicReference.set(zz3Var);
    }

    /* JADX INFO: renamed from: b */
    public static final zz3 m3787b() {
        AtomicReference atomicReference = f15740c[(int) (Thread.currentThread().getId() & (((long) f15739b) - 1))];
        zz3 zz3Var = f15738a;
        zz3 zz3Var2 = (zz3) atomicReference.getAndSet(zz3Var);
        if (zz3Var2 == zz3Var) {
            return new zz3();
        }
        if (zz3Var2 == null) {
            atomicReference.set(null);
            return new zz3();
        }
        atomicReference.set(zz3Var2.f36509f);
        zz3Var2.f36509f = null;
        zz3Var2.f36506c = 0;
        return zz3Var2;
    }
}
