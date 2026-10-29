package p000;

/* JADX INFO: renamed from: en */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0618en {
    /* JADX INFO: renamed from: b */
    void mo4826b(int i, Object obj);

    void clear();

    /* JADX INFO: renamed from: d */
    void mo4827d(Object obj);

    /* JADX INFO: renamed from: i */
    default void mo4829i() {
        Object objMo4832n = mo4832n();
        ph0 ph0Var = objMo4832n instanceof ph0 ? (ph0) objMo4832n : null;
        if (ph0Var != null) {
            ph0Var.mo3600a();
        }
    }

    /* JADX INFO: renamed from: j */
    void mo4830j(int i, Object obj);

    /* JADX INFO: renamed from: m */
    void mo4831m(int i, int i2, int i3);

    /* JADX INFO: renamed from: n */
    Object mo4832n();

    /* JADX INFO: renamed from: o */
    void mo4833o(int i, int i2);

    /* JADX INFO: renamed from: q */
    default void mo4834q(mq1 mq1Var, Object obj) {
        mq1Var.invoke(mo4832n(), obj);
    }

    /* JADX INFO: renamed from: u */
    void mo4835u();

    /* JADX INFO: renamed from: l */
    default void mo5208l() {
    }
}
