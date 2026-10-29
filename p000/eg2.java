package p000;

import java.lang.invoke.VarHandle;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eg2 implements fe4 {

    /* JADX INFO: renamed from: a */
    public df2 f18068a;

    /* JADX INFO: renamed from: b */
    public float f18069b;

    /* JADX INFO: renamed from: c */
    public float f18070c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ jg2 f18071d;

    @Override // p000.fe4
    /* JADX INFO: renamed from: L */
    public final List mo3576L(mq1 mq1Var, Object obj) {
        jg2 jg2Var = this.f18071d;
        jg2Var.m7096i();
        wf2 wf2Var = jg2Var.f22230a;
        sf2 sf2Var = wf2Var.f33300H.f14471d;
        sf2 sf2Var2 = sf2.f30226a;
        if (sf2Var != sf2Var2 && sf2Var != sf2.f30228c && sf2Var != sf2.f30227b && sf2Var != sf2.f30229d) {
            q32.m9721c("subcompose can only be used inside the measure or layout blocks");
        }
        lw2 lw2Var = jg2Var.f22236g;
        Object objM8132g = lw2Var.m8132g(obj);
        if (objM8132g == null) {
            objM8132g = (wf2) jg2Var.f22239j.m8136k(obj);
            if (objM8132g != null) {
                if (jg2Var.f22244o <= 0) {
                    q32.m9721c("Check failed.");
                }
                jg2Var.f22244o--;
            } else {
                objM8132g = jg2Var.m7102o(obj);
                if (objM8132g == null) {
                    int i = jg2Var.f22233d;
                    wf2 wf2Var2 = new wf2(2);
                    wf2Var.f33328r = true;
                    wf2Var.m12250C(i, wf2Var2);
                    wf2Var.f33328r = false;
                    objM8132g = wf2Var2;
                }
            }
            lw2Var.m8138m(obj, objM8132g);
        }
        wf2 wf2Var3 = (wf2) objM8132g;
        if (hb0.m6302N0(wf2Var.m12289p(), jg2Var.f22233d) != wf2Var3) {
            int iM11670j = ((uw2) ((aw2) wf2Var.m12289p()).f14915b).m11670j(wf2Var3);
            if (iM11670j < jg2Var.f22233d) {
                q32.m9719a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = jg2Var.f22233d;
            if (i2 != iM11670j) {
                jg2Var.m7098k(iM11670j, i2);
            }
        }
        jg2Var.f22233d++;
        jg2Var.m7101n(wf2Var3, obj, false, mq1Var);
        return (sf2Var == sf2Var2 || sf2Var == sf2.f30228c) ? wf2Var3.m12287n() : wf2Var3.m12286m();
    }

    @Override // p000.zq2
    /* JADX INFO: renamed from: T */
    public final yq2 mo3578T(int i, int i2, Map map, yp1 yp1Var, yp1 yp1Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            q32.m9721c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        jg2 jg2Var = this.f18071d;
        dg2 dg2Var = new dg2();
        dg2Var.f17030a = i;
        dg2Var.f17031b = i2;
        dg2Var.f17032c = map;
        dg2Var.f17033d = yp1Var;
        dg2Var.f17034e = this;
        dg2Var.f17035f = jg2Var;
        dg2Var.f17036g = yp1Var2;
        VarHandle.storeStoreFence();
        return dg2Var;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return this.f18069b;
    }

    @Override // p000.s62
    public final df2 getLayoutDirection() {
        return this.f18068a;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return this.f18070c;
    }

    @Override // p000.s62
    /* JADX INFO: renamed from: z */
    public final boolean mo3587z() {
        sf2 sf2Var = this.f18071d.f22230a.f33300H.f14471d;
        return sf2Var == sf2.f30229d || sf2Var == sf2.f30227b;
    }
}
