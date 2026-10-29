package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class os4 extends of3 {

    /* JADX INFO: renamed from: a */
    public byte[] f27063a;

    /* JADX INFO: renamed from: b */
    public int f27064b;

    @Override // p000.of3
    /* JADX INFO: renamed from: a */
    public final Object mo4730a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f27063a, this.f27064b);
        ns4 ns4Var = new ns4();
        ns4Var.f26071a = bArrCopyOf;
        VarHandle.storeStoreFence();
        return ns4Var;
    }

    @Override // p000.of3
    /* JADX INFO: renamed from: b */
    public final void mo4731b(int i) {
        byte[] bArr = this.f27063a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f27063a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // p000.of3
    /* JADX INFO: renamed from: d */
    public final int mo4732d() {
        return this.f27064b;
    }
}
