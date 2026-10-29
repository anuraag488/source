package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ts4 extends of3 {

    /* JADX INFO: renamed from: a */
    public int[] f31386a;

    /* JADX INFO: renamed from: b */
    public int f31387b;

    @Override // p000.of3
    /* JADX INFO: renamed from: a */
    public final Object mo4730a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f31386a, this.f31387b);
        ss4 ss4Var = new ss4();
        ss4Var.f30546a = iArrCopyOf;
        VarHandle.storeStoreFence();
        return ss4Var;
    }

    @Override // p000.of3
    /* JADX INFO: renamed from: b */
    public final void mo4731b(int i) {
        int[] iArr = this.f31386a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f31386a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p000.of3
    /* JADX INFO: renamed from: d */
    public final int mo4732d() {
        return this.f31387b;
    }
}
