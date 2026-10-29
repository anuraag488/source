package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface di1 extends InterfaceC1407zj {
    @Override // p000.InterfaceC1407zj
    /* JADX INFO: renamed from: a */
    default yw4 mo4410a(sq4 sq4Var) {
        return new C1283w7(this);
    }

    /* JADX INFO: renamed from: b */
    float mo4508b(long j, float f, float f2, float f3);

    /* JADX INFO: renamed from: c */
    float mo4509c(long j, float f, float f2, float f3);

    /* JADX INFO: renamed from: d */
    long mo4510d(float f, float f2, float f3);

    /* JADX INFO: renamed from: e */
    default float mo4511e(float f, float f2, float f3) {
        return mo4509c(mo4510d(f, f2, f3), f, f2, f3);
    }
}
