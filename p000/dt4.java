package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dt4 extends of3 {

    /* JADX INFO: renamed from: a */
    public short[] f17379a;

    /* JADX INFO: renamed from: b */
    public int f17380b;

    @Override // p000.of3
    /* JADX INFO: renamed from: a */
    public final Object mo4730a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f17379a, this.f17380b);
        ct4 ct4Var = new ct4();
        ct4Var.f16465a = sArrCopyOf;
        VarHandle.storeStoreFence();
        return ct4Var;
    }

    @Override // p000.of3
    /* JADX INFO: renamed from: b */
    public final void mo4731b(int i) {
        short[] sArr = this.f17379a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f17379a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // p000.of3
    /* JADX INFO: renamed from: d */
    public final int mo4732d() {
        return this.f17380b;
    }
}
