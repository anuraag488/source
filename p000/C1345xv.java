package p000;

/* JADX INFO: renamed from: xv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1345xv {

    /* JADX INFO: renamed from: a */
    public final C1283w7 f34635a;

    /* JADX INFO: renamed from: b */
    public final t33 f34636b;

    public C1345xv(C1283w7 c1283w7, t33 t33Var) {
        this.f34635a = c1283w7;
        this.f34636b = t33Var;
        if ((c1283w7 == null ? t33Var : c1283w7) != null) {
            return;
        }
        C1077qn.m9987m("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m12759a(AbstractC0597e3 abstractC0597e3) {
        C1283w7 c1283w7 = this.f34635a;
        if (c1283w7 != null) {
            C1283w7.m12113e(c1283w7, (C1270vv) abstractC0597e3.f17657b);
            return;
        }
        t33 t33Var = this.f34636b;
        if (t33Var == null) {
            C1077qn.m9989o("Unreachable");
            return;
        }
        C1308wv c1308wv = (C1308wv) abstractC0597e3.f17656a;
        C1283w7.m12113e(t33Var.m10974b().f28978c, c1308wv.createNavigationEventHandler$activity(new p33(null, c1308wv)));
    }

    /* JADX INFO: renamed from: b */
    public final void m12760b(AbstractC0597e3 abstractC0597e3) throws Exception {
        if (this.f34635a != null) {
            ((C1270vv) abstractC0597e3.f17657b).m4817f();
        } else if (this.f34636b != null) {
            ((C1308wv) abstractC0597e3.f17656a).remove();
        } else {
            C1077qn.m9989o("Unreachable");
        }
    }
}
