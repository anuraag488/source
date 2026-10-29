package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface g81 {
    /* JADX INFO: renamed from: B */
    void mo5916B(String str);

    /* JADX INFO: renamed from: C */
    void mo5917C(g24 g24Var, int i);

    /* JADX INFO: renamed from: a */
    si0 mo5918a(g24 g24Var);

    /* JADX INFO: renamed from: c */
    void mo5919c();

    /* JADX INFO: renamed from: d */
    default void mo5920d(jc2 jc2Var, Object obj) {
        jc2Var.mo14c(this, obj);
    }

    /* JADX INFO: renamed from: g */
    void mo5921g(double d);

    /* JADX INFO: renamed from: h */
    void mo5922h(short s);

    /* JADX INFO: renamed from: j */
    void mo5923j(byte b);

    /* JADX INFO: renamed from: k */
    void mo5924k(boolean z);

    /* JADX INFO: renamed from: l */
    g81 mo5925l(g24 g24Var);

    /* JADX INFO: renamed from: m */
    default void m5926m(jc2 jc2Var, Object obj) {
        if (jc2Var.mo15d().mo5887h()) {
            mo5920d(jc2Var, obj);
        } else if (obj == null) {
            mo5919c();
        } else {
            mo5920d(jc2Var, obj);
        }
    }

    /* JADX INFO: renamed from: p */
    void mo5927p(int i);

    /* JADX INFO: renamed from: t */
    void mo5928t(float f);

    /* JADX INFO: renamed from: v */
    void mo5929v(long j);

    /* JADX INFO: renamed from: x */
    void mo5930x(char c);
}
