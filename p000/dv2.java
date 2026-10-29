package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dv2 extends zh0 {

    /* JADX INFO: renamed from: f */
    public lw2 f17425f;

    /* JADX INFO: renamed from: g */
    public ArrayList f17426g;

    /* JADX INFO: renamed from: h */
    public lw2 f17427h;

    /* JADX INFO: renamed from: i */
    public C1040pn f17428i;

    @Override // p000.zh0
    /* JADX INFO: renamed from: i */
    public final void mo4394i(y14 y14Var) {
        ArrayList arrayList = this.f17426g;
        bv2 bv2Var = new bv2();
        bv2Var.f15646a = y14Var;
        VarHandle.storeStoreFence();
        arrayList.add(bv2Var);
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: j */
    public final void mo4395j() {
        synchronized (this.f36084a) {
            try {
                ArrayList arrayList = this.f17426g;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    cv2 cv2Var = (cv2) arrayList.get(i);
                    if (cv2Var instanceof av2) {
                        dt0.m4713o(this.f17425f, ((av2) cv2Var).f14903a, ((av2) cv2Var).f14904b);
                    } else {
                        if (!(cv2Var instanceof bv2)) {
                            throw new gf0();
                        }
                        dt0.m4690S(this.f17425f, ((bv2) cv2Var).f15646a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f17426g.clear();
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: k */
    public final void mo4396k() {
        this.f17428i.m9573k();
        this.f17426g.clear();
        this.f17427h.m8126a();
        synchronized (this.f36084a) {
            this.f17425f.m8126a();
        }
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: o */
    public final yp1 mo4397o(y14 y14Var) {
        lw2 lw2Var = this.f17427h;
        yp1 yp1Var = (yp1) lw2Var.m8132g(y14Var);
        yp1 yp1Var2 = yp1Var;
        if (yp1Var == null) {
            na1 na1Var = new na1((byte) 13);
            na1Var.f25595b = this;
            na1Var.f25596c = y14Var;
            VarHandle.storeStoreFence();
            int iM8131f = lw2Var.m8131f(y14Var);
            if (iM8131f < 0) {
                iM8131f = ~iM8131f;
            }
            Object[] objArr = lw2Var.f24420c;
            Object obj = objArr[iM8131f];
            lw2Var.f24419b[iM8131f] = y14Var;
            objArr[iM8131f] = na1Var;
            yp1Var2 = na1Var;
        }
        return yp1Var2;
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: p */
    public final void mo4398p(b80 b80Var) {
        this.f17427h.m8136k(b80Var);
        mo4394i(b80Var);
        mo4395j();
    }

    /* JADX INFO: renamed from: u */
    public final void m4748u(y14 y14Var, Object obj) {
        ArrayList arrayList = this.f17426g;
        av2 av2Var = new av2();
        av2Var.f14903a = obj;
        av2Var.f14904b = y14Var;
        VarHandle.storeStoreFence();
        arrayList.add(av2Var);
    }
}
