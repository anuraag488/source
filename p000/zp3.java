package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zp3 implements ti1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ml3 f36247a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C1366yf f36248b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ArrayList f36249c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ql3 f36250d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ zo0 f36251e;

    @Override // p000.ti1
    public final Object emit(Object obj, wm0 wm0Var) {
        zo0 zo0Var = this.f36251e;
        c62 c62Var = (c62) obj;
        ql3 ql3Var = this.f36250d;
        C1366yf c1366yf = this.f36248b;
        ArrayList arrayList = this.f36249c;
        ml3 ml3Var = this.f36247a;
        if (c62Var instanceof hf3) {
            if (c1366yf.f35181s) {
                c1366yf.m13110P0((hf3) c62Var);
            } else {
                c1366yf.f35182t.m4200a(c62Var);
            }
        }
        boolean z = c62Var instanceof mx1;
        ju4 ju4Var = ju4.f22634a;
        if (z) {
            arrayList.add(c62Var);
        } else if (c62Var instanceof nx1) {
            arrayList.remove(((nx1) c62Var).f26162a);
        } else if (c62Var instanceof rk1) {
            arrayList.add(c62Var);
            ml3Var.f25002a = true;
        } else if (c62Var instanceof sk1) {
            arrayList.remove(((sk1) c62Var).f30352a);
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    ml3Var.f25002a = false;
                    break;
                }
                if (((c62) arrayList.get(i)) instanceof rk1) {
                    break;
                }
                i++;
            }
        } else if (c62Var instanceof x21) {
            arrayList.add(c62Var);
        } else {
            if (!(c62Var instanceof y21)) {
                if (c62Var instanceof w21) {
                    arrayList.remove(((w21) c62Var).f33036a);
                }
                return ju4Var;
            }
            arrayList.remove(((y21) c62Var).f34820a);
        }
        c62 c62Var2 = (c62) hb0.m6307S0(arrayList);
        iq3 iq3VarM13109O0 = c1366yf.m13109O0(false);
        if (!z62.m13387o(ql3Var.f28555a, c62Var2)) {
            if (c62Var2 != null) {
                boolean z2 = c62Var2 instanceof mx1;
                float f = 0.0f;
                if (z2) {
                    fq3 fq3Var = iq3VarM13109O0.f21641f;
                    if (fq3Var instanceof eq3) {
                        f = ((eq3) fq3Var).f18374a;
                    }
                } else if (c62Var2 instanceof rk1) {
                    dq3 dq3Var = iq3VarM13109O0.f21640e;
                    if (dq3Var instanceof cq3) {
                        f = ((cq3) dq3Var).f16375a;
                    }
                } else if (c62Var2 instanceof x21) {
                    bq3 bq3Var = iq3VarM13109O0.f21642g;
                    if (bq3Var instanceof aq3) {
                        f = ((aq3) bq3Var).f14777a;
                    }
                }
                rq4 rq4Var = wp3.f33579a;
                if (!z2 && ((c62Var2 instanceof rk1) || (c62Var2 instanceof x21))) {
                    rq4Var = new rq4(45, 0, h51.f20398c);
                }
                lb5.m7910S(zo0Var, null, null, new iy2(c1366yf, f, rq4Var, null, (byte) 1), 3);
            } else {
                c62 c62Var3 = (c62) ql3Var.f28555a;
                rq4 rq4Var2 = wp3.f33579a;
                if (!(c62Var3 instanceof mx1) && !(c62Var3 instanceof rk1) && (c62Var3 instanceof x21)) {
                    rq4Var2 = new rq4(150, 0, h51.f20398c);
                }
                lb5.m7910S(zo0Var, null, null, new it1(c1366yf, rq4Var2, (wm0) null, (byte) 21), 3);
            }
            if (c62Var instanceof tk1) {
                lb5.m7910S(zo0Var, null, null, new C0982og(c1366yf, (wm0) null, (byte) 21), 3);
            }
            ql3Var.f28555a = c62Var2;
        }
        return ju4Var;
    }
}
