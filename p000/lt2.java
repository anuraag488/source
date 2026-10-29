package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface lt2 extends nt2 {
    @Override // p000.nt2
    /* JADX INFO: renamed from: a */
    default Object mo7628a(mq1 mq1Var, Object obj) {
        return mq1Var.invoke(obj, this);
    }

    @Override // p000.nt2
    /* JADX INFO: renamed from: b */
    default boolean mo7629b(yp1 yp1Var) {
        return ((Boolean) yp1Var.invoke(this)).booleanValue();
    }
}
