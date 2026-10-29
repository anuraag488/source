package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c80 extends d80 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15863f = AtomicIntegerFieldUpdater.newUpdater(c80.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: d */
    public final b80 f15864d;

    /* JADX INFO: renamed from: e */
    public final boolean f15865e;

    public /* synthetic */ c80(b80 b80Var, boolean z) {
        this(b80Var, z, r71.f29063a, -3, y30.f34832a);
    }

    @Override // p000.d80
    /* JADX INFO: renamed from: b */
    public final String mo3885b() {
        return "channel=" + this.f15864d;
    }

    @Override // p000.d80
    /* JADX INFO: renamed from: c */
    public final Object mo3886c(mg3 mg3Var, wm0 wm0Var) throws Throwable {
        Object objM7391p = k43.m7391p(new z14(mg3Var), this.f15864d, this.f15865e, wm0Var);
        return objM7391p == ap0.f14763a ? objM7391p : ju4.f22634a;
    }

    @Override // p000.d80, p000.si1
    public final Object collect(ti1 ti1Var, wm0 wm0Var) throws Throwable {
        if (this.f16849b == -3) {
            boolean z = this.f15865e;
            if (z && f15863f.getAndSet(this, 1) == 1) {
                C1077qn.m9989o("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object objM7391p = k43.m7391p(ti1Var, this.f15864d, z, wm0Var);
            if (objM7391p == ap0.f14763a) {
                return objM7391p;
            }
        } else {
            Object objCollect = super.collect(ti1Var, wm0Var);
            if (objCollect == ap0.f14763a) {
                return objCollect;
            }
        }
        return ju4.f22634a;
    }

    @Override // p000.d80
    /* JADX INFO: renamed from: d */
    public final d80 mo3887d(ro0 ro0Var, int i, y30 y30Var) {
        return new c80(this.f15864d, this.f15865e, ro0Var, i, y30Var);
    }

    @Override // p000.d80
    /* JADX INFO: renamed from: g */
    public final si1 mo3888g() {
        return new c80(this.f15864d, this.f15865e);
    }

    @Override // p000.d80
    /* JADX INFO: renamed from: h */
    public final b80 mo3889h(zo0 zo0Var) {
        if (!this.f15865e || f15863f.getAndSet(this, 1) != 1) {
            return this.f16849b == -3 ? this.f15864d : super.mo3889h(zo0Var);
        }
        C1077qn.m9989o("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public c80(b80 b80Var, boolean z, ro0 ro0Var, int i, y30 y30Var) {
        super(ro0Var, i, y30Var);
        this.f15864d = b80Var;
        this.f15865e = z;
    }
}
