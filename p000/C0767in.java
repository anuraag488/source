package p000;

import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: renamed from: in */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0767in implements InterfaceC0804jn, InterfaceC0694gn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0694gn f21566a;

    /* JADX INFO: renamed from: b */
    public final df2 f21567b;

    public C0767in(InterfaceC0694gn interfaceC0694gn, df2 df2Var) {
        this.f21566a = interfaceC0694gn;
        this.f21567b = df2Var;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: A0 */
    public final float mo3572A0(float f) {
        return this.f21566a.mo3572A0(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: C */
    public final long mo3573C(float f) {
        return this.f21566a.mo3573C(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: D */
    public final long mo3574D(long j) {
        return this.f21566a.mo3574D(j);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: E */
    public final float mo3575E(float f) {
        return this.f21566a.mo3575E(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: O */
    public final float mo3577O(long j) {
        return this.f21566a.mo3577O(j);
    }

    @Override // p000.zq2
    /* JADX INFO: renamed from: T */
    public final yq2 mo3578T(int i, int i2, Map map, yp1 yp1Var, yp1 yp1Var2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            q32.m9721c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        C0731hn c0731hn = new C0731hn((byte) 0);
        c0731hn.f20708b = i;
        c0731hn.f20709c = i2;
        c0731hn.f20710d = map;
        c0731hn.f20711e = yp1Var;
        VarHandle.storeStoreFence();
        return c0731hn;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: U */
    public final int mo3579U(float f) {
        return this.f21566a.mo3579U(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return this.f21566a.mo3580c();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c0 */
    public final long mo3581c0(long j) {
        return this.f21566a.mo3581c0(j);
    }

    @Override // p000.s62
    public final df2 getLayoutDirection() {
        return this.f21567b;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: h0 */
    public final float mo3582h0(long j) {
        return this.f21566a.mo3582h0(j);
    }

    @Override // p000.InterfaceC0694gn
    /* JADX INFO: renamed from: i */
    public final long mo6044i() {
        return this.f21566a.mo6044i();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: o0 */
    public final long mo3584o0(float f) {
        return this.f21566a.mo3584o0(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return this.f21566a.mo3585r();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: w0 */
    public final float mo3586w0(int i) {
        return this.f21566a.mo3586w0(i);
    }

    @Override // p000.s62
    /* JADX INFO: renamed from: z */
    public final boolean mo3587z() {
        return this.f21566a.mo3587z();
    }
}
