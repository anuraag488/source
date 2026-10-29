package p000;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lw0 implements jk2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24409a;

    /* JADX INFO: renamed from: b */
    public Object f24410b;

    /* JADX INFO: renamed from: c */
    public Object f24411c;

    public lw0(jw0 jw0Var, jk2 jk2Var) {
        this.f24409a = (byte) 0;
        this.f24410b = jw0Var;
        this.f24411c = jk2Var;
    }

    @Override // p000.jk2
    /* JADX INFO: renamed from: b */
    public final void mo3449b(lk2 lk2Var, ek2 ek2Var) {
        switch (this.f24409a) {
            case 0:
                jw0 jw0Var = (jw0) this.f24410b;
                switch (kw0.f23555a[ek2Var.ordinal()]) {
                    case 1:
                    case 4:
                        break;
                    case 2:
                        jw0Var.mo4241e();
                        break;
                    case 3:
                        jw0Var.onResume();
                        break;
                    case 5:
                        jw0Var.onStop();
                        break;
                    case 6:
                        jw0Var.onDestroy();
                        break;
                    case 7:
                        C1077qn.m9987m("ON_ANY must not been send by anybody");
                        break;
                    default:
                        C0670g.m5864c();
                        break;
                }
                jk2 jk2Var = (jk2) this.f24411c;
                if (jk2Var != null) {
                    jk2Var.mo3449b(lk2Var, ek2Var);
                }
                break;
            case 1:
                if (ek2Var == ek2.ON_START) {
                    ((gk2) this.f24410b).mo6017c(this);
                    ((yu3) this.f24411c).m13256d();
                }
                break;
            case 2:
                n33 n33Var = (n33) this.f24410b;
                int i = s33.f29855a[ek2Var.ordinal()];
                if (i == 1) {
                    n33Var.m8487h(true);
                    break;
                } else if (i == 2) {
                    n33Var.m8487h(false);
                    break;
                } else if (i == 3) {
                    n33Var.m4817f();
                    ((gk2) this.f24411c).mo6017c(this);
                    break;
                }
                break;
            default:
                t90 t90Var = (t90) this.f24411c;
                Object obj = this.f24410b;
                HashMap map = t90Var.f31006a;
                t90.m10994a((List) map.get(ek2Var), lk2Var, ek2Var, obj);
                t90.m10994a((List) map.get(ek2.ON_ANY), lk2Var, ek2Var, obj);
                break;
        }
    }

    public /* synthetic */ lw0(byte b) {
        this.f24409a = b;
    }
}
