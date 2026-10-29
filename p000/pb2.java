package p000;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pb2 extends ib2 {

    /* JADX INFO: renamed from: h */
    public String f27510h;

    /* JADX INFO: renamed from: i */
    public boolean f27511i;

    @Override // p000.ib2
    /* JADX INFO: renamed from: G */
    public final aa2 mo6722G() {
        return new va2((LinkedHashMap) this.f21250g);
    }

    @Override // p000.ib2
    /* JADX INFO: renamed from: J */
    public final void mo6725J(String str, aa2 aa2Var) {
        if (!this.f27511i) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f21250g;
            String str2 = this.f27510h;
            if (str2 == null) {
                z62.m13366Y("tag");
                throw null;
            }
            linkedHashMap.put(str2, aa2Var);
            this.f27511i = true;
            return;
        }
        if (aa2Var instanceof fb2) {
            this.f27510h = ((fb2) aa2Var).mo5629a();
            this.f27511i = false;
        } else {
            if (aa2Var instanceof va2) {
                throw kx5.m7696a(ya2.f35071b);
            }
            if (aa2Var instanceof n92) {
                throw kx5.m7696a(q92.f28322b);
            }
            C0670g.m5864c();
        }
    }
}
